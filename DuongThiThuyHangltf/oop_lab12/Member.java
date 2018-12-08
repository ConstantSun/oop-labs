/**@author: Duong THi Thuy Hang
 * @version: 0.1
 * since: 27th Nov 2018
 */
import java.util.ArrayList;

public class Member
{
    private  String dateOfBirth;
    private String gender;
    private String name;
    private Member partner;
    private ArrayList<Member> childrenList = new ArrayList<Member>();
    boolean isMarried ;
    public int level = 1 ;

    /**
     *
     * @param c
     */
    public void addChild(Member ... c)
    {
        if(isMarried)
            for (int i = 0; i <c.length ; i++) {
                childrenList.add(c[i]);
                partner.childrenList.add(c[i]);
            }
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Member getPartner() {
        return partner;
    }

    public void setPartner(Member partner) {
        this.partner = partner;
        partner.partner = this;
        partner.isMarried = true ;
        isMarried = true;
    }

    public ArrayList<Member> getChildren() {
        return childrenList;
    }

    public void setChildren(ArrayList<Member> children) {
        this.childrenList = children;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public Member(){};

    public Member(String name , String dateOfBirth, String gender) {
        this.name = name ;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public void printLonelyMember(){
        if (!isMarried)
            System.out.println(name);
        for (int i = 0; i < childrenList.size(); i++) {
            if(childrenList.get(i).isMarried == false){
                System.out.print(childrenList.get(i).getName()+ ", ");
            }
            else
                childrenList.get(i).printLonelyMember();
        }
    }

    public void printCoupleWith2Children(){
        if (childrenList.size() == 2){
            System.out.println("\nCouple: "+ name + ", "+ partner.getName());
        }
        for (int i = 0; i < childrenList.size(); i++) {
            childrenList.get(i).printCoupleWith2Children();
        }
    }

    public static int max = 1;
    public void setFamilyLevel()
    {
        for (int i = 0; i <childrenList.size() ; i++) {
            childrenList.get(i).level = level +1;
            if(childrenList.get(i).level>max){
                max = childrenList.get(i).level;
            }
            childrenList.get(i).setFamilyLevel();
        }
    }

    public void printNewestGeneration()
    {
        if (max == level && level == 1)
            System.out.println(name + " ");
        for (int i = 0; i <childrenList.size() ; i++)
        {
            if (max == childrenList.get(i).level) {
                System.out.println(childrenList.get(i).getName());
            }
            childrenList.get(i).printNewestGeneration();
        }
    }


    @Override
    public String toString() {
        String info = "name = " + name + " , dateOfBirth = " + dateOfBirth + ", gender= " + gender +  ", isMarried=" + isMarried + ", level = " + level;
        if (partner != null) info += (", partner=" + partner.getName() + "\n");
        if (childrenList.size()!=0) info += (name +"'s children:\n" + childrenList.toString() +"\n" );
        return info;
    }
}

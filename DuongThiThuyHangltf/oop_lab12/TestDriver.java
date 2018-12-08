/**@author: Duong THi Thuy Hang
 * @version: 0.1
 * since: 27th Nov 2018
 */

public class TestDriver
{
    public static void main(String[] args)
    {
        Member memberJame = new Member("Jame", "12/03/1990", "male");
        Member memberHana = new Member("Hana", "12/09/1991", "female");
        memberJame.setPartner(memberHana);

        Member memberRyan = new Member("Ryan", "12/03/2006", "male");
        Member memberKai = new Member("Kai", "12/03/2006", "male");

        memberJame.addChild(memberKai,memberRyan);

        Member memberJanifer = new Member("Janifer", "12/03/2007", "female");
        memberJanifer.setPartner(memberKai);

        Member memberJasmine = new Member("Jasmine", "12/03/2027", "female");
        Member memberLaura = new Member("Laura", "12/03/2027", "female");
        Member memberJimmy = new Member("Jimmy", "12/03/2027", "male");
        Member memberJordan = new Member("Jordan", "12/03/2027", "male");
        memberJanifer.addChild(memberJasmine,memberLaura,memberJimmy,memberJordan);
        System.out.println(memberHana.toString());

        memberJame.printLonelyMember();

        memberJame.printCoupleWith2Children();

        memberJame.setFamilyLevel();
        memberJame.printNewestGeneration();

    }

}

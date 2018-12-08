/** @author Duong Thi Thuy Hang
 * since 6th Nov 2018
 * version 0.1
 */


import java.io.*;

import java.util.*;


public class Utils
{
//    public static String readContentFromFile(String path){
//        FileInputStream in = null;
//        String s = "";
//        try
//        {
//            in = new FileInputStream(path);
//            int c;
//            while ((c = in.read()) != -1) {
//                s+=(char)c;
//            }
//            in.close();
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        return s;
//    }

    /**
     *
     * @param path
     */
//    public static void writeContentToFile(String path) {
//        FileOutputStream fout = null;
//        try
//        {
//            fout = new FileOutputStream(path);
//            String s = "one two three ... " ;
//            byte b[] = s.getBytes(); // convert string to byte.
//            fout.write(b);
//            fout.close();
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//    }

    /**
     *
     * @param path
     */
//    public static void appendContentToFile(String path) {
//        FileOutputStream fout = null;
//        try
//        {
//            fout = new FileOutputStream(path,true);
//            String s = "four five six ... " ;
//            byte b[] = s.getBytes(); // convert string to byte.
//            fout.write(b,0,s.length());
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            try{
//                fout.close();
//            }
//            catch (IOException e){
//                System.out.println(e.getMessage());
//            }
//        }
//    }

    /**
     *
     * @param folderPath
     * @param fileName
     * @return
     */
//    public static File findFileByName(String folderPath, String fileName){
//        File result = null;
//
//        try{
//            File dir = new File(folderPath);
//            if(dir.isDirectory()){
//                for (int i = 0; i < dir.list().length ; i++) {
//                    //System.out.println(dir.list()[i]);
//                    if(dir.list()[i].equals(fileName))
//                    {
//                        result = new File(fileName);
//                    }
//                }
//            }
//
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        return result;
//    }

    private static String getStatic(String s){
        int i = 0;
        int count = 0,mark = 0;
        while(i<s.length())
        {
            if(s.charAt(i)=='{'){
                count++;
                mark = 1 ;
            }
            if(s.charAt(i)=='}'){
                count--;
            }
            if(count==0 && mark ==1){
                return s.substring(0,i+1);
            }
            i++;
        }
        return "";
    }

    public static void getAllFunctions(File path)
    {
        ArrayList<String> function = new ArrayList<>();
        try{
            FileReader reader = new FileReader(path);
            int c;
            String src="";
            while((c = reader.read())!=-1){
                src+=(char)c;
            }
            int i=0;

            while(i+6 < src.length()){

                if(src.substring(i,i+7).equals("static ")){   // static Student a ;( = new ..)
                                                                // static String fun( ) {}
                                                                // static { } (static block)
                    int mark = i;
                    i=i+6;

                    while(src.charAt(i)==' ')i++; // tai i dang tro den kieu tra ve/ {: block
                    if(src.charAt(i)=='{') { // static block
                        continue;
                    }
                    //System.out.println(src.charAt(i)+" tro den kieu tra ve.");

                    while(src.charAt(i)!=' ')i++; // tai i dang tro den dau cach, truoc ten ham/bien
                    //System.out.println(src.charAt(i)+" tro den dau cach, truoc ten ham/bien");

                    while(src.charAt(i)==' ')i++; // tai i dang tro den ten ham/bien
                    //System.out.println(src.charAt(i)+" tro den ten ham/bien.");
                    //mark = false;
                    i++;
                    while(true){
                        if(src.charAt(i)=='('){
                            //System.out.println( src.charAt(i) +"dang tro den dau '('");
                            function.add(getStatic(src.substring(mark, src.length() )));
                            break;
                        }
                        else if(src.charAt(i)=='='||src.charAt(i)==';'){ //case: static variable
                            //System.out.println( "co dau = | ; _" +  (char)src.charAt(i)+(char)src.charAt(i+1)+(char)src.charAt(i+3)+"_");
                            break;
                        }
                        i++;
                    }
                }
                i++;
            }
            System.out.println( "KET QUA : \n\n" + function);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


    static String  getName(String s){
        String re = "";
        int i=0;
        while(s.charAt(i)!='('){
            re+=(char)s.charAt(i);
            i++;
        }
        return re;
    }

    static boolean  compare2Lists(ArrayList<String>a ,ArrayList<String> b){
        if(a.size()!=b.size()) return false;
        for (int i = 0; i <a.size() ; i++) {
            if(!a.get(i).equals(b.get(i))) return false;
        }
        return true;
    }




    static boolean  include(String line, String name){
        line = line.trim();
        if(line.length()< 3 ) return false;
        if ( line.substring(0,2).equals("//")|| line.substring(0,2).equals("/*") ) return false;
        if(!(line.contains(" " + getName(name)+" ") || line.contains(" " +getName(name)+"(") ) ) return false;
        // public static File findFileByName(String folderPath,int x, String fileName )
        // tách các thành phần trong dấu () ra bởi dấu phẩy

        //System.out.println("da thay:\n" + line);

        String[] tok = line.substring(line.indexOf("(")+1, line.indexOf(")")).split(",");
        ArrayList<String> token = new ArrayList<>();

        for (int i = 0; i < tok.length; i++) {
            tok[i]= tok[i].trim();
            String[] piece = tok[i].split(" ");
            token.add(piece[0].trim());
            //System.out.println("token = " + token.get(i));
        }
        // được array list token chứa kiểu của biến trong dòng line.

        String[] tok2 = name.substring(name.indexOf("(")+1, name.indexOf(")")).split(",");
        ArrayList<String> token2 = new ArrayList<>();
        for (int i = 0; i < tok2.length; i++) {
            String[] piece = tok2[i].split(" ");
            token2.add(piece[0].trim());
        }
        // token2 chứa kiểu của biến trong dòng name.

        if(!compare2Lists(token,token2)) return false;
        return true;
    }



    public static String findFunctionByName(String name){
        try {
            Scanner in = new Scanner(new File("/home/hang/Documents/w9/duonghang.txt"));
            String src = "";
            while(in.hasNext()){
                String line = in.nextLine();
                //System.out.println(line);

                if(include(line,name))
                {
                    src+= line;
                    int c = 0, mark = 0;
                    if(line.contains("{")) c++;
                    while (in.hasNext()){
                        line = in.nextLine();
                        for (int i = 0; i <line.length() ; i++) {
                            if(mark==1 && c==0)
                            {
                                return src;
                            }
                            src+=line.charAt(i);

                            if(line.charAt(i)=='{'){
                                c++;
                                mark = 1;
                            }
                            if(line.charAt(i)=='}')c--;
                        }
                        src+="\n";
                    }
                }
            }

        }
        catch (FileNotFoundException e){
            System.out.println("ko tim thay file" + e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    return "FileNotFound";
    }

    public static void sortRealNum(){
        int n = 1000;
        double a[] = new double[n];
        for (int i = 0; i < n ; i++) {
            a[i] = Math.random()/ Math.random() ;
            //System.out.println(a[i]);
        }
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(a[i]>a[j]){
                    double t = a[i] ; a[i] = a[j] ; a[j] = t;
                }
            }
        }

    }
    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        try{
//            String s = readContentFromFile("/home/hang/Documents/w9/util.txt");
//            System.out.println(s);
//            writeContentToFile("/home/hang/Documents/w9/duonghang.txt");
//            appendContentToFile("/home/hang/Documents/w9/duonghang.txt");
//
//            System.out.println(findFileByName("../","documents_draft.txt").getAbsolutePath() );


//            String str4 = new String("Books");
//            System.out.println(str4.substring());
            //sortRealNum();

            File file = new File("duonghang.txt");
            getAllFunctions(file);

            String name = "hello(String,int,double)";
            System.out.println("find function by name 1 \n" + findFunctionByName(name));

            name = " hello1(String,Integer,double)";
            System.out.println("find function by name 2 \n" + findFunctionByName(name));
        }
       catch (Exception e){
            System.out.println("main error" + e.getCause());
       }
    }
}

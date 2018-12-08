public class ExpressionTest {
    public  static void main(String[] args)
    {
        //qs2:
//        Numeral n1 = new Numeral(10);
//        Numeral n2 = new Numeral(-1);
//        Numeral n3 = new Numeral(2*3);
//        Square s1 = new Square(n1);
//        Addition addition1 = new Addition(s1,n2);
//        Addition addition2 = new Addition(addition1,n3);
//        Square s2 = new Square(addition2);
//        System.out.println( s2.toString() + " = " + s2.evaluate());

        // (10^2 - 1 + 2*3)^2
        //qs3:
        try {
            Numeral numeral1 = new Numeral(10);
            Numeral numeral2 = new Numeral(1);
            Numeral numeral3 = new Numeral(2);
            Numeral numeral4= new Numeral(0);

            Square square1 = new Square(numeral1);
            Subtraction subtraction1 = new Subtraction(square1,numeral2);
            Multiplication multiplication1 = new Multiplication(numeral3,numeral4);
            Addition addition1 = new Addition(subtraction1,multiplication1) ;
            Square square2 = new Square(addition1);
            System.out.println( square2.toString() + " = " + square2.evaluate() );
            Division division = new Division(numeral3,numeral4);
            System.out.println(division.evaluate());
        }
       catch (ArithmeticException e)
       {
            System.out.println(e.getMessage());
       }
    }
}

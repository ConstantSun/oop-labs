public class test {

    public static void isTheSame(Shape s1, Shape s2){
        if(s1 instanceof Square && s2 instanceof Square){
            System.out.println("instance of Square");
        }
    }

    public static void main(String[] args){
        Shape sh1 = new Shape();
        Rectangle rec1 = new Rectangle();
        Square sq1 = new Square();
        Square sq2 = new Square();

        Shape sh2 = rec1;
        Shape sh3 = sq1;

        isTheSame(sq1,sq2);
        //System.out.println(sq1 instanceof Shape );
        //System.out.println( sh3.getClass() );
        //((Square) sh3).setSide(5);


//        System.out.println(rec1.getPerimeter());
//
//        System.out.println( rec1 instanceof Shape );
//
//        System.out.println( sq1 instanceof Shape );
    }
}

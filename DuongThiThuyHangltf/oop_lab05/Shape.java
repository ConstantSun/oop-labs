/**@author Duong Thi Thuy Hang
 * @since   2nd 10 2019
 * @version  0.1
 */


/**
 * @param color, filled
 * @method getter ,setter, toString
 */
class Shape {
    protected String color;
    protected boolean filled;

    /**
     * constructor
     */
    public  Shape() {
        this.color = "red";
        this.filled = true;
    }

    /**
     * constructor
     * @param color
     * @param filled
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}


/**
 * @param color, filled, PI, radius
 * @method constructor, getter,setter, getArea, getPerimeter, toString
 */
class Circle extends Shape {
    private final double PI = 3.1415926;
    private  double radius;
    public Circle(){};

    public  Circle( double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return area
     */
    public double getArea(){
        return PI*radius*radius;
    }

    /**
     *
     * @return perimeter
     */
    public double getPerimeter(){
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                ", area=" + getArea()+
                ", p= " + getPerimeter()+
                '}';
    }
}


/**
 * @param color, filled, width, length
 * @method constructor, getter,setter, getArea, getPerimeter
 */
class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;

    public Rectangle(){};

    /**
     * constructor
     * @param width
     * @param length
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * constructor
     * @param color
     * @param filled
     * @param width
     * @param length
     */
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     *
     * @return area
     */
    public double getArea(){
        return width*length;
    }

    /**
     *
     * @return perimeter
     */
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}

/**
 * @param filled,color, width, length, side
 * @method constructor, getter,setter, getArea, getPerimeter ,toString
 */
class Square extends Rectangle {
    private double side;

    public Square(){};

    /**
     * constructor
     * @param side
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * constructor
     * @param color
     * @param filled
     * @param side
     */
    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = true;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(){
        super.setWidth(side);
    }

    public void setLength(){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                '}';
    }
}

public class Week5Exer2 {
    public static void  main(String[] args)
    {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();


        System.out.println(shape.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
    }

}
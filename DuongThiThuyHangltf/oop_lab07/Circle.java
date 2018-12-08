/** @author Duong Thi Thuy Hang
 * since 15th OCt 2018
 * version 0.1
 */

/**
 * @param color, filled, PI, radius
 * @method constructor, getter,setter, getArea, getPerimeter, toString
 */
public class Circle extends Shape {
    private final double PI = 3.1415926;
    private  double radius;
    public Circle(){};

    public  Circle( double radius) {
        this.radius = radius;
    }

    /**
     *
     * @param color
     * @param filled
     * @param positionX
     * @param positionY
     * @param radius
     */
    public Circle(String color, boolean filled, int positionX, int positionY, double radius) {
        super(color, filled, positionX, positionY);
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

    public boolean isTheSameTo(Circle c){
        return ( positionX==c.getPositionX() && positionY==c.getPositionY() && radius == c.getRadius()  );
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

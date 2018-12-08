/** @author Duong Thi Thuy Hang
 * since 9th OCt 2018
 * version 0.1
 */
/**
 * @param color, filled, width, length
 * @method constructor, getter,setter, getArea, getPerimeter
 */
public class Rectangle extends Shape {
    protected double width=1.0;
    protected double length=1.0;

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
     *
     * @param color
     * @param filled
     * @param positionX
     * @param positionY
     * @param width
     * @param length
     */
    public Rectangle(String color, boolean filled, int positionX, int positionY, double width, double length) {
        super(color, filled, positionX, positionY);
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

    public boolean isTheSameTo(Rectangle r){
        return ( positionX==r.getPositionX() && positionY==r.getPositionY() && length == r.getLength() && width == r.getWidth() );
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
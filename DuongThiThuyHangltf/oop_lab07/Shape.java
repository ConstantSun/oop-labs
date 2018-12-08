/** @author Duong Thi Thuy Hang
 * since 9th OCt 2018
 * version 0.1
 */
/**
 * @param color, filled
 * @method getter ,setter, toString
 */

public class Shape {


    protected String color;
    protected boolean filled;
    protected int positionX;
    protected int positionY;

    /**
     * constructor
     */
    public  Shape() {
        this.color = "red";
        this.filled = true;
        positionX = 0;
        positionY = 0;
    }



    /**
     * constructor
     * @param color
     * @param filled
     */
    public Shape(String color, boolean filled, int positionX, int positionY) {
        this.color = color;
        this.filled = filled;
        this.positionX = positionX;
        this.positionY = positionY;
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

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void moveRight(int pixel){
        positionX+=pixel;
    }

    public void moveBelow(int pixel){
        positionY+=pixel;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
/** @author Duong Thi Thuy Hang
 * since 9th OCt 2018
 * version 0.1
 */
public class Triangle extends Shape {
    private double side1,side2,side3;

    /**
     *
     * @param color
     * @param filled
     * @param positionX
     * @param positionY
     * @param side1
     * @param side2
     * @param side3
     */
    public Triangle(String color, boolean filled, int positionX, int positionY, double side1, double side2, double side3) {
        super(color, filled, positionX, positionY);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public boolean isTheSameTo(Triangle t){
        return ( positionX==t.getPositionX() && positionY==t.getPositionY() && side1== t.getSide1() && side2 == t.getSide2() && side3==t.getSide3());
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}

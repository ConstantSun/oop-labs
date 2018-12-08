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
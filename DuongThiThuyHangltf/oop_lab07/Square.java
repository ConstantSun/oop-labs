/** @author Duong Thi Thuy Hang
 * since 9th OCt 2018
 * version 0.1
 */

/**
 * @param filled,color, width, length, side
 * @method constructor, getter,setter, getArea, getPerimeter ,toString
 */
public class Square extends Rectangle {

    public Square(){};

    /**
     *
     * @param color
     * @param filled
     * @param positionX
     * @param positionY
     * @param side
     */
    public Square(String color, boolean filled, int positionX, int positionY, double side) {
        super(color, filled, positionX, positionY, side, side);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        length = width = side ;
    }

    public double getArea(){
        return 3.14*getSide()*getSide();
    }

    public boolean isTheSameTo(Square s){
        return ( positionX==s.getPositionX() && positionY==s.getPositionY() && getSide() == s.getSide() );
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + getSide() +
                '}';
    }
}

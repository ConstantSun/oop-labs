/** @author Duong Thi Thuy Hang
 * since 9th OCt 2018
 * version 0.1
 */
public class Hexagon extends Shape {
    private double edge;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public Hexagon() {
    };

    public Hexagon(String color, boolean filled, int positionX, int positionY, double edge) {
        super(color, filled, positionX, positionY);
        this.edge = edge;
    }
    public boolean isTheSameTo(Hexagon h){
        return ( positionX==h.getPositionX() && positionY==h.getPositionY() && edge == h.getEdge() );
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "edge=" + edge +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}

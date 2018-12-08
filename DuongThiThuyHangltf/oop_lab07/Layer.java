/** @author Duong Thi Thuy Hang
 * since 15th OCt 2018
 * version 0.1
 */
import java.util.ArrayList;

public class Layer
{
    protected ArrayList<Shape> shapeList = new ArrayList<>();
    private boolean visible ;
    private String type = "shape";

    public String getType()
    {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public void printShapeList(){
        for(int i=0;i<shapeList.size();i++){
            System.out.println(shapeList.get(i));
        }
    }


    public void addShape(Shape shape){
        shapeList.add(shape);
    }

    public void deleteTriangle(){ // 0 1 2 3
        int i=0;
        while(i!=shapeList.size()){
            if( shapeList.get(i) instanceof Triangle  ){
                shapeList.remove(shapeList.get(i));
            }
            else
                i++;
        }
    }

    public void deleteCircle(){ // 0 1 2 3
        int i=0;
        while(i!=shapeList.size()){
            if( shapeList.get(i) instanceof Circle  ){
                shapeList.remove(shapeList.get(i));
            }
            else
                i++;
        }
    }
    private boolean isTheSameShape(Shape s1, Shape s2)
    {
        if (s1 instanceof Circle && s2 instanceof Circle){
            return ((Circle) s1).isTheSameTo((Circle) s2);
        }
        if(s1 instanceof Hexagon && s2 instanceof Hexagon){
            return (((Hexagon) s1).isTheSameTo((Hexagon)s2));
        }

        if (s1 instanceof Rectangle && s2 instanceof Rectangle){
           return ( ((Rectangle) s1).isTheSameTo((Rectangle)s2) ) ;
        }

        if (s1 instanceof Square && s2 instanceof Square)
        {
            return ((Square)s1).isTheSameTo((Square)s2);
        }
        if (s1 instanceof  Triangle && s2 instanceof Triangle) {
            return ((Triangle) s1).isTheSameTo( (Triangle)s2 );
        }
        return false;
    }

    public void deleteSameShapes()
    {
        int i=0,j=0;
        while (i<shapeList.size())
        {
            j=i+1;
            while (j<shapeList.size())
            {
                if ( isTheSameShape(shapeList.get(i),shapeList.get(j)) )
                {
                    shapeList.remove(j);
                }
                else  j++;
            }
            i++;
        }
    }

    public ArrayList<Circle> getCircleList()
    {
        ArrayList<Circle> circleArrayList = new ArrayList<Circle>();
        for (int i = 0; i < shapeList.size() ; i++)
        {
            if(shapeList.get(i) instanceof Circle)
            {
                circleArrayList.add((Circle)(shapeList.get(i)));
            }
        }
        return  circleArrayList;
    }


    public ArrayList<Hexagon> getHexagonList()
    {
        ArrayList<Hexagon> hexagonArrayList = new ArrayList<Hexagon>();
        for (int i = 0; i < shapeList.size() ; i++)
        {
            if(shapeList.get(i) instanceof Hexagon)
            {
                hexagonArrayList.add( (Hexagon)(shapeList.get(i)) );
            }
        }
        return  hexagonArrayList;
    }


    public ArrayList<Rectangle> getRectangleList()
    {
        ArrayList<Rectangle> rectangleArrayList = new ArrayList<Rectangle>();
        for (int i = 0; i < shapeList.size() ; i++)
        {
            if(shapeList.get(i) instanceof Rectangle && !(shapeList.get(i) instanceof Square ) )
            {
                rectangleArrayList.add((Rectangle)shapeList.get(i));
            }
        }
        return  rectangleArrayList;
    }


    public ArrayList<Square> getSquareList()
    {
        ArrayList<Square> squareArrayList = new ArrayList<Square>();
        for (int i = 0; i < shapeList.size() ; i++)
        {
            if(shapeList.get(i) instanceof Square)
            {
                squareArrayList.add((Square) shapeList.get(i));
            }
        }
        return  squareArrayList;
    }


    public ArrayList<Triangle> getTriangleList()
    {
        ArrayList<Triangle> triangleArrayList = new ArrayList<Triangle>();
        for (int i = 0; i < shapeList.size() ; i++)
        {
            if(shapeList.get(i) instanceof Triangle)
            {
                triangleArrayList.add((Triangle) shapeList.get(i));
            }
        }
        return  triangleArrayList ;
    }
}

/** @author Duong Thi Thuy Hang
 * since 9th OCt 2018
 * version 0.1
 */

public class Main {
    public static void main(String[] args){
        Diagram diagram = new Diagram();
        Layer layer1 = new Layer();
        Layer layer2 = new Layer();
        Layer layer3 = new Layer();

        Rectangle rectangle1 = new Rectangle("red",true,0,0,10,5);
        Rectangle rectangle2 = new Rectangle("blue",true,0,0,10,5);
        Rectangle rectangle3 = new Rectangle("green",true,10,20,10,5);

        Square square1 = new Square("white",true,-1,1,3.14);
        Square square2 = new Square("black",false,2,3,27);
        Square square3 = new Square("purple",false,2,3,27);

        Triangle triangle1 = new Triangle("yellow",false,30,30,1,2,3);
        Triangle triangle2 = new Triangle("pink",false,30,30,1,2,3);
        Triangle triangle3 = new Triangle("gray",false,220,130,13,2,3);

        Circle circle1 = new Circle("pink",true,40,40,2713);
        Circle circle2 = new Circle("orange",true,40,40,2713);
        Circle circle3 = new Circle("milk",true,10,40,2713);

        Hexagon h1 = new Hexagon("navy",false,7,7,13);
        Hexagon h2 = new Hexagon("tomato",true,10,10,17);
        Hexagon h3 = new Hexagon("gold",true,10,10,17);

        layer1.addShape(rectangle1);
        layer1.addShape(square1);
        layer1.addShape(rectangle2);
        layer1.addShape(square2);
        layer1.addShape(h1);
        layer1.addShape(h2);
        layer1.addShape(rectangle3);
        layer1.addShape(h3);
        layer1.addShape(square3);

        layer1.addShape(triangle1);
        layer1.addShape(triangle2);
        layer1.addShape(triangle3);

        layer1.addShape(circle1);
        layer1.addShape(circle2);
        layer1.addShape(circle3);

        layer1.printShapeList();
        System.out.println("\n\nPrint shape list:");
        layer1.deleteSameShapes();
        layer1.printShapeList();

        System.out.println("\n\nArranging layer:");
        Square  square4 = new Square("blood",true,2,4,11);
        layer2.addShape(square4);
        Triangle triangle4 = new Triangle("brown",false,7,11,1,1,1);
        layer3.addShape(triangle4);

        diagram.addLayer(layer1);
        diagram.addLayer(layer2);
        diagram.addLayer(layer3);

        diagram.arrangeShapesIntoLayers();

        diagram.printAllLayer();

//        layer2.addShape(circle1);
//        layer2.addShape(triangle1);
//
//        layer3.addShape(square1);
//        layer3.addShape(rectangle1);
//
//        diagram.addLayer(layer1);
//        diagram.addLayer(layer2);
//        diagram.addLayer(layer3);

//        layer2.deleteTriangle();
//        System.out.println( layer2.getShapeList() );
//
//        diagram.deleteCircle();
//        diagram.printAllLayer();
    }
}

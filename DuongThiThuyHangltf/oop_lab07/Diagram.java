/** @author Duong Thi Thuy Hang
 * since 9th OCt 2018
 * version 0.1
 */
import java.util.ArrayList;


/**
 * para layerList;
 */
public class Diagram {
    private ArrayList<Layer> layerList = new ArrayList<>();


    /**
     *
     * @param layer
     */
    public void addLayer(Layer layer){
        layerList.add(layer);
    }

    public ArrayList<Layer> getLayerList() {
        return layerList;
    }


    public void printAllLayer(){
        for(int i=0;i<layerList.size();i++)
        {
            System.out.println(layerList.get(i).getType()+":");
            layerList.get(i).printShapeList();
            System.out.println();
        }
    }

    /**
     *
     * @param layerList
     */
    public void setLayerList(ArrayList<Layer> layerList) {
        this.layerList = layerList;
    }

    public void deleteCircle(){ // 0 1 2 3
        for(int i=0;i<layerList.size();i++) {
            layerList.get(i).deleteCircle();
        }
    }

    /**
     * Arranging different shapes into its corresponding layer.
     * i.e: Circle is in: circle layer, Square is in: square layer.
     */
    public void arrangeShapesIntoLayers()
    {
        ArrayList<Layer> newLayerList = new ArrayList<Layer>();
        newLayerList.add(new Layer());
        newLayerList.get(0).setType("layer circle");

        newLayerList.add(new Layer());
        newLayerList.get(1).setType("layer hexagon");

        newLayerList.add(new Layer());
        newLayerList.get(2).setType("layer rectangle");

        newLayerList.add(new Layer());
        newLayerList.get(3).setType("layer square");

        newLayerList.add(new Layer());
        newLayerList.get(4).setType("layer triangle");

        for (int i = 0; i < layerList.size() ; i++)
        {
            for (int j = 0; j < layerList.get(i).getCircleList().size() ; j++)
            {
                newLayerList.get(0).addShape( layerList.get(i).getCircleList().get(j) );
            }
            for (int j = 0; j < layerList.get(i).getHexagonList().size() ; j++) {
                newLayerList.get(1).addShape( layerList.get(i).getHexagonList().get(j) );
            }

            for (int j = 0; j < layerList.get(i).getRectangleList().size() ; j++) {
                newLayerList.get(2).addShape( layerList.get(i).getRectangleList().get(j) );
            }
            for (int j = 0; j < layerList.get(i).getSquareList().size() ; j++) {
                newLayerList.get(3).addShape( layerList.get(i).getSquareList().get(j) );
            }
            for (int j = 0; j < layerList.get(i).getTriangleList().size() ; j++) {
                newLayerList.get(4).addShape( layerList.get(i).getTriangleList().get(j) );
            }
        }

        for (int i = 0; i < newLayerList.size(); i++)
        {
            if( newLayerList.get(i).getShapeList().size()==0 ){
                newLayerList.remove(i);
                i--;
            }
        }
        layerList = newLayerList ;
    }
}

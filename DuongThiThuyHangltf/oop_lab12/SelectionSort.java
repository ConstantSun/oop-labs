/**@author: Duong THi Thuy Hang
 * @version: 0.1
 * since: 27th Nov 2018
 */
public class SelectionSort implements SortAlgorithm {

    /**
     *
     * @param array
     * @return
     */
    public  int[]  sort ( int [] array) {
        System.out.println("Selection Sort: ");
        int  position =  0 ;
        for  ( int  i =  0 ; i <array.length; i ++) {
            int  j = i +  1 ;
            position = i;
            int  temp = array [i];
            for  (; j <array.length; j ++) {
                if  (array [j] <temp) {
                    temp = array [j];
                    position = j;
                }
            }
            array [position] = array [i];
            array [i] = temp;
        }
        return array;
    }

}

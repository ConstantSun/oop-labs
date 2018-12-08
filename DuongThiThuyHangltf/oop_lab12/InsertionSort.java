/**@author: Duong THi Thuy Hang
 * @version: 0.1
 * since: 27th Nov 2018
 */
public class InsertionSort implements SortAlgorithm {
    /**
     *
     * @param array
     * @return
     */
    public int[]  sort ( int [] array) {
        System.out.println("Insertion Sort: ");
        for  ( int  i =  1 ; i <array.length; i ++) {
            int  temp = array [i];
            int  j = i -  1 ;
            for  (; j>=  0  && array [j]> temp; j--) {
                // Moves the value greater than temp back by one unit
                array [j +  1 ] = array [j];
            }
            array [j +  1 ] = temp;
        }
        return array;
    }
}

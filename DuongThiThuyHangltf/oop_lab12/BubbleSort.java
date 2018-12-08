/**@author: Duong THi Thuy Hang
 * @version: 0.1
 * since: 27th Nov 2018
 */
public class BubbleSort implements SortAlgorithm {
    /**
     *
     * @param array
     * @return
     */
    public int[]  sort(int[] array){
        System.out.println("Bubble Sort: ");
        int  temp =  0 ;
        for  ( int  i =  0 ; i <array.length -  1 ; i ++) {
            for  ( int  j =  0 ; j <array.length -  1  - i; j ++) {
                if  (array [j]> array [j +  1 ]) {
                    temp = array [j];
                    array [j] = array [j +  1 ];
                    array [j +  1 ] = temp;
                }
            }
        }
        return array;
    }
}

/**@author: Duong THi Thuy Hang
 * @version: 0.1
 * since: 27th Nov 2018
 */
import java.util.Arrays;

public class TestDriver2
{
    public static void main(String[] args) {
        SortAlgorithm sortAlgorithm1 = new SelectionSort();
        SortAlgorithm sortAlgorithm2 = new BubbleSort();
        SortAlgorithm sortAlgorithm3 = new InsertionSort();
        int[] a = {10,7,2,6,4,9,8,1,0,3};
        a = sortAlgorithm1.sort(a);
        System.out.println(Arrays.toString(a));

        a = sortAlgorithm2.sort(a);
        System.out.println(Arrays.toString(a));

        a = sortAlgorithm3.sort(a);
        System.out.println(Arrays.toString(a));
    }

}

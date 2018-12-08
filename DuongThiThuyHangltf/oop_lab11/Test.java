/**@author: Duong THi Thuy Hang
 * @version: 0.1
 * since: 27th Nov 2018
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        ComparePrimitive cp = new ComparePrimitive();
        Integer a[] = {5,3,4,2,1,0};
        a = cp.sorting(a);
        System.out.print(Arrays.toString(a));

        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(8);
        arr.add(0);
        arr.add(2);
        arr.add(7);
        System.out.println("\nmax = " + cp.getMaxElement(arr));

    }
}

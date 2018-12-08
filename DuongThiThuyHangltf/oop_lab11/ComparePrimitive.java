/**@author: Duong THi Thuy Hang
 * @version: 0.1
 * since: 27th Nov 2018
 */

import java.util.ArrayList;

public class ComparePrimitive {

    /**
     *
     * @param a
     * @param <T>
     * @return
     */
    public <T extends Comparable> T[] sorting(T[] a)
    {
        if (a == null || a.length == 0) return null;
        for (int i = 0; i <a.length ; i++)
        {
            for (int j = i+1; j <a.length ; j++)
            {
                if(a[i].compareTo(a[j]) > 0)
                {
                    T tem = a[i] ; a[i] = a[j] ; a[j] = tem ;
                }
            }
        }
        return a;
    }


    public <T extends Comparable> T getMaxElement(ArrayList<T> arrayList)
    {
        if(arrayList.size() == 0) return null;
        T maxEle = arrayList.get(0) ;
        for (int i = 1; i < arrayList.size() ; i++) {
            if(maxEle.compareTo(arrayList.get(i))<0 ){
                maxEle = arrayList.get(i);
            }
        }
        return maxEle;
    }

}


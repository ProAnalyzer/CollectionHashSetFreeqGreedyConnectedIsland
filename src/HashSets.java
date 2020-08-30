import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet s1 =new HashSet();
        TreeSet ts = new TreeSet();
        LinkedHashSet lhs =new LinkedHashSet();

        int arr[] ={1,2,3,4,5,1,2,3,4,5};
        for (int i=0; i<arr.length; i++){
            s1.add(arr[i]);
            ts.add(arr[i]);
            lhs.add(arr[i]);
        }
        Iterator itr = s1.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        Iterator itr1 = ts.iterator();
        while (itr1.hasNext()){
            System.out.print(itr1.next()+" ");
        }
        System.out.println();
        Iterator itr3 = s1.iterator();
        while (itr3.hasNext()){
            System.out.print(itr3.next()+" ");
        }
    }
}

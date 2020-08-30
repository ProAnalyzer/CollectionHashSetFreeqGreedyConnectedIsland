import java.util.*;

public class FreeqProb {
    public static void main(String[] args) {
        ArrayList ne =new ArrayList();
        ne.add(5);
        ne.add(2);
        ne.add(1);
        ne.add(5);
        ne.add(2);
        ne.add(5);
        ne.add(3);
        ne.add(4);
        HashSet hs =new HashSet();
        hs.addAll(ne);
        Iterator itr =hs.iterator();
        while(itr.hasNext()){
            Object i = itr.next();
            System.out.println(i+" "+Collections.frequency(ne,i));
        }
        HashMap<Integer,String> hm = new HashMap<Integer, String>();




    }
}

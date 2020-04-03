import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListContainsExample {
    public static void main (String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        HashMap<String,String> hm = new HashMap<>();
        al.add(65);
        al.add(654);
        al.add(654);
        al.add(645);
        al.add(652);
        al.add(656);
        hs.add(878);
        hs.add(45);
        hs.add(7);
        hs.add(6768);
        hs.add(000);
        hs.add(123);
        hs.add(432);
        hs.add(10011);
        hm.put("tyt","ytyt");
        hm.put("rty","gfh");
        hm.put("cfg","nhjm");
        hm.put("uio","mnb");
        hm.put("asd","oki");
        int n = hs.size();
        System.out.println("found hashset" +hs +n);

        if(al.contains(0)){
            System.out.println("found");
        }
        else System.out.println("no found 6");
    }
}

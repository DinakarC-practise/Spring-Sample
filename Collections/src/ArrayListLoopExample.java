import java.util.*;
//https://javahungry.blogspot.com/2019/02/collection-programs-in-java-for-interview.html
public class ArrayListLoopExample {

    public static void main (String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(345);
        al.add(45);
        al.add(5676);
        al.add(346575);
        al.add(7675);
        al.add(345);
        al.add(345);
        System.out.println(al);
        for (int num :al){
            System.out.println(num);
        }
        // converting arrayList to array
        Object [] arr = al.toArray();
        System.out.println("obj" + Arrays.toString(arr));

    }
}

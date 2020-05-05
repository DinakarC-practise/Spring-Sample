import java.util.*;
public class Strw{

    public static void main (String[] args){

        String s  = "Hello My name is Dinakar";
        int cnt = 0;
        char[] a = s.toCharArray();
        System.out.println("Duplicte char are");
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(a[i] == a[j]){
                    System.out.println("duplicates" +a[j]);
                            cnt++;
                            break;
                }
            }

        }
        }
}
import java.util.Scanner;

public class MaskMobileNumber {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int len = str.length();
        StringBuilder sb = new StringBuilder(len);
        for (len =6; len <9; len++){
            sb.append("*");
        }
        String outM = str.substring(0,5)+sb+str.substring(9,14);
        System.out.println(outM);
    }
}
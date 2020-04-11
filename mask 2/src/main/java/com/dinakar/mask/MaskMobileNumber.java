package com.dinakar.mask;

import java.util.Scanner;

public class MaskMobileNumber {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter valid mobile number");
        String str = s.nextLine();
        if (null != maskMobileNum(str)) {
            System.out.println("Masked mobile number is :" + maskMobileNum(str));
        } else {
            System.out.println("Must Enter a valid number ");
        }
    }

    public static String maskMobileNum(String mobilenumber) {
        String result = null;
        String intermediate;

        if (null != mobilenumber && !mobilenumber.isEmpty()) {
            intermediate = mobilenumber.replaceAll("[^a-zA-Z0-9\\s+]", "").replace(" ", "");
            int len = intermediate.length();
            StringBuilder sb = new StringBuilder(len);
            for (len = 3; len < 6; len++) {
                sb.append("*");
            }
            result = "(" + intermediate.substring(0, 2) + ")" + " " + sb + "-" + intermediate.substring(6, 9);
        }
        return result;
    }
}
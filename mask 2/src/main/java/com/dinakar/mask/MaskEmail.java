package com.dinakar.mask;

import java.util.Scanner;

public class MaskEmail {
    public static void main(String[] args) throws Exception {
        Scanner email = new Scanner(System.in);
        System.out.println("Enter your email ID:");
        String strId = email.nextLine();
        String[] parts = strId.split("@");
        if (parts[0].length() < 4)
            strId = maskString(parts[0], 0, parts[0].length(), '*');
        else
            strId = maskString(parts[0], 1, parts[0].length() - 1, '*');

        //now append the domain part to the masked id part
        System.out.println(strId + "@" + parts[1]);

    }

    private static String maskEmail(String email)
            throws Exception {

        char[] ch = email.toCharArray();
        for (int i = 0; i < email.length(); i++) {
            System.out.println(char[i]);
        }
    }
}

//
//        if (strText == null || strText.equals(""))
//            return "";
//
//        if (strStart < 0)
//            strStart = 0;
//
//        if (strEnd > strText.length())
//            strEnd = strText.length();
//
//        if (strStart > strEnd)
//            throw new Exception("strEnd index cannot be greater than strStart index");
//
//        int maskLength = strEnd - strStart;
//
//        if (maskLength == 0)
//            return strText;
//
//        StringBuilder sbMaskString = new StringBuilder(maskLength);
//
//        for (int i = 0; i < maskLength; i++) {
//            sbMaskString.append(maskChar);
//        }
//
//        return strText.substring(0, strStart)
//                + sbMaskString.toString()
//                + strText.substring(strStart + maskLength);
//    }

//}

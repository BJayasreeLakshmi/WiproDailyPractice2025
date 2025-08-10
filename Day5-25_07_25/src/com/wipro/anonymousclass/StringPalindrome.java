package com.wipro.anonymousclass;

public class StringPalindrome {

    public static void main(String[] args) {
        
        String str = "Madam";
        boolean isPalindrome = true;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(str.charAt(left));
            char rightChar = Character.toLowerCase(str.charAt(right));

            if (leftChar != rightChar) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}

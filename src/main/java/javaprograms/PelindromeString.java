package javaprograms;

import java.util.Scanner;

public class PelindromeString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String :");
        String str=scanner.next();
        String str1=str;
        String rev="";

        for (int i=(str.length()-1);i>=0;i--)
        {
           rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(str1.equals(rev)){
            System.out.println("this is pelindrome string");
        }else{
            System.out.println("this is not pelindrome string");
        }
    }
}

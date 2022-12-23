package javaprograms;

import java.util.Scanner;

public class PelindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number :");
        int num=scanner.nextInt();

        int num1=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(num1 == rev){
            System.out.println("it is Pelindrome number");
        }else{
            System.out.println("it is not pelindrome number");
        }
    }
}

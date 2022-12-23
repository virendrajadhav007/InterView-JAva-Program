package javaprograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=scanner.nextInt();

//        int rev=0;
//        while ((num!=0)){                                                                     //1 st method by algorithm
//            rev=rev*10+num%10;
//            num=num/10;
//
//        }
//        StringBuffer sb=new StringBuffer(String.valueOf(num));                                //2 nd method by String buffer class
//        StringBuffer rev=sb.reverse();

        StringBuilder sb1=new StringBuilder();                                                  //3 rd method by String builder class
        StringBuilder rev=sb1.append(num);
        rev.reverse();


        System.out.println(rev);
    }
}

package javaprograms;

import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;

import java.util.Scanner;

public class PrimeOrNotNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        int count=0;
        if(num>1){
           for(int i=1;i<=num;i++){
              if(num%i==0)
                  count++;
           }
            if(count==2){
                System.out.println("Number is prime number :"+num);
            }else {
                System.out.println("Number is not prime number");
            }
            System.out.println("Factors :"+count);
        }else {
            System.out.println("this is not prime number");
        }
    }

}

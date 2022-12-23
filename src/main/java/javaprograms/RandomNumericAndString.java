package javaprograms;

import net.bytebuddy.utility.RandomString;

import java.util.Random;

public class RandomNumericAndString {
    public static void main(String[] args) {
        Random rd=new Random();
        int num=rd.nextInt(50);                                //1st method
        double num2=rd.nextDouble();
        System.out.println(num);
        System.out.println(num2);
        System.out.println(Math.random());                          //2nd method



    }
}

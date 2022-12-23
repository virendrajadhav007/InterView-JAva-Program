package javaprograms;

public class LargestNumberFind {
    public static void main(String[] args) {
        int num1=1150;
        int num2=40,num3=300;
//        if(num1>num2&&num1>num3)                                                        //  1st type
//        {
//            System.out.println("num1 is largest");
//        }else   if(num2>num3&&num2>num1){
//            System.out.println("num2 is largest");
//        }else {
//            System.out.println("num3 is largest");
//        }
        int larg1=num1>num2?num1:num2;                                                          // 2nd type
        int larg2=larg1>num3?larg1:num3;
        System.out.println("largest :"+larg2);
    }
}

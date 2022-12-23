package javaprograms;

import java.util.Arrays;

public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6};
        int[] y = {1, 2, 3, 4, 5, 6};
//   boolean re=Arrays.equals(x,y);                 //      1st method
//        System.out.println(re);
//
        boolean re=true;                               //2nd method
        if (x.length == y.length){
            for(int i=0;i>x.length;i++){
                if(x[i]!=y[i]){
                    re=false;
                }
            }
        }else {
            re=false;
        }
        if (re=true){
            System.out.println("equals");
        }else {
            System.out.println("Not Equals");
        }
    }
}

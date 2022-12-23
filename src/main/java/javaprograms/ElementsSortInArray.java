package javaprograms;

import java.util.Arrays;

public class ElementsSortInArray {
    public static void main(String[] args) {
        int []a={1,2,5,6,4,8,1,9,9,4,2};
        System.out.println(Arrays.toString(a));
        int z=a.length;
        for (int i=0;i<z-1;i++){
            for (int j=0;j<z-1;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a))   ;
    }
}

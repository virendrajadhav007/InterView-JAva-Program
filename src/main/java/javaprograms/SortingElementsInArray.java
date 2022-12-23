package javaprograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsInArray {
    public static void main(String[] args) {
        Integer []a={20,30,40,60,10,90};
        System.out.println(Arrays.toString(a));
      //  Arrays.parallelSort(a);                       //1st method
       // Arrays.sort(a);                             //2nd method
        Arrays.sort(a, Collections.reverseOrder());     //3rd method in descending order
        System.out.println(Arrays.toString(a));


    }
}

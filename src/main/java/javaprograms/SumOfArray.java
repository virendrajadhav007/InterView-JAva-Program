package javaprograms;

public class SumOfArray {
    public static void main(String[] args) {
        int[]a=new int []{1,20,3,4,5,90};
        int sum=0;
//        for(int i=0;i<=(a.length-1);i++){             //1st method
//            sum=sum+a[i];
//        }
        for (int z:a){                              //2nd method
            sum=sum+z;
        }


        System.out.println(sum);
    }
}

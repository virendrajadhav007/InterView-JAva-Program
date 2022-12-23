package javaprograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        int x=5;
        int y=6;
        int sum=0;
        System.out.print(x+" "+y);
        for(int i=2;i<10;i++){
                sum=x+y;
            System.out.print(" "+sum);
            x=y;
            y=sum;

        }
    }
}

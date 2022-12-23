package javaprograms;

public class OddEvenFromArray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 8, 5, 4, 5, 2, 4, 6,};
        for (int i = 0; i <= (a.length - 1); i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("ODD");
        for (int i = 0; i <= (a.length - 1); i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}
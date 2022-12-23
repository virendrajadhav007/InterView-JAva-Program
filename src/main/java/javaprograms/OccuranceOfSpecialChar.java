package javaprograms;

public class OccuranceOfSpecialChar {
    public static void main(String[] args) {
        String str="Hello Java ";
      int s1=  str.length();
      int s2=str.replace("a","sb").length();

      int count=s1-s2;
        System.out.println(count);
    }
}

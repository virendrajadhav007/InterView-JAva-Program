package javaprograms;

public class RemoveJunkOrSpecialChar {
    public static void main(String[] args) {
        String str="Hello@Java !@#$%^%^,./;'&";
      String str1=  str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str1);
    }
}

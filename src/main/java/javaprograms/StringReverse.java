package javaprograms;

public class StringReverse {
    public static void main(String[] args) {
        String str="Virendra Jadhav";
//        for(int i=(str.length()-1);i>=0;i--){
//            System.out.print(str.charAt(i));
//        }
//        char a[]=str.toCharArray();
//        for(int i=(str.length()-1);i>=0;i--){
//            System.out.print(str.charAt(i));
//        }
        StringBuffer stringBuffer=new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}

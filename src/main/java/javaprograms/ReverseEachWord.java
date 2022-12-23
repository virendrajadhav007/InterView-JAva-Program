package javaprograms;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Welcome To Java";
        String[] words = str.split(" ");
        String rvsstr = "";

//       for (String str1:words){                              //First Method
//          String reverswords="";
//          for (int i=str1.length()-1;i>=0;i--){
//              reverswords=reverswords+str1.charAt(i);
//          }
//          rvsstr=rvsstr+reverswords+" ";
//       }
//        System.out.println(rvsstr);


        for (String w : words) {                               //Second Method
            StringBuilder stringBuilder = new StringBuilder(w);
            stringBuilder.reverse();
            rvsstr = rvsstr + stringBuilder.toString() + " ";
        }
        System.out.println(rvsstr);
    }
}

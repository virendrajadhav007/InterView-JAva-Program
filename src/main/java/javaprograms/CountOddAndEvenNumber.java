package javaprograms;

public class CountOddAndEvenNumber {
    public static void main(String[] args) {
        int num=123456;
        int count1=0;
        int count2=0;
    while(num>0){
        int rem=num%10;
        if(rem%2==0){
            count1++;
        }else{
            count2++;
        }
        num=num/10;
    }
//        num=num/10;
        System.out.println(count1+" "+count2);
    }
}

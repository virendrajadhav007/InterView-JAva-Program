package javaprograms;

public class SearchNumberFromArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,1,0,50};
        int search=200;
        boolean flag=false;
        for (int i=0;i<arr.length;i++) {
            if (search == arr[i]) {
                System.out.println(i);
                flag = true;
                break;
            }
        }
            if (flag==false){
                System.out.println("element not found");
            }
        }

}

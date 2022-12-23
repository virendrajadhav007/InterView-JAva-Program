package javaprograms;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTExtFile {
    public static void main(String[] args) throws IOException, FileNotFoundException {
//        FileReader fileReader=new FileReader("D:\\FileIntoTExt\\Text123.txt");      //1st method
//        BufferedReader bufferedReader=new BufferedReader(fileReader);
//        String str;
//        while ((str=bufferedReader.readLine())!=null){
//            System.out.println(str);
//        }
//bufferedReader.close();
//    }

        File file = new File("D:\\FileIntoTExt\\Text123.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {                                               //2nd method
            System.out.println(scanner.nextLine());
        }
    }
}

package javaprograms;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataIntoTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("D:\\FileIntoTExt\\text123.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write("Selenim ");
        bufferedWriter.write("Java ");
        bufferedWriter.write("Python ");
        bufferedWriter.write("TestNG");
        System.out.println("Finished");
        bufferedWriter.close();
    }
}

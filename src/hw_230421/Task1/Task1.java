package hw_230421.Task1;

import hw_230421.TextFormater;

import java.io.*;
import java.util.Arrays;

public class Task1 {


    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/hw_230421/Task4/strings.txt"));
                BufferedWriter writter = new BufferedWriter(new FileWriter("src/hw_230421/Task4/stringsPloindrom.txt"))){

            TextFormater textFormater = new TextFormater();
            String line;
            while ((line = reader.readLine()) != null) {
                if(textFormater.isPolindrom(line)){
                    writter.write(line);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
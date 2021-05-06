package hw_230421.Task2;

import hw_230421.TextFormater;

import java.io.*;
public class Task2 {


    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/hw_230421/Task4/textTask2.txt"));
             BufferedWriter writter = new BufferedWriter(new FileWriter("src/hw_230421/Task4/textTask2Result.txt"))){

            TextFormater textFormater = new TextFormater();
            String line;
            while ((line = reader.readLine()) != null) {
                if(textFormater.countWord(line) >= 3 && textFormater.countWord(line)<=5 ||textFormater.isPolindrom(line)) {
                    writter.write(line + "\n");
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
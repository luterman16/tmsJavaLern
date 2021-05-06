package hw_230421.Task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/hw_230421/Task3/textTask3.txt"));
             BufferedReader readerBlackList = new BufferedReader(new FileReader("src/hw_230421/Task3/blackList.txt"))) {

            String line;
            String lineBlack;
            int countBlackWord = 0;
            while ((line = reader.readLine()) != null) {
                readerBlackList.mark(100);

                while ((lineBlack = readerBlackList.readLine()) != null) {

                    if (line.contains(lineBlack)){
                        countBlackWord++;
                        System.out.printf("Предложение: \"%s\" не прошло проверку \n", line);
                    };
                };
                readerBlackList.reset();
            };

            if (countBlackWord == 0){
                System.out.println("Text correct !!");
            } else {
                System.out.println("Количество сообщение не прошедших проверку: " + countBlackWord);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


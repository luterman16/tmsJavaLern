package hw_190321.Task3;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        DebetCard debetCard1 = new DebetCard("1234567890123456", "debet", "Ivanov Ivan", "10/03/2024", 123);
        debetCard1.validateCard("1234567890123456", "debet", "Ivanov Ivan", "10/03/2024", 123, 123);

    }
}
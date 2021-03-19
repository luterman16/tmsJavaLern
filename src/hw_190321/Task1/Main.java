package hw_190321.Task1;

import hw_190321.Task1.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        List<Student> list = new ArrayList<>();
        list.add(new Student("Иванушка", "Дурачёк", "01-01-1000", 2));
        list.add(new Student("Алёша", "Попович", "01-02-1001", 5));
        list.add(new Student("Алёнушка", "Шоколадная", "01-05-999", 3));
        list.add(new Student("Добрыня", "Никитич", "01-01-995", 3));
        list.add(new Student("Варвара","Российская", "01-09-1001", 1));
        list.add(new Student("Микула","Селянинович", "11-03-1001", 4));

        student.printStudent(list, 2);
    }
}

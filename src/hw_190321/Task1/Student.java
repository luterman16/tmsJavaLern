package hw_190321.Task1;

import java.util.List;

public class Student {

    private String name;
    private String surname;
    private String dateOfBirthday;
    private int course;

    public Student(){};

    public void printStudent(List students, int course) {
        for(Object element: students) {
            Student student = (Student)element;

            if(student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }


    public Student(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

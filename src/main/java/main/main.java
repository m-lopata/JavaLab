package main;

import database.DatabaseManager;
import model.Student;

import java.util.List;

class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        List<Student> students = dbManager.getStudentsByMonth(1); // Example: January

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
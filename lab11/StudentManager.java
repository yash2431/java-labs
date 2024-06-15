import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", GPA: " + gpa;
    }
}

public class StudentManager {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Read students from file
        readStudentsFromFile(students);

        // Print students
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Add a new student
        Student newStudent = new Student("Alice", 20, 3.8);
        students.add(newStudent);

        // Write students to file
        writeStudentsToFile(students);
    }

    private static void readStudentsFromFile(List<Student> students) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int age = Integer.parseInt(parts[1].trim());
                double gpa = Double.parseDouble(parts[2].trim());
                students.add(new Student(name, age, gpa));
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    private static void writeStudentsToFile(List<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student student : students) {
                bw.write(student.getName() + ", " + student.getAge() + ", " + student.getGpa());
                bw.newLine();
            }
            System.out.println("Students written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

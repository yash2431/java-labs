import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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

public class StudentM {
    private static final String FILE_NAME = "students.dat";

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
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (dis.available() > 0) {
                String name = dis.readUTF();
                int age = dis.readInt();
                double gpa = dis.readDouble();
                students.add(new Student(name, age, gpa));
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    private static void writeStudentsToFile(List<Student> students) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            for (Student student : students) {
                dos.writeUTF(student.getName());
                dos.writeInt(student.getAge());
                dos.writeDouble(student.getGpa());
            }
            System.out.println("Students written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

package ru.mirea.lab11.ex1;

public class Student {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student currentStudent = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > currentStudent.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = currentStudent;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(3, "Alice");
        students[1] = new Student(1, "Bob");
        students[2] = new Student(5, "Charlie");
        students[3] = new Student(2, "David");
        students[4] = new Student(4, "Eve");

        System.out.println("Unsorted array:");
        for (Student student : students) {
            System.out.println(student.getIDNumber() + " - " + student.getName());
        }

        insertionSort(students);

        System.out.println("Sorted array by IDNumber:");
        for (Student student : students) {
            System.out.println(student.getIDNumber() + " - " + student.getName());
        }
    }
}

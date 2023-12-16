package ru.mirea.lab11.ex2;

class Student {
    private String name;
    private double GPA;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public String getName() {
        return name;
    }
}

public class SortingStudentsByGPA {
    public static void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private static int partition(Student[] students, int low, int high) {
        Student pivot = students[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students[j].getGPA() > pivot.getGPA()) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Alice", 3.8),
                new Student("Bob", 3.6),
                new Student("Charlie", 4.0),
                new Student("David", 3.9),
                new Student("Eve", 3.7)
        };

        quickSort(students, 0, students.length - 1);

        System.out.println("Sorted Students by GPA (Descending):");
        for (Student student : students) {
            System.out.println(student.getName() + " - GPA: " + student.getGPA());
        }
    }
}

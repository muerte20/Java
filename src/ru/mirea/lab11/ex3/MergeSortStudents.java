package ru.mirea.lab11.ex3;

import java.util.ArrayList;
import java.util.List;

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

public class MergeSortStudents {
    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getGPA() >= list2.get(j).getGPA()) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 3.8));
        list1.add(new Student("Bob", 3.6));
        list1.add(new Student("Charlie", 4.0));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("David", 3.9));
        list2.add(new Student("Eve", 3.7));

        List<Student> sortedList = mergeSort(list1, list2);

        System.out.println("Sorted Students by GPA:");
        for (Student student : sortedList) {
            System.out.println(student.getName() + " - GPA: " + student.getGPA());
        }
    }
}

package ru.mirea.lab1;

public class Book {
    private String name;
    private  int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Book(String n){
        name = n;
        age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' + "}"
                ;
    }
    public String setName(){
        return name + " - " + age + " years.";
    }
}
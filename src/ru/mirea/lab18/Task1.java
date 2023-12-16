package ru.mirea.lab18;

import java.io.Serializable;

import java.io.Serializable;

class Animal implements Serializable {

}

public class Task1<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public Task1(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Type of T: " + t.getClass().getName());
        System.out.println("Type of V: " + v.getClass().getName());
        System.out.println("Type of K: " + k.getClass().getName());
    }

    public static void main(String[] args) {
        Task1<Integer, Animal, String> myObject = new Task1<>(42, new Animal(), "Example");
        myObject.printClassNames();
    }
}

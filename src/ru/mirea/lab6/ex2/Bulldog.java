package ru.mirea.lab6.ex2;

class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(name + ": Вуф-вуф!");
    }
}


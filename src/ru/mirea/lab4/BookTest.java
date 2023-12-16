package ru.mirea.lab4;

public class BookTest {
    public static void main(String[] args) {
        // Создаем объект book и инициализируем его свойства через конструктор
        Book book = new Book("War and Peace", "Leo Tolstoy", 1869, "Historical Fiction");

        // Вывод инфы о книге
        System.out.println(book);

        // Изменяем свойства объекта book
        book.setTitle("Anna Karenina");
        book.setAuthor("Leo Tolstoy");
        book.setYear(1877);
        book.setGenre("Realist Novel");

        // Выводим обновленную информацию о книге
        System.out.println("Updated Book: ");
        System.out.println(book);
    }
}

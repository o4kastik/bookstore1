package com.example.labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        BookStors bookStore = new BookStors();

        // Добавляем книги
        bookStore.addBook("Война и мир", "Лев Толстой", 25);
        bookStore.addBook("Преступление и наказание", "Федор Достоевский", 20);

        // Просматриваем каталог
        bookStore.viewCatalog();

        // Ищем книгу по названию
        bookStore.searchBookByTitle("Война и мир");

        // Ищем книги по автору
        bookStore.searchBooksByAuthor("Лев Толстой");
    }
}

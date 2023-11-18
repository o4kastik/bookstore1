package com.example.labs;

import java.util.ArrayList;

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class BookStors {
    ArrayList<Book> catalog;

    public BookStors() {
        this.catalog = new ArrayList<>();
    }

    public void addBook(String title, String author, double price) {
        Book book = new Book(title, author, price);
        catalog.add(book);
        System.out.println("Книга '" + title + "' успешно добавлена в каталог.");
    }

    public void searchBookByTitle(String title) {
        for (Book book : catalog) {
            if (book.title.equals(title)) {
                System.out.println("Книга найдена: " + book.title +
                        " (Автор: " + book.author + ", Цена: " + book.price + "$)");

            }
        }
        System.out.println("Книга с названием '" + title + "' не найдена.");
    }

    public void searchBooksByAuthor(String author) {
        boolean found = false;
        for (Book book : catalog) {
            if (book.author.equals(author)) {
                if (!found) {
                    System.out.println("Найдены книги автора " + author + ":");
                    found = true;
                }
                System.out.println(book.title + " (Цена: " + book.price + "$)");
            }
        }
        if (!found) {
            System.out.println("Книги автора " + author + " не найдены.");
        }
    }

    public void viewCatalog() {
        if (!catalog.isEmpty()) {
            System.out.println("Каталог книг:");
            for (Book book : catalog) {
                System.out.println(book.title + " (Автор: " + book.author + ", Цена: " + book.price + "$)");
            }
        } else {
            System.out.println("Каталог книг пуст.");
        }
    }
}




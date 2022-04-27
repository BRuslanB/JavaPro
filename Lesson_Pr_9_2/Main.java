package Lesson_Pr_9_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static final int TOTAL_BOOKS = 20;

    public static void main(String[] args){
        Book b;
        int count_books = 0;
        int id;
        String name, author;
        Library library = new Library("Нур-Султан","Отрар");
        Scanner in = new Scanner(System.in);
        do {
            try {
                System.out.println("Введите ID книги:");
                id = in.nextInt();
            } catch (InputMismatchException e){
                id = 99;
                in.next();
            }
            System.out.println("Введите название книги:");
            name = in.next();
            System.out.println("Введите автора книги:");
            author = in.next();
            b = new Book(id, name, author);
            library.addBook(b);
            count_books++;
        } while (count_books < TOTAL_BOOKS); //TOTAL_BOOKS+1 (The library is full) //TOTAL_BOOKS-1 (The book is empty)
        library.printBooks();
    }
}
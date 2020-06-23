package libraryapp;

import libraryapp.model.Book;
import libraryapp.model.Library;

import java.util.Scanner;

public class LibraryMain {

    static Library library = loadLibrary();
    static Scanner scanner = new Scanner(System.in);

    static Library loadLibrary(){
        Book book1 = new Book("Niezwyciężony", "Stanisław Lem");
        Book book2 = new Book("Wojna i pokój", "Lew Tołstoj");
        Book book3 = new Book("Ogniem i mieczem", "Henryk Sienkiewicz");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println("Baza danych książek załadowana do biblioteki...");
        return library;
    }

    //zanim java odpali metodę main, to wykonuje wszytkie WYWOŁANE metody statyczne
    public static void main(String[] args) {
        showMenu();

        int userChoice = scanner.nextInt();

        switch (userChoice){
            case 1: showBooks();
                break;
            case 2: findBook();
                break;
            default: showMenu();
        }
    }

    private static void showMenu(){
        System.out.println("1. Wyświetl książki" +
                "\n2. Wyszukaj książki" +
                "\n3. Pozostałe...");
    }

    private static void showBooks(){
        library.printBooks();
    }

    private static void findBook(){

        System.out.println("Podaj fragment nazwy lub autora:");
        String next = scanner.next();
        Book[] books = library.searchBook(next);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

}

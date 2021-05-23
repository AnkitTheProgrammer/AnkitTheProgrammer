package com.company;
import java.util.Arrays;
import java.util.Scanner;
//import org.apache.commons.lang3.ArrayUtils;

class Library{
    String[] books;
    int [] available_books;
    int no_of_available_books;
    int no_of_books;
    Library(){
        this.available_books = new int[100];
        this.no_of_available_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " book has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }

    void addBookID(int id){
        this.available_books[no_of_available_books] = id;
        no_of_available_books++;
        System.out.println("Book #" +id+ " has been added.");
    }

    void issueBookID(int id){
        for (int i = 0; i < this.available_books.length; i++){
            if (this.available_books[i] == id){
                System.out.println("Book #" +id+ " has been issued.");
                this.available_books[i] = 0;
                break;
            }
            else{
                System.out.println("Sorry, book #" +id+ " is not available at the moment.");
                break;
            }
        }
    }

    void returnBookID(int id){
        addBookID(id);
    }

    void showTheAvailableBooks(){
        System.out.println("The ID of available books are: ");
        for (int id : this.available_books){
            if (id == 0){
                continue;
            }
            System.out.print(id+ ", ");
        }
    }
}



public class Practise_library {
    public static void main(String[] args) {
        Library admin = new Library();
        Library student1 = new Library();
        Library student2 = new Library();

        admin.addBookID(90);
        admin.addBookID(70);
        admin.addBookID(1);

        admin.issueBookID(90);
        admin.issueBookID(69);

        admin.showTheAvailableBooks();
    }

}

package com.assignment_2;

import java.util.Scanner;

class Book{
    int bookId;
    String bookName;

    public Book(int bookId, String name) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
}

class Library{
    Book[] book;

    public Library(Book[] book) {
        this.book = book;
    }

    public void  displayBook(){
        for(int i = 0; i < book.length; i++){
            System.out.println( "Book Id     :   " + book[i].bookId + 
               "\nBook Name   :   " + book[i].bookName);
        }
    }
}

class LibrarySystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Book : ");
        int noOfBooks = sc.nextInt();
        Book book[] = new Book[noOfBooks];

        for(int i = 0; i < noOfBooks; i++)
        {
            System.out.println("Enter Book Id");
            int bookId = sc.nextInt();

            System.out.println("Ener Book Name : ");
            sc.next();
            String bookName = sc.nextLine();

            book[i] = new Book(bookId, bookName);
        }

        Library library = new Library(book);

        library.displayBook();
    }
}

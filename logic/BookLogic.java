package logic;

import entity.Book;

import java.util.ArrayList;
import java.util.UUID;

public class BookLogic {

    private final ArrayList<Book> books = new ArrayList<>();

    public String getListBook(){
        for (Book book1 : books) {
            System.out.println(book1.getBookName() + " " + book1.getAuthor() + " " + book1.getGenre());
        }

        return "Menampilkan seluruh buku";
    }

    public String createBook(String bookName, String author, String genre){
        Book book = new Book();
        book.setUid(UUID.randomUUID().toString());
        book.setBookName(bookName);
        book.setAuthor(author);
        book.setGenre(genre);
        books.add(book);
        for (Book book1 : books) {
            System.out.println("Book UID : "+ book1.getUid() + "\nBook Name : " + book1.getBookName() + "\nAuthor : " + book1.getAuthor() + "\nGenre : " + book1.getGenre());
        }
        return "Book insert successfully";
    }
}

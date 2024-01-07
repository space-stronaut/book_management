import entity.Book;
import logic.BookLogic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookLogic bookLogic = new BookLogic();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1. List Buku");
            System.out.println("2. Buat buku");
            System.out.println("3. Cari By UID");
            System.out.println("4. Delete By UID");
            System.out.println("5. Exit");
            System.out.print("Masukkan input : ");
            int input = scanner.nextInt();
            if (input == 1){
                System.out.println(bookLogic.getListBook());
            } else if (input == 2) {
                System.out.print("Masukkan nama buku : ");
                String bookName = scanner.next();
                System.out.print("Masukkan nama author : ");
                String author = scanner.next();
                System.out.print("Masukkan nama genre : ");
                String genre = scanner.next();
                System.out.print("\n");
                bookLogic.createBook(bookName, author, genre);
            } else if (input == 3) {
                System.out.print("Masukkan BookUID : ");
                String uid = scanner.next();
                bookLogic.getByUUID(uid);
            } else if (input == 4) {
                System.out.print("Masukkan BookUID : ");
                String uid = scanner.next();
                bookLogic.removeByUid(uid);
            } else{
                break;
            }
        }
    }
}

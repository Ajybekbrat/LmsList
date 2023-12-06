import impl.ServiceBook;
import models.Book;
import models.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceBookImpl implements ServiceBook {
    DataBase dataBase = new DataBase();
    @Override
    public Book saveBook(Long libraryId, Book book) {
        Library library =new Library();
        Book book1 = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name; ");
        String name = scanner. nextLine();
         dataBase.books.add(name);
        System.out.println("Enter library: ");
        String id = scanner.nextLine();
        if (libraryId.equals(id)){
            System.out.println("Success added");
            book1.setId(GeneratorId.generatedIdBook());
        }


        return null;
    }

    @Override
    public ArrayList<String> getAllBooks(Long libraryId) {
        return dataBase.books;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (String book : dataBase.books) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("ENTER book ID:");
            int id1 = scanner.nextInt();
            if (bookId.equals(id1)){
                System.out.println(book);
            }else {
                System.out.println(" NO THIS ID");
            }


        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for (String book : dataBase.books) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter id for delete: ");
            String id1 = scanner.nextLine();
            if (bookId.equals(id1)){
                dataBase.books.remove(book);
            }else {
                System.out.println("no this id");
            }
        }
        return null;
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (Library library : dataBase.libraries) {


            Scanner scanner = new Scanner(System.in);
            System.out.print("enter id for delete: ");
            String id1 = scanner.nextLine();
            if (library.getId().equals(id1)) {
                dataBase.books.clear();
            } else {
                System.out.println("no this id");
            }
        }
    }
}

import impl.ServiceLibrary;
import models.Book;
import models.Library;
import models.Reader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        ServiceLibraryimpl serviceLibraryimpl = new ServiceLibraryimpl();
        ServiceBookImpl serviceBook = new ServiceBookImpl();

        Library library = new Library("1", "Peaksoft", "kirova 63");
        Library library1 = new Library("2", "Peaksoft", "kirova 63");
        Library library2 = new Library("3", "zone", "isanova");
        Library library3 = new Library("4", "globus", "toktogula");
        Library library4 = new Library("5", "Peaksoft", "kirova 63");
        Book book = new Book("1", "kyiamat", "Chyngyz Aitmatov", "detectiv");
        Book book1 = new Book("2", "faca to face", "Chyngyz Aitmatov", "fight");
        Book book2 = new Book("3", "Belyi porofot", "Chyngyz Aitmatov", "detectiv");
        Book book3 = new Book("4", "Erte kelgen turnalar", "Chyngyz Aitmatov", "drama");
        Book book4 = new Book("5", "red apple", "Chyngyz Aitmatov", "love");
        Reader reader = new Reader("1", "Ajybek", "Ajybek@gmail.com", "996502091107","male");
        Reader reader1 = new Reader("2", "Karina", "Karina@gmail.com", "996700155525","female");
        Reader reader2 = new Reader("3", "Bilal", "Bilal@gmail.com", "996502007107","male");
        Reader reader3 = new Reader("4", "Adilet", "Adilet@gmail.com", "996505669107","male");
        Reader reader4 = new Reader("5", "Aijan", "Aijan@gmail.com", "996700007001","female");
        while (true) {
            System.out.println("""
                       choice
                     1. Save library
                     2. get all libraries
                     3. get library by id
                     4. update library
                     5. delete library
                     6. save Book
                     7. get all book
                     8. get book by id
                     9. delete book
                     10. clearBooksByLibraryId
                     11. save reader 
                     12. get all readers
                     13. get reader by id
                     14. update reader
                     15. assignReaderToLibrary 
                    """);
            switch ("   CHOICE"){
                case "1" ->{
                   serviceLibraryimpl.saveLibrary();
                }case"2" -> {
                    serviceLibraryimpl.getAllLibraries();
                }case"3" -> {
                     serviceLibraryimpl.getAllLibraries();

                }case "4" -> {
                    serviceLibraryimpl.updateLibrary(dataBase.libraries, String.valueOf(dataBase.libraries));
                }case "5" ->{
                    serviceLibraryimpl.deleteLibrary(dataBase.libraries);
                }case "6 " ->{
                    serviceBook.saveBook();
                }
            }
        }
    }


}
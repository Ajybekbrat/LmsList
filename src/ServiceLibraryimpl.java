import impl.ServiceLibrary;
import models.Library;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceLibraryimpl implements ServiceLibrary {
    DataBase dataBase = new DataBase();
    @Override
    public ArrayList<Library> saveLibrary() {


        return null;
    }

    @Override
    public ArrayList<Library> getAllLibraries() {
        return dataBase.libraries;
    }

    @Override
    public void getLibraryById(long id) {
        for (Library library: dataBase.libraries) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter id: ");
            String id1 = scanner.nextLine();
            if (library.getId().equals(id1)){
                System.out.println(library);

            }else {
                System.out.println("NO  THIS LIBRARY");
            }


        }


        }


    @Override
    public String updateLibrary(Long id, String library) {
        for (Library library1: dataBase.libraries) {



            Scanner scanner = new Scanner(System.in);

            System.out.print("ENTER LIBRARY  ID: ");
            int id1 = scanner.nextInt();
            if (library1.equals(id1) ) {
                System.out.print("ENTER LIBRARY NAME: ");
                library1.setName(scanner.nextLine());


            }


        }
        return null;
    }

    @Override
    public String deleteLibrary(Long id) {
        for (Library library : dataBase.libraries) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter id for delete: ");
            String id1 = scanner.nextLine();
            if (library.getId().equals(id1)){
                dataBase.libraries.remove(library);
            }else {
                System.out.println("no this id");
            }
        }
        return "Successfully deleted";
    }
}

import impl.ServiceReader;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceReaderimpl implements ServiceReader {
    DataBase dataBase = new DataBase();

    @Override
    public String saveReader(Reader reader) {
        for (models.Reader reader1 : dataBase.readers) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name; ");
            reader1.setFullName(scanner.nextLine());

            System.out.print("Enter email: ");
            reader1.setEmail(scanner.nextLine());
            System.out.print("Enter number: ");
            reader1.setPhoneNumber(scanner.nextLine());
            System.out.print("Enter gender: ");
            reader1.setGender(scanner.nextLine());
            dataBase.readers.add(reader1);
            reader1.setId(GeneratorId.generatedIdReader());
            return  "success added";
        }

        return reader.toString();
    }

    @Override
    public ArrayList<models.Reader> getAllReaders() {
        return dataBase.readers;
    }

    @Override
    public models.Reader getReaderById(Long id) {
        models.Reader reader = new models.Reader();
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER READER ID:");
        int id1 = scanner.nextInt();
        if (reader.getId() == id1){
            return reader;
        }else {
            System.out.println(" NO THIS ID");
        }
        return reader;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        for (models.Reader reader1: dataBase.readers) {



            Scanner scanner = new Scanner(System.in);

            System.out.print("ENTER READER  ID: ");
            int id1 = scanner.nextInt();
            if (reader1.equals(id1) ) {
                System.out.print("ENTER NAME: ");
                reader1.setFullName(scanner.nextLine());


            }


        }
        return reader;
    }

    @Override
    public models.Reader updateReader(Long id, models.Reader reader) {
        return null;
    }


    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {

    }
}

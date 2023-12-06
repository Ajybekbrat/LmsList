package impl;

import models.Library;

import java.util.ArrayList;

public interface ServiceLibrary{

    ArrayList<Library> saveLibrary();

     ArrayList<Library> getAllLibraries() ;



    void getLibraryById(long id);

    String updateLibrary(Long id, String library);

    String deleteLibrary(Long id);
}

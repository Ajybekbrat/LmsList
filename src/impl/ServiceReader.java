package impl;

import java.io.Reader;
import java.util.ArrayList;

public interface ServiceReader{

    String saveReader(Reader reader);

    ArrayList<models.Reader> getAllReaders();

    models.Reader getReaderById(Long id);

    Reader updateReader(Long id, Reader reader);



    models.Reader updateReader(Long id, models.Reader reader);

    void assignReaderToLibrary(Long readerId, Long libraryId);
}


package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaverToFile {
    private FileOutputStream fos = null;
    private ObjectOutputStream oos=null;
    
    
    public void saveBooks(List<Book> listBooks){
        try {
            fos = new FileOutputStream("Books.txt");
            oos = new ObjectOutputStream(fos);
        } catch (FileNotFoundException ex) {
            System.out.println("Данные не сохранены");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
    
    public void saveReaders(List<Reader> listReaders){
        
    }
   
    public void saveHistories(List<History> listHistories){
        
    }
    
    
    public List<Book> loadBooks(){
        return null;
    }
    
    public List<Reader> loadReaders(){
        return null;
    }
   
    public List<History> loadHistories(){
        return null;
    }
    
}


package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaverToFile {
    private FileOutputStream fos = null;
    private ObjectOutputStream oos = null;
    
    FileInputStream fileInputStream=null;
    ObjectInputStream objectInputStream = null;
    public void saveBooks(List<Book> listBooks){
        try {
            fos = new FileOutputStream("Books.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listBooks); // передали наш лист
            oos.flush(); // save to file
            
        } catch (FileNotFoundException ex) {
            System.out.println("Фаил не найден. Ошибка: " + ex);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода. Error: " + ex);
        }finally {
            try {
                oos.close(); // освободили ресурс
                fos.close(); // toze osvobodili
            } catch (IOException ex) {
                System.out.println("Ресурсы закрыть не удалось. Error" + ex);
            }
        }
    }
    
    public void saveReaders(List<Reader> listReaders){
        try {
            fos = new FileOutputStream("Readers.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listReaders); // передали наш лист
            oos.flush(); // save to file
            oos.close(); // освободили ресурс
            fos.close(); // toze osvobodili
            
        } catch (FileNotFoundException ex) {
            System.out.println("Данные не сохранены. Error: " + ex);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода. Error: " + ex);
        }finally {
            try {
                oos.close(); // освободили ресурс
                fos.close(); // toze osvobodili
            } catch (IOException ex) {
                System.out.println("Ресурсы закрыть не удалось. Error" + ex);
            }
        }
    }
   
    public void saveHistories(List<History> listHistories){
        try {
            fos = new FileOutputStream("Histories.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listHistories); // передали наш лист
            oos.flush(); // save to file
            oos.close(); // освободили ресурс
            fos.close(); // toze osvobodili
            
        } catch (FileNotFoundException ex) {
            System.out.println("Данные не сохранены. Error: " + ex);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода.Error: " + ex);
        }finally {
            try {
                oos.close(); // освободили ресурс
                fos.close(); // toze osvobodili
            } catch (IOException ex) {
                System.out.println("Ресурсы закрыть не удалось. Error" + ex);
            }
        }
    }
    
    
    public List<Book> loadListBooks(){

        List<Book> listBooks=new ArrayList<>();
        try {
            fileInputStream = new FileInputStream("Books.txt");
            objectInputStream=new ObjectInputStream(fileInputStream);
            listBooks = (List<Book>)objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Фаил не найден. Error " + ex);
        } catch (IOException ex) {
            System.out.println("Фаил не может быть прочитан. Error " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс. Error " + ex);
        } finally {
            try {
                if(fileInputStream!=null)
                {
                    fileInputStream.close(); // освободили ресурс
                }
                if(objectInputStream!=null)
                {
                    objectInputStream.close(); // освободили ресурс
                }
                
            } catch (IOException ex) {
                System.out.println("Ресурсы закрыть не удалось. Error" + ex);
            }
        }
        return listBooks;
    
    }
    
    public List<Reader> loadListReaders(){
        
        List<Reader> listReaders=new ArrayList<>();
        try {
            fileInputStream = new FileInputStream("Readers.txt");
            objectInputStream=new ObjectInputStream(fileInputStream);
            listReaders = (List<Reader>)objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Фаил не найден. Error " + ex);
        } catch (IOException ex) {
            System.out.println("Фаил не может быть прочитан. Error " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс. Error " + ex);
        } finally {
            try {
                if(fileInputStream!=null)
                {
                    fileInputStream.close(); // освободили ресурс
                }
                if(objectInputStream!=null)
                {
                    objectInputStream.close(); // освободили ресурс
                }
                
            } catch (IOException ex) {
                System.out.println("Ресурсы закрыть не удалось. Error" + ex);
            }
        }
        return listReaders;
    }
   
    public List<History> loadListHistories(){
        
        List<History> listHistories=new ArrayList<>();
        try {
            fileInputStream = new FileInputStream("Histories.txt");
            objectInputStream=new ObjectInputStream(fileInputStream);
            listHistories = (List<History>)objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Фаил не найден. Error " + ex);
        } catch (IOException ex) {
            System.out.println("Фаил не может быть прочитан. Error " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс. Error " + ex);
        } finally {
            try {
                if(fileInputStream!=null)
                {
                    fileInputStream.close(); // освободили ресурс
                }
                if(objectInputStream!=null)
                {
                    objectInputStream.close(); // освободили ресурс
                }
                
            } catch (IOException ex) {
                System.out.println("Ресурсы закрыть не удалось. Error" + ex);
            }
        }
        return listHistories;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.List;

/**
 *
 * @author pupil
 */
public interface Saver {
    public void saveBooks(List<Book> listBooks);
    public void saveReaders(List<Reader> listReaders);
    public void saveHistories(List<History> listHistories);
    
    public List<Book> loadListBooks();
    public List<Reader> loadListReaders();
    public List<History> loadListHistories();
    
}

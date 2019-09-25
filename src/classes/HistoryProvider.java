/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryProvider {
    
    Scanner scanner = new Scanner(System.in);
    
    public History createHistory(List<Book> listBooks, List<Reader> listReaders){
       History history = new History(); 
        
        //----------------- Inset Data of book--------------------
        
        System.out.println("Список книг:");
        for(int i=0;i<listBooks.size(); i++){
            if(listBooks.get(i).getQuantity()>0){
                System.out.printf("%d. Название: %s ,Автор: %s%n"
                        ,i+1
                        ,listBooks.get(i).getTitle()
                        ,listBooks.get(i).getAuthor());
            }
        }
        
        System.out.println("Список читателей:");
        for(int i=0;i<listReaders.size(); i++){
            System.out.printf("%d. Имя: %s ,Фамилия: %s%n",i+1,listReaders.get(i).getName(),listReaders.get(i).getLastname());
        
        }
        
        System.out.println("Выберите номер книги");
        int numBook=scanner.nextInt();
        
        System.out.println("Выберите номер читателя");
        int numReader=scanner.nextInt();
        
        
        history.setBook(listBooks.get(numBook-1));
        history.getBook().setQuantity(history.getBook().getQuantity()-1);
       
        history.setReader(listReaders.get(numReader-1));
        history.setTakeOnDate(new Date());
        
        
        return history;
    }
    public void returnBook(List<History> histories){
        
        System.out.println("Список выданных книг:");
        boolean flag=false;
        
        for(int i=0;i<histories.size(); i++){
            if(histories.get(i).getReturnDate()==null)
            {
               System.out.printf("%d. Название книги: %s ,читатель: %s %s%n"
                       ,i+1,histories.get(i).getBook().getTitle()
                       ,histories.get(i).getReader().getName()
                       ,histories.get(i).getReader().getLastname());
            }
            flag=true;
        }
        
        
        if(flag){
            System.out.println("Выберите номер истории");
            int numHistory=scanner.nextInt();
            
            histories.get(numHistory-1).setReturnDate(new Date());
            histories.get(numHistory-1).getBook()
                    .setQuantity(histories.get(numHistory-1)
                    .getBook().getQuantity()+1);
            System.out.println("Книга возвращена в библиотеку");
        }else{
            System.out.println("Нет выданных книг");
        }
        
        
        
        
    }//returnBook
}


package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run(){

        String operation="0";
        boolean badOperation=false;
        
        //-------------List------------------
        List<Book> listBooks=new ArrayList<>();//generic list interface
        List<Reader> listReaders=new ArrayList<>();
        List<History> listHistories=new ArrayList<>();
        HistoryProvider historyProvider = null;
        //-------------SCaNNER---------------
        
        Scanner scanner = new Scanner(System.in);
        
        //-------------Do WHILE--------------
        do {
            
            do{
                System.out.println("Выберите операцию:");
                System.out.println("1. Добавить книгу");
                System.out.println("2. Добавить читателя");
                System.out.println("3. Выдача книги");
                System.out.println("4. Возвращение книги");
                System.out.println("5. Список книг");
                System.out.println("6. Список читателей");
                
                System.out.println("0. Выход");
                badOperation=false;

                operation=scanner.next();
                switch (operation) {
                    case "1":
                         System.out.println("1. Добавить книгу в библиотеку");
                         BookProvider bookProvider = new BookProvider();
                         Book book = bookProvider.createBook();
                         if(book==null){
                             System.out.println("Книгу внести не удалось");                         
                         }else{
                             listBooks.add(book);
                             System.out.println("Книга добавлена");
                         }
                         
                         //listBooks.add(bookProvider.createBook());
                         
                        break;
                        
                    case "2":
                        System.out.println("2. Добавить читателя в список");
                        ReaderProvider readerProvider = new ReaderProvider();
                        Reader reader = readerProvider.createReader();
                        
                        if(reader==null){
                             System.out.println("Читателя внести не удалось");                         
                        }else{
                             listReaders.add(reader);
                             System.out.println("Читатель добавлен");
                        }
                        
                        break;

                    case "3":
                        System.out.println("3. Читатель взял книгу на дом");
                        
                        historyProvider = new HistoryProvider();
                        History history = historyProvider.createHistory(listBooks,listReaders);
                        
                        if(history==null){
                             System.out.println("Книгу внести не удалось");                         
                         }else{
                             listHistories.add(history);
                             System.out.println("Книга выдана");
                         }
                        
                        
                        break;

                    case "4":
                                    
                        System.out.println("4. Читатель вернул книгу в библиотеку");
                        historyProvider.returnBook(listHistories);
                        
                        break;
                        
                    case "5":
                        System.out.println("5. Список книг");
                        for (Book b : listBooks){
                            System.out.println(b.toString());
                        }
                        break;
                        
                    case "6":
                        System.out.println("5. Список Читателей");
                        
                        for (Reader r : listReaders){
                            System.out.println(r.toString());
                        }
                        break;
                    case "0":
                                             
                        badOperation=false; 
                        break;

                    default:
                        System.out.println("Ошибка ввода! \"q\"");
                        badOperation=true;
                }
            }while(badOperation);
            if(operation.equals("0"))break;
            
        }while(true);
            
            
            
        /*
        Book book = new Book();
        book.setId(null);
        book.setTitle("Voina i mir");
        book.setAuthor("L.Tolstoy");
        book.setYear(2010);
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getYear());
        System.out.println("Вывод метода toString(): ");
        System.out.println(book.toString());
        
        Book book2 = new Book(null, "Otsi i deti", "I.Turgenev", 2011);
        System.out.println(book2.toString());
        
        book.setYear(2012);
        System.out.println(book.toString());
        
        Reader reader = new Reader(null, "Ivan", "Ivanov", 10, 10, 2000);
        System.out.println(reader.toString());
                
        System.out.println("Выдача книги:");
        History history = new History();
        history.setId(null);
        history.setBook(book);
        history.setReader(reader);
        history.setTakeOnDate(new Date());
        System.out.println(history.toString());
        System.out.println("Возврат книги:");
        history.setReturnDate(new Date());
        System.out.println(history.toString());

        */
    }
}

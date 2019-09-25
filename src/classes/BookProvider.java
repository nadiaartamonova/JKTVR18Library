
package classes;

import entity.Book;
import java.util.Scanner;


public class BookProvider {
    public Book createBook(){
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        
        //----------------- Inset Data of book--------------------
        book.setId(null);
        
        System.out.println("Название: ");
        book.setTitle(scanner.nextLine());
        
        System.out.println("Автора: ");
        book.setAuthor(scanner.nextLine());
        
        System.out.println("Год издания: ");
        book.setYear(Integer.parseInt(scanner.nextLine()));
        
        System.out.println("Количество экз.: ");
        book.setQuantity(Integer.parseInt(scanner.nextLine()));
        
        System.out.println("Для сохранения книги в библиотеку нажмите y / n - отмена сохранения");
        
        String flag = scanner.next();
        if("y".equals(flag)){
            return book;
        }
        return null;
    }
}

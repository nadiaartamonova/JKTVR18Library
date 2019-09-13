/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ReaderProvider {
    public Reader createReader(){
        Reader reader = new Reader();
        Scanner scanner = new Scanner(System.in);
        
        //----------------- Inset Data of book--------------------
        reader.setId(null);
        
        System.out.println("Введите имя: ");
        reader.setName(scanner.nextLine());
        
        System.out.println("Введите фамилию: ");
        reader.setLastname(scanner.nextLine());
        
        System.out.println("Введите день рождения: ");
        reader.setDay(new Integer(scanner.nextLine()));
        
        System.out.println("Введите месяц рождения ");
        reader.setMonth(new Integer(scanner.nextLine()));
        
        System.out.println("Введите год рождения ");
        reader.setYear(new Integer(scanner.nextLine()));
        
        System.out.println(" Для сохранения читателя нажмите y / n - отмена сохранения");
        
        String flag = scanner.next();
        if("y".equals(flag)){
            return reader;
        }
        return null;
    }
}

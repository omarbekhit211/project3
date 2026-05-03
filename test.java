/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;
 import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author omar
 */
public class test {
   

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author omar
 */

    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("--- Welcome into our hotel reservation ---");
        System.out.println("------------------------------------------");
        
        System.out.println("Enter the admin");
        SystemManagement d1 = new SystemManagement();
        Manager j = new Manager("Ahmed dfd", "ahfe@", "01211545", "0#fFDSG$dsf",d1);
         Receptionist f= new Receptionist("hhfghff", "omfkd@", "24353546", "fgdfhD#y2");
         Customer r = new Customer("ahmed mahkouf", "df@dgfg", "0124584848", "dsFdh#55");
        
       
//         Room df= new Room(60, "available", 12, LocalDate.of(12, 01, 2026));
//         Room g =new Room(60, "available", 5, LocalDate.of(2026, 01, 9));//why it show error when write 09
        
         StandardRoom g =new StandardRoom("single", true,60,"available", 5);
         StandardRoom gfg =new StandardRoom("single", true,60,"available", 5);
         StandardRoom gg =new StandardRoom("single", true,60,"available", 5);
         Reservation d = new Reservation(r, g,12.5,"cash", "booked", LocalDate.of(2026, 1, 9), Period.of(1, 5, 0), f);
         System.out.println(d.toString());
         System.out.println(r.number_of_users);
         System.out.println(g.toString());
         System.out.println(gg.getRoom_number());
         
         
         
//         SystemManagement server = new SystemManagement();
//         server.registerUser(f);
//         server.login("omfkgd@","fgdfhD#y2");
//         server.menu(ewe);
        
          
        
        

     
         
    }
}

    

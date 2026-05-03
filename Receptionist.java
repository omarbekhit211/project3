/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author omar
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class Receptionist extends Employee{
  Customer customer;
  Room room;
  Receptionist createdBy;
  SystemManagement staffAccess;
    public Receptionist(String fullname, String email, String phone, String password) {
        super(fullname, email, phone, password);
        staffAccess.registerUser(this);
       
        
    }
    public Reservation makeReservation(Customer customer,Room room, double servicecharge, String paymentMethod, String status, LocalDate reservationDate, Period stayDuration )
    {    Reservation newReservation = new Reservation(customer, room, servicecharge, paymentMethod, status, reservationDate, stayDuration, this);
         staffAccess.addReservation(newReservation);
        System.out.println("The reserve set successfully by "+this.getFullname());
        return newReservation;
    }
    
    public void addReservation(Reservation reservation)
    { staffAccess.addReservation(reservation);
    }
    public void removeReservation(Reservation reservation)
    {staffAccess.removeReservation(reservation);
    }
     public String getAllReservation_String()
     { return staffAccess.getAllReservation_String();
     }
     public ArrayList<Reservation> geAllReservation_Array()
     {return staffAccess.geAllReservation_Array();
     }
     
     
    @Override
    public String getRole() {
      return "Staff";
    }
    
    

    
}

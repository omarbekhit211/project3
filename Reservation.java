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
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omar
 */
public  class Reservation  {
//     protected String reservationID=UUID.randomUUID().toString();
      private Customer customer;
      private Room room;
      LocalDate reservationDate;
      LocalDate endOfReservation;
      private Period stayDuration;
      DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String formattedDate;
      String formattedEndofDate;
      private  int reservationId;
       private Receptionist createdBy;
      ArrayList<Integer> id= new ArrayList<>();
      

    public Reservation(Customer customer, Room room, double  servicecharge, String paymentMethod,String status,LocalDate reservationDate, Period stayDuration,Receptionist createdBy) { 
        this.customer=customer;
        this.room=room;
        room.setStatus(status);
        this.reservationDate= reservationDate;
        formattedDate= this.reservationDate.format(formatter);
//       reservationDate.plusDays(5);
        this.stayDuration=stayDuration;
        this.endOfReservation= this.reservationDate.plus(stayDuration);
        formattedEndofDate= endOfReservation.format(formatter);
        setReservationId(reservationId);
        this.createdBy= createdBy;
        Payment pay = new Payment(reservationId, room.getPricePerNight(), servicecharge, paymentMethod, this.createdBy);
    }
   
//  public String getReseverationDetails(){return Reservation.toString();}

    
      @Override
    public String toString() {
        return "Reservation{" + "customer=" + customer + ", room=" + room + ", reservationDate=" + formattedDate + ", endOfReservation=" + formattedEndofDate + ", stayDuration=" + stayDuration +", reservationId=" + reservationId + ", createdBy=" + createdBy + '}';
    }

    




  
    
    public void setReservationId(int reservationId)
    { do{this.reservationId= (int)(50+(100000+Math.random()*(999999-100000)));} while (id.contains(reservationId));
     id.add(reservationId);
    
    }
    
    
//    public void getCustomerResrvations

    public int getReservationId() {
        return reservationId;
    }
    
}


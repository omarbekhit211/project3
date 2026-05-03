/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;
import java.util.UUID;
/**
 *
 * @author omar
 */
public class Payment {
    
        // Instance fields
        private String paymentId ;
        private int bookingId ;
        private double roomCharge ;
        private double serviceCharge ;
        private double taxAmount ;
        private double finalAmount ;
        private String paymentMethod ;
        
        private double subtotal ;
         

        // Constructor
        public Payment(int bookingId , double roomCharge , double serviceCharge , String paymentMethod, Receptionist CreatedBy )
        {
            setPaymentID();
            this.bookingId=bookingId ;
            this.roomCharge= roomCharge ;
            this.serviceCharge=serviceCharge ;
            this.paymentMethod= paymentMethod ;
            showInvoice();
        }

        // to calculateFinalAmount

        public void calculateFinalAmount ()

        { double subtotal = this.roomCharge + this.serviceCharge ;
            this.taxAmount = subtotal * 0.14 ;
            this.finalAmount = subtotal + this.taxAmount ;
        }
        // method to read final result
        public void showInvoice ()
        { System.out.println("Payment Id:" + paymentId+",Total Price = " + finalAmount+" EGP");

        }
        
       public void setPaymentID()
       { this.paymentId= UUID.randomUUID().toString();
       }
        
        
}


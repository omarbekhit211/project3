/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author omar
 */
public class Suit extends Room{
    int number_of_rooms;

//    public Suit( int number_of_rooms, double PricePerNight, int capacity, String status) {
//        super(PricePerNight, capacity, status);
//        this.number_of_rooms = number_of_rooms;
//    }

    public Suit(int number_of_rooms, double PricePerNight, String status, int capacity) {
        super( PricePerNight, status, capacity);
        this.number_of_rooms = number_of_rooms;
        setRoomType("Suit");
        
    }

    
    

   
    
    
}
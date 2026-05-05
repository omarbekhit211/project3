/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

import java.util.ArrayList;

/**
 *
 * @author omar
 */
public  class SystemManagement 
{
    private   ArrayList<User> usersDatebase= new ArrayList<>();
    private  ArrayList<Room> allRooms= new ArrayList<>();
    private  ArrayList<Reservation> allReservations= new ArrayList<>();
    
    // User
    
    public void registerUser(User u)
    { usersDatebase.add(u);
        System.out.println("The object add Successfully");
    }
    
    public void removeUser(User u)
    {
        usersDatebase.remove(u);
        System.out.println("The object removed Successfully");
    }
     public String getAllUsers_String(){return usersDatebase.toString();}
     public ArrayList getAllUsers_Array(){return usersDatebase;}
     // Reservation
    
    public void addReservation(Reservation reservation)
    {
        allReservations.add(reservation);
        System.out.println("The reservation saved to  the database successfully");
    }
   
    public void removeReservation(Reservation reservation)
    {
        allReservations.remove(reservation);
        System.out.println("The reservation deleted from the database successfully");
    }
    
     public String getAllReservation_String(){ return allReservations.toString();}
    
     public ArrayList<Reservation> geAllReservation_Array(){return allReservations;}

    //Room
    
    public void addRoom(Room room)
    {
        allRooms.add(room);
        System.out.println("The room saved to the database successfully");
     
    
    }
   
    public void removeRoom(Room room)
    {
        allRooms.remove(room);
        System.out.println("The room removed from the database successfully");
     
    
    }

    public  Room findRoom(int capacity)
      { 
          for (int x=0; x<allRooms.size();x++) { if(allRooms.get(x).getCapacity()>= capacity && allRooms.get(x).getStatus().equalsIgnoreCase("available") ){return allRooms.get(x);}}  System.out.println("There is no room has capacity of "+capacity+", and Available"); return null;
      }
//    public Room findRoom(int capacity)
//      {
//          for (Room room:allRooms) {if(room.getCapacity()>= capacity && room.getStatus().equalsIgnoreCase("available") ){return room;}}  System.out.println("There is no room has capacity of "+capacity+", and Available"); return null;
//      }
    
   
      public ArrayList<Room> getAllRooms_Array(){return allRooms;}
    
      public String getAllRooms_String(){ return allRooms.toString();}
      //Customer
//      public String getAllCustomerReservations_String()
//      {
//          for(Customer customer : allReservations){if(allReservations.contains(customer))
//      
//      }

   
    
}

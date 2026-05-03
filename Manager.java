/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author omar
 */
import java.util.ArrayList;



public class Manager extends Employee{
//    SystemManagement forManager= new SystemManagement();
      private SystemManagement managerAccess;
   
    
    
  

    public Manager(String fullname, String email, String phone, String password,SystemManagement managAccess) {
        super(fullname, email, phone, password);
        salary+=7000;
        managerAccess.registerUser(this);
        this.managerAccess=managAccess;
//        if(number_of_users!=1){   return;}
    }
    
    
    public void registerUser(User u)
    { managerAccess.registerUser(u);
    }
    public void removeUser(User u)
    {
       managerAccess.removeUser(u);
    }

       public void addReservation(Reservation reservation)
    {
        managerAccess.addReservation(reservation);
    }
    public void removeReservation(Reservation reservation)
    {
       managerAccess.removeReservation(reservation);
    }
    
      public void addRoom(Room room)
    {
        managerAccess.addRoom(room);
     
    
    }
      
      public void removeRoom(Room room)
    {
       managerAccess.removeRoom(room);
     
    
    }
      
        
      public String getAllRooms_String(){ return managerAccess.getAllRooms_String();}
      public ArrayList<Room> getAllRooms_Array(){return managerAccess.getAllRooms_Array();}
      public Room findRoom(int capacity)
      {
          for (Room room:managerAccess.getAllRooms_Array()) {if(room.getCapacity()>= capacity && room.getStatus().equalsIgnoreCase("available") ){return room;} else {System.out.println("There is no room has capacity of "+capacity+", and Available"); }}return null;
      }
      public String getAllReservation_String(){ return managerAccess.getAllReservation_String();}
      public ArrayList<Reservation> geAllReservation_Array(){return managerAccess.geAllReservation_Array();}
//    
//    
//    
//    
//    
//    
//    public void addRoom(Room room)
////    {
////        forManager.addRoom(room);
////    }
////    public void removeRoom(Room room)
////    {
////        forManager.removeRoom(room);
////    }
////    
//           
////    public void  addUser(User user){user= new User(fullname, email, phone, password);}
    
    @Override
     public String getRole()
     {
         return "Adminstrator";
     }
    

   
    
}

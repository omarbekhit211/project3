/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author omar
 */
public class StandardRoom extends Room{
   protected String bedType;
//   protected enum bedType{Double,Single};
    
   protected boolean hasBalcony;
      

 

    public StandardRoom(String bedType, boolean hasBalcony,  double PricePerNight, String status, int capacity, SystemManagement sys) {
        super( PricePerNight, status, capacity, sys);
        bedType(bedType);
        this.hasBalcony = hasBalcony;
        setRoomType("StandardRoom");
        
    }
   
   
   

//    public StandardRoom(  double PricePerNight, int capacity,String status ,String bedType , boolean hasBalcony) {
//        super( PricePerNight, capacity, status);
////        this.bedType=chosetTType;
////          befdType=chosetTType.toString();
//        bedType(bedType);
//        this.hasBalcony = hasBalcony;
//    }

    public void bedType(String bedType)
    {
        if(bedType.equalsIgnoreCase("Single")){this.bedType= bedType.toUpperCase();}
        else if(bedType.equalsIgnoreCase("Double")){this.bedType= bedType.toUpperCase();}
        else {System.out.println("Enter a valid bedtype (Single or Double)");}
    
    }

    @Override
    public String toString() {
        return "StandardRoom{" + "room_number=" + getRoom_number()+  ", PricePerNight=" + getPricePerNight() + ", status=" + getStatus() + ", capacity=" + getCapacity() + ", roomType=" + getRoomType() + ", bedType=" + bedType + ", hasBalcony=" + hasBalcony + '}';
    }
    
    
    
    

  
    
}

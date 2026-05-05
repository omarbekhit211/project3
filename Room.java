/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author omar
 */
public  abstract class Room  {
    private int room_number;
    private static int count=0;
    private double PricePerNight;
    static protected enum status{Available,Booked,Cleaning,Maintenance};
    private String status;
    private int capacity;
    private String roomType;
    protected enum type {StandardRoom,Suit};
    private SystemManagement sys ;
    
   
    
 

    public Room( double PricePerNight, String status, int capacity, SystemManagement sys) {
       
//        setRoom_number();
        this.PricePerNight = PricePerNight;
        setstatus(status);
        this.capacity = capacity;
        this.sys=sys;
        room_number= this.sys.getAllRooms_Array().size()+1;
        sys.addRoom(this);
        

    }
    
//    public void setRoom_number()
//    {
//        count++;
//        this.room_number=count;
//    }
    public int getRoom_number()
    { return room_number;
    }

    public double getPricePerNight() {
        return PricePerNight;
    }

    public String getStatus() {
        return status;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
     public int getCapacity() {
        return capacity;
    }
    
    public void setstatus(String status)
    { 
       if(status.equalsIgnoreCase("available")||
        status.equalsIgnoreCase("booked")||
       status.equalsIgnoreCase("cleaning")||
       status.equalsIgnoreCase("maintenance")){this.status=status.toUpperCase();}
       else {System.out.println("Write the status correctly (Available,Booked,Cleaning,Maintenance)");}
    }
    
    
    
//    public void setRoomType(String roomType)
//    {
//        if(roomType.equalsIgnoreCase("StandardRoom")){StandardRoom room;}
//                else if( roomType.equalsIgnoreCase("Suit")){Suit room;}
//                else{System.out.println("Write roomType correctly (StandardRoom, Suit)");}
//    }

    @Override
    public String toString() {
        return "Room{" + "room_number=" + room_number +  ", PricePerNight=" + PricePerNight + ", status=" + status + ", capacity=" + capacity + ", roomType=" + roomType + "}";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    
    
}

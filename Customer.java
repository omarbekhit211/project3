/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author omar
 */
public class Customer extends User
{   
    final protected int customer_id= getUser_id();
    private SystemManagement customerAccess;
    public Customer(String fullname, String email, String phone, String password, SystemManagement sys) {
        super(fullname, email, phone, password, sys);
//        customerAccess.registerUser(this);
    }

  
    
    /**
     *
     * @return
     */

    @Override
    public String getRole() {
        return  "User";
    }

  

   
    
}

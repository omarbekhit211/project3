/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author omar
 */
public abstract class Employee extends User{
    private SystemManagement sys;
    final protected int emplyee_id=getUser_id();
    protected double salary=7000;
    public Employee(String fullname, String email, String phone, String password,SystemManagement sys) {
        super(fullname, email, phone, password, sys);

//        sys.registerUser(this);
    }
//
//    @Override
//    public String toString() {
//        return "Employee{" + "emplyee_id=" + emplyee_id + ", salary=" + salary + '}';
//    }
//

    
}

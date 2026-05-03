package project2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author omar
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;


  public abstract class User  implements Serializable
{

    private String fullname,phone,email,password,role;
    
//       protected String phone,email,password;
//      protected String fullname,
//       protected String email,password;
//    protected String fullname,phone,email,password;
       
       private int user_id;
       ArrayList<Integer> id=new ArrayList<>();

//       protected boolean isAdmin;
       protected Manager manager;
      
//       protected boolean login;
//       static int count=1;
       protected static int number_of_users=0;

    public  User(String fullname, String email, String phone, String password) {
        setName(fullname);
        SetEmail(email);
        setPhone(phone);
        setPass(password);
        setUniqueID();
//        this.createdBy=createdBy;
        number_of_users++;
       
        getRole();
//                if(count == 2){ this.role.Admin;}

//        this.user_id=(int) ( 100000+ Math.random()*(999999-100000) );
//        this.user_id=count;
               
//        this.user_id=count;
//        count++;
//        number_of_users=(count-1 );
    }
        

    @Override
    public String toString() {
        return "User{" + "Fullname=" + fullname + ", user_id=" + user_id + ", email=" + email + ", phone=" + phone + ", password=" + password + ", role=" + getRole() + '}';
    }
    
       


    
 

 public void setPass(String password)
 { int required_lenth=6;
  int max_lenth=64;
   if(password.isBlank()) {System.out.println("The password mustn't be empty");return;}
   if(password.contains(" ")) {System.out.println("The password mustn't be contain spaces");return;}
   if (password.length()<required_lenth) {System.out.println("The password must be at least "+required_lenth); return;}
   if (password.length()>max_lenth) {System.out.println("The password musn't be exceed "+max_lenth); return;}

  if(!password.matches(".*[@$&!#].*")){System.out.println("The password must at least contain one Special character !,@,#,$,&");return;}  
  if(!password.matches(".*[A-Z].*")){System.out.println("The password must at least contain one Uppercase character");return;}  
  if(!password.matches(".*[a-z].*")){System.out.println("The password must at least contain one Lowercase character");return;}  
  if(!password.matches(".*[0-9].*")){System.out.println("The password must at least contain one number");return;}  
  if(password.matches(".*(.)\\1{2,}.*")){System.out.println("Repeating characters are not allowed for more than 2 times");return;}  
  

  else {this.password=password; System.out.println("The password Set succesfully");}  
 }

public void setName(String fullname)
{ int required_lenth=5;
   if(fullname.length()<required_lenth){System.out.println("The name must be at least "+required_lenth+" letters");}
   if(fullname.isBlank()) {System.out.println("The name mustn't be empty");return;}
   if(!fullname.matches(".*[A-Z].*")&&!fullname.matches(".*[a-z].*")){System.out.println("The name must contain letters");return;}    
   if(fullname.matches(".*[0-9].*")||fullname.matches(".*[~!@#$%^&*()_+-/|{}].*")){System.out.println("The name mustn't be contain numbers or special cases");return;}    
   
//   if(fullname.contains(" ")) {System.out.println("The name mustn't be contain spaces");return;}
//   if (fullname.length()<required_lenth) {System.out.println(count+".The name must be at least "+required_lenth); return;} 
  
   else {this.fullname=fullname; System.out.println("The name Set succesfully"); }
  
}

 public void SetEmail(String email) {
   if(email.isBlank()) {System.out.println("The email mustn't be empty");return;}
   if(email.contains(" ")) {System.out.println("The email mustn't be contain spaces");return;}
   if(!email.contains("@")){System.out.println("The email must contain '@'");return;}

   else {this.email=email; System.out.println("The email set successfully"); }       
    }
  public void setUniqueID()
  { do{this.user_id= (int)(100000+Math.random()*(999999-100000));} while (id.contains(user_id));
  id.add(user_id);
  
  }
 
 public void setPhone(String phone)
 {
     if(phone.isBlank()){System.out.println("The phone mustn't be empty");return;}
     if(phone.contains(" ")){System.out.println("The phone mustn't be contain spaces");return;}
     if(!phone.matches(".*[0-9].*")){System.out.println("The phone must be contain integer numbers");return;}
     if(phone.matches(".*[A-Z].*")||phone.matches(".*[a-z].*")||phone.matches(".*[~!@#$%^&*()_+-/|{}].*")){System.out.println("The phone mustn't be contain letters or special cases");return;}
     
     else {this.phone= phone; System.out.println("The phone number set successfully");}
 }
 
// public boolean login(String email, String password)
//  { 
//    if(!email.equalsIgnoreCase(this.email) || !password.equals(this.password)) {System.out.println("Login failed, change the the email or password and try again");}
//    else if(email.equalsIgnoreCase(this.email) && password.equals(this.password)) { System.out.println("Login Success");login =true;}
//    return login;
//  }
// 
  public void updateProfile( String email,String phone, String password)
  {
      SetEmail(email);
      setPhone(phone);
      setPass(password);
  }
  
  public void updatePass(String password)
  {
      setPass(password);
  }
  
//  public boolean isAdmin()
//  { /*manager.isAdmin=true; role="Admin"; return  isAdmin;*/
//    if(number_of_users==1){isAdmin=true; role="Admin";} return isAdmin;  
//  }
  
  public abstract String getRole();

    public String getFullname() {
        return fullname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getUser_id() {
        return user_id;
    }







}


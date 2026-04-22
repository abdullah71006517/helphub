package service;

import model.DB_service;
import model.user;
import org.w3c.dom.ls.LSInput;
import util.Session;

import java.util.ArrayList;
import java.util.Scanner;


public class userservice {

   public boolean login(String username ,String password){

        DB_service service=new DB_service();
        ArrayList<user> users=service.call();
        for(user user:users){
            if(user.getName().equals(username) && user.getPassword().equals(password)){
                Session.currentUser = user;
                return true;
            }
        }
return false;

    }


   public void rigser (){
       String name,password;


       DB_service service=new DB_service();
        System.out.println("Enter your name ");
        Scanner scanner =new Scanner(System.in);
       name= scanner.nextLine();
       if(service.userExists(name)) throw new RuntimeException("Username already exists! ");

        System.out.println("Enter your Password");
        password=scanner.nextLine();
       user user=new user(name,password);


        service.put(user);



    }

    public void profile(){
        System.out.println("your profile :------");
        System.out.println("wecome "+Session.currentUser.getName()+"   stay with us ");
        System.out.println("your crdit :"+Session.currentUser.getCredit());
        System.out.println("totla help taken :"+Session.currentUser.getHelptaken());
        System.out.println("toal help given "+Session.currentUser.getHelpgiven());
        System.out.println("-------thakyou -----");

    }

}

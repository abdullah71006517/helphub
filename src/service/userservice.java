package service;

import model.DB_service;
import model.user;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Scanner;


public class userservice {

    boolean login(String username ,String password){
        ArrayList<user>users=new ArrayList<>();
        for(user user:users){
            if(user.getName().equals(username) && user.getPassword().equals(password)){
                return true;
            }
        }
return false;

    }


   public void rigser (){
       String name,password;
        System.out.println("Enter your name ");
        Scanner scanner =new Scanner(System.in);
       name= scanner.nextLine();
        System.out.println("Enter your Password");
        password=scanner.nextLine();

       user user=new user(name,password);

        DB_service service=new DB_service();
        service.put(user);



    }

}

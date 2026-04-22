import model.DB_service;
import model.user;
import service.userservice;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("wellocme to helphub");
        userservice userservice=new userservice();
        userservice.rigser();
        DB_service service=new DB_service();
        ArrayList<user> users=service.call();
        for (user u : users) {
            System.out.println(u.getName() + " " + u.getPassword());
        }
    }




    }


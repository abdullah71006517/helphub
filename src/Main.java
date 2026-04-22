import model.DB_service;
import model.user;
import service.userservice;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("wellocme to helphub");
        userservice userservice = new userservice();
        if(userservice.login("abdullah","1234")){
            userservice.profile();
        }
        userservice.rigser();


    }


    }


package model;

import java.io.IOException;
import java.util.ArrayList;

public class helpservice {
    DB_service D=new DB_service();
    public void createrequest(helprequest helprequest) throws IOException {


       D.postrequest(helprequest);

    }
    public  void showrequest() {

        ArrayList<helprequest> users = D.getrequest();
        for(helprequest helprequest:users){
            System.out.print(helprequest.id);
            System.out.print(" ");
            System.out.print(helprequest.tile);
            System.out.print(" ");
            System.out.print(helprequest.category);
            System.out.print(" ");
            System.out.print(helprequest.requestname);
            System.out.print(" ");
            System.out.print(helprequest.Status);
            System.out.print(" ");

            System.out.println(" ");

        }


    }



}

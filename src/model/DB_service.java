package model;

import java.io.*;
import java.util.ArrayList;

public class DB_service
{
    public void  put(user user){
        String line=user.getName()+","+user.getPassword()+","+user.getCredit()+","+user.getHelpgiven()+"," +user.getHelptaken()+"\n";
        try(RandomAccessFile raf= new RandomAccessFile("userdata.text","rw")) {
raf.seek(raf.length());
raf.writeBytes(line);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<user> call() {

        ArrayList<user>users=new ArrayList<>();

        try(BufferedReader reader=new BufferedReader(new FileReader("userdata.text"))){


            String line,name,password;
                    int credit,helptaken,helpgiven;

            while ((line = reader.readLine()) != null) {

             String[] parts=line.split(",");
              name=parts[0];
              password=parts[1];
                credit = Integer.parseInt(parts[2]);
                 helpgiven = Integer.parseInt(parts[3]);
                 helptaken = Integer.parseInt(parts[4]);
              user user=new user(name,password,credit,helptaken,helpgiven);
              users.add(user);


            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return users;

    }

    public boolean userExists(String name) {
        try (BufferedReader br = new BufferedReader(new FileReader("userdata.text"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data[0].equals(name)) {
                    return true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
public void postrequest(helprequest helprequest) throws IOException {
    String line=loadLastId()+","+helprequest.getTile()+","+helprequest.getCategory()+","+helprequest.getRequestname()+","+ helprequest.getStatus()+"\n";

    try(FileWriter fileWriter=new FileWriter("service.text",true)) {
        fileWriter.append(line);


    }
   catch (FileNotFoundException E){
        throw new RuntimeException("file not file ");

   }

}
public ArrayList<helprequest> getrequest(){
        ArrayList<helprequest> helprequests=new ArrayList<>();


        try(BufferedReader br=new BufferedReader(new FileReader("service.text"))){
            String line;
            while ( (line = br.readLine()) !=null){
                String parts[]=line.split(",");
                int id=Integer.parseInt(parts[0]);
                String tile=parts[1];
                String Category =parts[2];
                String  requestname=parts[3];
                String status=parts[4];

                helprequest helprequest=new helprequest(tile,Category,requestname,status );
                helprequests.add(helprequest);



            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    return helprequests;

}



    public static int loadLastId() {

        int lastId = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("service.text"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                lastId = Integer.parseInt(parts[0]); // first column = id
            }

        } catch (Exception e) {
            System.out.println("File not found or empty");
        }

        return lastId+1;
    }




}

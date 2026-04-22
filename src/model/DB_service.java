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

}

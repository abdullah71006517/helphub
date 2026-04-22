package model;

public class user {
    String name;
    String password;
     int credit ;
    int helptaken ;
    int helpgiven ;

    public user(String name, String password)
    {
        this.name=name;
        this.password=password;
        credit=0;
        helptaken=0;
        helpgiven=0;

            }

    public user(String name, String password, int credit, int helptaken, int helpgiven) {
        this.name = name;
        this.password = password;
        this.credit = credit;
        this.helptaken = helptaken;
        this.helpgiven = helpgiven;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getHelptaken() {
        return helptaken;
    }

    public void setHelptaken(int helptaken) {
        this.helptaken = helptaken;
    }

    public int getHelpgiven() {
        return helpgiven;
    }

    public void setHelpgiven(int helpgiven) {
        this.helpgiven = helpgiven;
    }



}

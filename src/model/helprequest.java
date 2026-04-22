package model;

public class helprequest

{

    int id;
    static int counter = 1;
String tile;
String category ;
String Status ;
String requestname;

    public helprequest(String tile,  String category, String status) {
        this.tile = tile;
        this.id=++counter;
        this.category = category;
        Status = status;

        this.requestname = requestname;
    }

    public helprequest(String tile, String category, String requestname, String status) {


        this.tile = tile;
        this.id=++counter;
        this.category = category;
        Status = status;

        this.requestname = requestname;

    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        helprequest.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getRequestname() {
        return requestname;
    }

    public void setRequestname(String requestname) {
        this.requestname = requestname;
    }
}

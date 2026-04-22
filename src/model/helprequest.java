package model;

public class helprequest

{
static  int id;
String tile;
String category ;
String Status ;
String requestname;

    public helprequest(String tile,  String category, String status, String requestname) {
        this.tile = tile;
        id++;
        this.category = category;
        Status = status;

        this.requestname = requestname;
    }
}

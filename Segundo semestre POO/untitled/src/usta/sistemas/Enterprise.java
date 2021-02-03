package usta.sistemas;

public class Enterprise {

    private int id;
    private String name;

    public Enterprise() {
    }

    public Enterprise(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public  String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }
}

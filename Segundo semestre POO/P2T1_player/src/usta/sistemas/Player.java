package usta.sistemas;

public class Player {
    //Attributes of class Player
    private int id;
    private String name;

    public Player(){}

    public Player(int id, String name){
        this.id = id;
        this.name = name;

    }

    //Constructors
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;

    }
}

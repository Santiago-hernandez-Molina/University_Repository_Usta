package usta.sistemas;


public class Author {
    //Attributes of class Author
    private int id;
    private String name;

    public Author(){}

    public Author(int id, String name){
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

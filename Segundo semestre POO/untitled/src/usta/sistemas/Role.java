package usta.sistemas;

public class Role {
    private int id;
    private String name;
    private String roleDescription;
    private Double salary;

    public Role(int id, String name, String roleDescription,Double salary){
        this.id = id;
        this.name = name;
        this.roleDescription = roleDescription;
        this.salary = salary;

    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return  this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setRoleDescription(){

    }
}

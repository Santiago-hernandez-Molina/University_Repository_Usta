package model;
/*
 *Author: Santiago Hernandez Molina
 *Date: 20/11/2020
 *Description: This class contain the attributes of Student
 */

public class Student {
    private int id;
    private String code;
    private String name;
    private String lastName;
    private String birthdate;
    private String EnterDate;
    private String faculty;
    private int semester;



    public Student( int id,String code, String name, String lastName, String birthdate, String EnterDate, String faculty,int semester) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.EnterDate = EnterDate;
        this.faculty = faculty;
        this.semester=semester;

    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEnterDate() {
        return EnterDate;
    }

    public void setEnterDate(String enterDate) {
        EnterDate = enterDate;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", EnterDate='" + EnterDate + '\'' +
                ", faculty='" + faculty + '\'' +
                ", semester=" + semester +
                '}';
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}

package Challenge_2;

public class Student {

    private String firstName;
    private String lastName;
    private String pantherID;
    private double gpa;

    //This is the constructor:
    public Student(String firstName, String lastName, String pantherID, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pantherID = pantherID;
        this.gpa = gpa;

    }

    //The following are getters and setters:
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPantherID() {
        return pantherID;
    }

    public void setPantherID(String pantherID) {
        this.pantherID = pantherID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //This is the toString method:
    public String toString() {
        return "Student [" + "First Name: " + firstName + ", Last Name: " + lastName +
                ", Panther ID: " + pantherID + ", GPA: " + gpa + ']';
    }
}

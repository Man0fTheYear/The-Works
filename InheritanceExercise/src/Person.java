public class Person {
    protected String FirstName;
    protected String MiddleInitial;
    protected String LastName;
    protected String Gender;

    public Person(String FirstName, String MiddleInitial, String LastName, String Gender){
        this.FirstName = FirstName;
        this.MiddleInitial = MiddleInitial;
        this.LastName = LastName;
        this.Gender = Gender;
    }
    public String toString() {
        return "First Name: " + this.FirstName + " " + "Middle Initial: " + this.MiddleInitial + " " + "Last Name: " + this.LastName +  " " + "Gender: " + this.Gender + " ";
    }
}

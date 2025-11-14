public class Person
{
    private String firstname;
    private String lastname;
    private int age;
    private int SSN;
    public Person(String thefirstname, String thelastname, int theage, int theSSN) {
        firstname = thefirstname;
        lastname = thelastname;
        age = theage;
        SSN = theSSN;
    }
    public void print() {
        System.out.println("SNN: " + SSN);
        System.out.println("\tName: " + firstname + " " + lastname);
        System.out.println("\tAge: " + age);
    }
}

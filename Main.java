import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);
    int Prompt;
    System.out.println("Which Problem?: ");
    Prompt = sc.nextInt();

    if (Prompt == 1 ) {
    String Firstname;
    String lastname;
    int age;
    int SSN;
    sc.nextLine(); // buffer
    System.out.println("Enter the person's first name: ");
    Firstname = sc.nextLine();
    System.out.println("Enter the person's last name: ");
    lastname = sc.nextLine();
    System.out.println("Enter the person's age: ");
    age = sc.nextInt();
    System.out.println("Enter the person's social security number: ");
    SSN = sc.nextInt();
    
   Person person1 = new Person(Firstname, lastname, age, SSN);
   person1.print();

    } else if (Prompt == 2) {
      int maxTemp;
      int starttemp;
      String preheat = "";

      System.out.println("Maximum oven temperature: ");
      maxTemp = sc.nextInt();
      System.out.println("Starting temperature of the oven: ");
      starttemp = sc.nextInt();
      sc.nextLine(); // buffer

      Oven JohnPork = new Oven(maxTemp, starttemp);
      System.out.println(JohnPork.toString());

      while (!(preheat.equals("q"))) 
      {
        System.out.println("to preheat the oven enter \"p\", to turn the oven off enter \"o\", to restart enter \"r\", to quit enter \"q\""); 
        preheat = sc.nextLine().trim(); // trim = buffer?

      if (preheat.equals("p")) 
      { 
        System.out.println("Enter the temperature to preheat the oven to: ");
        int pretemp = sc.nextInt();
        sc.nextLine();
        JohnPork.preheat(pretemp);
        System.out.println("Current temperature of the oven is now " + JohnPork.getCurrentTemp() + " degrees\n");
        System.out.println(JohnPork.toString());
      } 
      else if (preheat.equals("o")) 
      {
        JohnPork.turnOff();
        System.out.println("Turning the oven off\n");
        System.out.println(JohnPork.toString());
      }

      }
      }
  }
}

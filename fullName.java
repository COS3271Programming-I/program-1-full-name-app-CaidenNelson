import java.util.Scanner;

public class FullName {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {

        String firstName;
        String middleName;
        String lastName;
        String fullName;

        System.out.println("What is your first name?");
        firstName = userinput.nextLine();

        System.out.println("What is your middle name?");
        middleName = userinput.nextLine();

        System.out.println("What is your last name?");
        lastName = userinput.nextLine();

        fullName =firstName +' '+ middleName +' '+ lastName;

        System.out.println(fullName);
    }
}

import java.util.Scanner;

public class EmailGenerator
{
    public static String makeUserName(String firstName, String lastName)
    {
        String userName = firstName.charAt(0)+lastName+(int)Math.floor(Math.random()*99+10);
        return userName;
    }
    public static String makeEmail(String user, String emailProvider)
    {
        String email = user+"@"+emailProvider;
        return email;

    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your first name in all lowercase: ");
        String firstName = s.nextLine();
        System.out.print("Please enter your last name in all lowercase: ");
        String lastName = s.nextLine();
        System.out.print("Please enter the email provider you will be using (for example gmail.com): ");
        String emailProvider = s.nextLine();
        String user = makeUserName(firstName, lastName);
        String email = makeEmail(user,emailProvider);
        System.out.print("Your new generated email address is "+ email);
    }






}

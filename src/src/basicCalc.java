import java.util.Scanner;

public class basicCalc
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b;
        int choice;
        System.out.print("Enter the first number: ");
        a=in.nextInt();
        System.out.print("\nEnter the second number: ");
        b=in.nextInt();
        System.out.println("What arithmetic operation you want to use? ");
        System.out.println("Enter 1 to add.     Enter 2 to sub.     Enter 3 to multiply.        Enter to divide.");
        choice=in.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("The addition result of given two numbers is: "+(a+b));
                break;
            case 2:
                System.out.println("The subtraction result of given two numbers is: "+(a-b));
                break;
            case 3:
                System.out.println("The multiplication result of given two numbers is: "+(a*b));
                break;
            case 4:
                System.out.println("The division result of given two numbers is: "+(a/b));
                break;
            default:
                break;
        }
    }
}

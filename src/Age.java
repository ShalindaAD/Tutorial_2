import java.util.*;
public class Age{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num = scanner.nextInt();
        if (num >= 18) {
            System.out.println("Over 18");
        } else if (0 < num && num < 18) {
            System.out.println("Under 18");
        } else {
            System.out.println("The age entered is incorrect");
        }
        scanner.close();
    }
}

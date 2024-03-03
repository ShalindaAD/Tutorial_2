import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter indicator score: ");
        int score = scanner.nextInt();
        if (score > 100){
            System.out.println("Invalid Value");
        } else if (score >= 70 && score <= 100){
            System.out.println("1st Class Hounours (1)");
        } else if (score >= 60 && score <= 69){
            System.out.println("2nd Class Hounours Upper Division (2.i)");
        } else if (score >= 50 && score <= 59){
            System.out.println("2nd Class Hounours Upper Division (2.ii)");
        } else if (score >= 40 && score <= 49){
            System.out.println("3rd Class Hounours (3)");
        } else {
            System.out.println("Invalid Value");
        }
        scanner.close();
    }
}


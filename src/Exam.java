import java.util.Scanner;
public class Exam{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of classes held : ");
        int class_held = scanner.nextInt();
        System.out.print("Enter number of classes attended : ");
        int class_attend = scanner.nextInt();
        double precentage = ((double)class_attend / class_held)*100;
        System.out.print("Your Precentage is :"+precentage);
        if (precentage > 75){
            System.out.println("You can sit on exame");
        } else{
            System.out.println("You can not sit on exame");
        }

        scanner.close();
    }
}


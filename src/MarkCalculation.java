import java.util.Scanner;
public class MarkCalculation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ICT mark: ");
        float ict = scanner.nextFloat();
        System.out.print("Enter your CW mark: ");
        float cw = scanner.nextFloat();
        if (ict >= 30 && cw >= 30) {
            double finalmark = (ict + cw)/2;
            if (finalmark >= 40) {
                System.out.println ("Your Final Mark is : " +finalmark +" And you PASS the module");
            } else {
                System.out.println ("Your Final Mark is : " +finalmark +" And you FAIL the module");
            }
        } else {
            System.out.println("You FAIL the module");
        }
        scanner.close();
    }
}


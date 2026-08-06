import java.util.Scanner;

public class Pr2 {
    public static boolean three(int n){
        int ones = n%10;
        int tens = (n%100)/10;
        int hundreds = (n%1000)/100;
        int thousands = n/1000;
        if(ones==3 || tens==3 || hundreds==3 || thousands==3){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int n = scanner.nextInt();
        System.out.println("there is number '3': "+three(n));
    }
}
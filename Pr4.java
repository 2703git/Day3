import java.util.Scanner;

public class Pr4 {
    public static String seasons(int m){
        switch (m){
            case 1:
                return "Winter";
            case 2:
                return "Winter";
            case 3:
                return "Spring";
            case 4:
                return "Spring";
            case 5:
                return "Spring";
            case 6:
                return "Summer";
            case 7:
                return "Summer";
            case 8:
                return "Summer";
            case 9:
                return "Autumn";
            case 10:
                return "Autumn";
            case 11:
                return "Autumn";
            case 12:
                return "Winter";
        }
        return "No seasons match!";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for month: ");
        int m = scanner.nextInt();
        System.out.println("Season: "+seasons(m));
    }
}
import java.util.Scanner;

public class Pr3 {
    public static int positive(int a, int b, int c, int d, int e){
        int count = 0;
        if (a>0) count++;
        if (b>0) count++;
        if (c>0) count++;
        if (d>0) count++;
        if (e>0) count++;
        return count;
    }
    public static int negative(int a, int b, int c, int d, int e){
        int count = 0;
        if (a<0) count++;
        if (b<0) count++;
        if (c<0) count++;
        if (d<0) count++;
        if (e<0) count++;
        return count;
    }
    public static int zero(int a, int b, int c, int d, int e){
        int count = 0;
        if (a==0) count++;
        if (b==0) count++;
        if (c==0) count++;
        if (d==0) count++;
        if (e==0) count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.print("Enter d: ");
        int d = scanner.nextInt();
        System.out.print("Enter e: ");
        int e = scanner.nextInt();
        System.out.println("Positive: "+positive(a,b,c,d,e));
        System.out.println("Negative: "+negative(a,b,c,d,e));
        System.out.println("Zero: "+zero(a,b,c,d,e));
    }
}
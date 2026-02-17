import java.util.Scanner;

public class AreaOfCircle {
    final double PI = 3.1419;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area;
        area = (3.1419 * radius * radius);
        System.out.println(area);
        sc.close();

    }
}


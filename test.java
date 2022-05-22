import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        double l1,l2,l3;
        Scanner input= new Scanner(System.in);
        System.out.print("Write the each edge of triangle  \n");
        l1=input.nextDouble();
        l2=input.nextDouble();
        l3=input.nextDouble();

        System.out.print("Area = " + (Math.sqrt((l1+l2+l3)/2 * ((l1+l2+l3)/2-l1) * ((l1+l2+l3)/2 -l2 ) * ((l1+l2+l3)/2 -l3 )) ));
    }
}

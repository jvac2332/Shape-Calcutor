import java.util.Scanner;

public class App {

   
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("*****************************************");
    System.out.println("           Shape-Calucator               ");
    System.out.println("*****************************************");

    boolean run = true;
    while (run){
        System.out.print("Enter the shape (C for circle, R for rectangle, T for triangle, Q to quit): ");
        String shape = scan.next().toUpperCase().trim();
        if (shape.equals("C")){
            System.out.print("Enter the radius: ");
            int radius = scan.nextInt();
            double area = Math.PI * radius;
            double circumference = 2 * Math.PI * radius;
            System.out.printf("The area of the circle is %.2f and the circumference is %.2f\n",area,circumference);

             }
             else if(shape.equals("R")){
                System.out.print("Enter the length and width: ");
                int length = scan.nextInt();
                int width = scan.nextInt();
                double area = length * width;
                double perimeter = 2*length + 2*width;
                System.out.printf("The area of the rectangle is %.2f and the perimeter is %.2f\n",area , perimeter);
              }
             else if(shape.equals("T")){
                System.out.print("Enter the length of the three sides: ");
                double side1 = scan.nextDouble();
                double side2 = scan.nextDouble();
                double side3 = scan.nextDouble();
                double s = (side1 +side2 + side3) /2;
                double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
                double perimeter = s*2;
                System.out.printf("Enter area of the triangle is %.2f and the perimeter is %.2f \n",area, perimeter);
             }
             else if (shape.equals("Q")){
                run = false;
             }
             else {
                System.out.print("input not valid");
             }
      }     
    }
}

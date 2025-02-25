// ScientificCalculator.java
// Author: Girish Kumar Sahu
// Date: 25th Feb 2025
// Mini Project: Scientific Calculator with DevOps

import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    System.out.println("Square Root: " + Math.sqrt(num));
                    break;
                    
                case 2:
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println("Factorial: " + factorial(n));
                    break;
                    
                case 3:
                    System.out.print("Enter number: ");
                    double x = sc.nextDouble();
                    System.out.println("Natural Logarithm: " + Math.log(x));
                    break;
                    
                case 4:
                    System.out.print("Enter base (x): ");
                    double base = sc.nextDouble();
                    System.out.print("Enter exponent (b): ");
                    double exponent = sc.nextDouble();
                    System.out.println("Power: " + Math.pow(base, exponent));
                    break;
                    
                case 5:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
        
        sc.close();
    }
    
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}


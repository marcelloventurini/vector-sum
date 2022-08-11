package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the number quantity: ");
    int n = scanner.nextInt();
    double[] vect = new double[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Enter a number: ");
      vect[i] = scanner.nextDouble();
    }

    System.out.println("Values: ");

    for (int i = 0; i < vect.length; i++) {
      System.out.println(vect[i]);
    }

    double sum = 0;
    for (int i = 0; i < vect.length; i++) {
      sum += vect[i];
    }

    double avg = sum / vect.length;

    System.out.println("Sum: " + sum);
    System.out.println("Average: " + avg);

    scanner.close();
  }
}

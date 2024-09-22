package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Bubblegum= 202;
        int Toffee= 118;
        int  Icecream= 2250;
        int  Milkchocolate= 1680;
        int  Doughnut= 1075;
        int Pancake = 80;
        int total=Bubblegum+Toffee+Icecream+Milkchocolate+Doughnut+Pancake;
            
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");
        System.out.println();
        System.out.println("Income:"+" "+total);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();        
        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();
        int netIncome = total-staffExpenses-otherExpenses;
        System.out.println("Net income: $"+ netIncome);
                 
    }
}

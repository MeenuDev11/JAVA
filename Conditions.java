

public class Conditions {
    public static void main(String[] args) {
        
        // if else //

      /*   int Marks = 50;

        if (Marks >= 90) {
            System.out.println("Grade A");
        } else if (Marks >= 75) {
            System.out.println("Grade B");
        } else if (Marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        } 

        // comparison + logical operators //


        int age = 20;
        boolean hasID = true;

        // ============ COMPARISON ============
        System.out.println(age > 18);     // true
        System.out.println(age == 20);    // true
        System.out.println(age != 18);    // true
        System.out.println(age <= 20);    // true

        // ============ LOGICAL ============

        // AND (&&) - dono sach hone chahiye
        if (age >= 18 && hasID == true) {
            System.out.println("Entry mil sakti hai!");
        }

        // OR (||) - koi ek sach ho
        int num = 5;
        if (num == 3 || num == 5) {
            System.out.println("Number 3 ya 5 hai!");
        }

        // NOT (!) - condition ulti ho jaati hai
        boolean isRaining = false;
        if (!isRaining) {
            System.out.println("Bahar jao!");
        } 

        // ternary operators //


        int marks = 75;

        // Normal if/else (4 lines)
        String result;
        if (marks >= 60) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        // Ternary (1 line!) ✅
        String result2 = (marks >= 60) ? "Pass" : "Fail";

        System.out.println(result);   // Pass
        System.out.println(result2);  // Pass

        // Structure:
        // variable = (condition) ? value_if_true : value_if_false;

        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Bada number: " + max);  // 20 

        // Switch Statement //

        Scanner sc = new Scanner(System.in);
        System.out.print("Din ka number likho (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;          // ← ZAROORI! Warna neeche bhi chalega
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:             // ← Dono cases ek saath!
                System.out.println("Weekend! 🎉");
                break;
            default:            // ← Koi case match nahi hua
                System.out.println("Invalid number!");
        } */

        // Nested-if //

        int age = 20;
        boolean hasTicket = true;

        if (age >= 18) {
            System.out.println("Umar sahi hai!");

            if (hasTicket) {
                System.out.println("Entry mil gayi! 🎉");
            } else {
                System.out.println("Ticket nahi hai!");
            }

        } else {
            System.out.println("Umar kam hai!");
        }
    }

} 

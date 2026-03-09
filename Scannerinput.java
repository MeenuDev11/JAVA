import java.util.Scanner;  // scanner ko bulao //
public class Scannerinput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // scanner ko bnao //
        System.out.println("Apna naam likho:"); // user se puchho //

        String naam = sc.nextLine();  //  user ka jwab lo //

        System.out.println("Hello:" + naam); // use kro // 


        // scanner bug fix //

Scanner sc1 = new Scanner(System.in);

System.out.print("Umar likho: ");
int umar = sc.nextInt();
sc.nextLine();               // ← "\n" saaf karo!

System.out.print("Naam1 likho: ");
String naam1 = sc.nextLine(); // Ab sahi kaam karega!

System.out.println(naam1);    // ✅ Naam print hoga!

}
    
}

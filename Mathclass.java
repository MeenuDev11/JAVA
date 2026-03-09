public class Mathclass {
    public static void main(String[] args) {
        
        System.out.println(Math.max(10, 20));    // 20
        System.out.println(Math.min(10, 20));    // 10
        System.out.println(Math.abs(-15));       // 15
        System.out.println(Math.pow(2, 10));     // 1024.0
        System.out.println(Math.sqrt(25));       // 5.0
        System.out.println(Math.round(9.6));     // 10
        System.out.println(Math.random());       // 0.0 - 0.99

        // Dice //


        int dice = (int)(Math.random() * 6) + 1;
        System.out.println("Dice: " + dice);
    }
}
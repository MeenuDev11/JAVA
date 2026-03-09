public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic operators// 

        System.out.println("Addition:" + (a + b));
        System.out.println("Subtract:" + (a - b));
        System.out.println("Multiplication:" + (a * b));
        System.out.println("Divide:" + (a / b));
        System.out.println("Remainder:" + (a % b)); 

        // Assignment operators //

        int p = 10;

        p += 5;
        p -= 3;
        p *= 2;
        p /= 4;
        p %= 4;

        System.out.println(p); 

        // Increment , Decrement operators //
        
        int x = 5;
        
        x++;
        x--;

        System.out.println(x); 

        // Comparison operators // 

        int m = 10;
        int n = 5;

        System.out.println(m < n);
        System.out.println(m > n);
        System.out.println(m == n);
        System.out.println(m >= n);
        System.out.println(m <= n);
        System.out.println(m != n);

        

    }
    
}

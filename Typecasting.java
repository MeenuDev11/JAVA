/*  Type Casting — Ekdum Simple!

### Real life example:
```
1 liter bottle → 500ml bottle me daal sakte ho? ❌ Overflow!
500ml bottle   → 1 liter bottle me daal sakte ho? ✅ Easy!
```

Java me bhi aisa hi hai:
```
Chota → Bada = Automatic ✅
Bada  → Chota = Manual   ⚠️ */

// bade se chota //

public class Typecasting { 
    public static void main(String[] args) {
        
        double a = 10.0;
        int b = (int) a;

        System.out.println(b);

        // chote se bada //

        int m = 99;
        double n = m;

        System.out.println(n);

    }
    
}

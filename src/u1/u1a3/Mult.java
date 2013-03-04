package u1.u1a3;

public class Mult {
    private static int f(int a, int b) {
        if (b==0) return a;
        if (b%2 == 0) return f(2*a, b/2);
        else return a + f(2*a, b/2);
    }
    
    public static int mult(int a, int b) {

        return f(a, b);
    }
}

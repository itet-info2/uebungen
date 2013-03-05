package u1.u1a3;

public class Mult {
	private static int f(int a, int b) {
		if (b == 1)
			return a;
		if (b % 2 == 0)
			return f(2 * a, b / 2);
		else
			return a + f(2 * a, (b - 1) / 2);
	}

	public static int mult(int a, int b) {
		if (a < 1 || b < 1) {
			throw new IllegalArgumentException("a(" + a + ") or b(" + b + ") < 1");
		}
		return f(a, b);
	}
}

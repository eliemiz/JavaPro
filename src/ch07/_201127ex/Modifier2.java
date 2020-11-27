package ch07._201127ex;

public class Modifier2 {
	private int v1 = 10;
	int v2 = 20; // (default)
	protected int v3 = 30;
	public int v4 = 40;

	@Override
	public String toString() {
		return v1 + ", " + v2 + ", " + v3 + ", " + v4;
	}
}

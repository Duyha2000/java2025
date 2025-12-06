package Review.Sample2;

abstract class A {
    private int m = 5;
    protected int n = 7;

    public double func(double a) {
        return a + m - n;
    }

    public abstract int func(int a);
}
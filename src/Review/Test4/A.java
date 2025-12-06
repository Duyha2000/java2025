package Review.Test4;

class A {
    protected int x = 1, y = 2;

    public A() {
    }

    public void print() {
        System.out.print(x + ", " + y);
    }

    // sum 2 so:
    // access modifier (public/ private) + return_type(kieu tra ve -> nhin ket qua cua ham de viet)
    public int sum() {
        return x + y;
    }


}

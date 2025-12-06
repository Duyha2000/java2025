package Review.Test11;

class B extends A {
    int z;

    public B() {
        // super();  code an -> in cha ra truoc
        System.out.print("B ");
    }

    @Override
    public void print() {
        super.print();
        System.out.println(z);
    }
}
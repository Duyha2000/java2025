package Review.Sample;

public class Sum {

    // tong 3 so a + b + c
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // cung ten ham sum nhung chi co 2 parameter a b
    public int sum(int a, int b) {
        return a + b;
    }

    // cung ham sum nhung khac kieu du lieu:
    public double sum(double a, double b) {
        return a + b;
    }

    // khi 1 ham co nhieu bien the (khac kieu du lieu, khac tham so) -> goi la overloading: nap chong ham

    // Overriding va overloading

    // @Override: ke thua method cua cha
}

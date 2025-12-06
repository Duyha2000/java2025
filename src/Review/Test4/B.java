package Review.Test4;

class B extends A {
    // Neu child class ke thua parent class
    // -> lay tat ca cac method cua cha (doi khi code se bi an di khong nhin thay)
//    public void print() {
//        System.out.print(x + ", " + y);
//    }

    public static void main(String[] args) {
        B b = new B();
        // b.print();  in ra 1 - 2
        System.out.println(b.sum());
    }
}
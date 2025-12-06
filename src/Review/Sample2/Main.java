package Review.Sample2;

class Main {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.func(5));
        /*
        public int func(int a ) {
        n = 3;
        return 5 + (int) func(2.5);
        }

        func(2.5) ->
        -> m = 5; n = 7;

        n = 3;
        public double func(2.5) {
            return 2.5 + m - n;
        }
        // 2.5 + 5 - 7 = int(0.5) = 0
        // C) 5

        // 2.5 + 5 - 3 = 4.5 -> int() -> 4
        -> B) 9

         */
    }
}
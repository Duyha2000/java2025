public class Temperature {
    private int hot;
    private int cold;

    public Temperature(int hot, int cold) {
        this.hot = hot;
        this.cold = cold;
    }

    // checkIcyhot():
    public void checkIcyhot() {
        if (this.hot > 100 && this.cold < 100) {
            System.out.println("Icyhot");
        } else {
            System.out.println("Not icyhot");
        }

    }
}



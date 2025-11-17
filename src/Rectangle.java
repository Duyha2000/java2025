public class Rectangle {
    private int chieuDai;
    private int chieuRong;

    // 0 - 0: day la gia tri mac dinh khi khoi tao 1 object
    // constructor ( gia tri mac dinh)
    // constructor k tham so
    public Rectangle() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }
    // constructor co tham so

    public Rectangle(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
}

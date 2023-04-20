package lessons.l9;

public enum SEASON {
    SUMMER(30, 92, "sunny"), SPRING(15, 93, "rainy"), WINTER(-5, 90, "cold");

    SEASON(int t, int days, String sinopt) {
        this.t = t;
        this.days = days;
        this.sinopt = sinopt;
    }

    private int t, days;
    private String sinopt;


    public int getDays() {
        return days;
    }

    public String getSinopt() {
        return sinopt;
    }


    public int getT() {
        return t;
    }
}

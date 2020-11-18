package model;

public class Convert {
    private double rate;
    private double VND;

    public Convert() {
    }

    public Convert(double rate, double VND) {
        this.rate = rate;
        this.VND = VND;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getVND() {
        return VND;
    }

    public void setVND(double VND) {
        this.VND = VND;
    }
}

package models;

public class Bill {

    double tuitionFee;
    double transportationFee;
    String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bill(String date) {
        this.date = date;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public double getTransportationFee() {
        return transportationFee;
    }

    public void setTransportationFee(double transportationFee) {
        this.transportationFee = transportationFee;
    }

    public Bill(double tuitionFee, double transportationFee) {
        this.tuitionFee = tuitionFee;
        this.transportationFee = transportationFee;
    }
}

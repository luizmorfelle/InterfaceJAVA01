package entities;

public class Invoice {
    public Double basicPayment;
    public Double tax;

    public Invoice(){

    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double totalPayment(Double tax, Double basicPayment){

        return getTax() + getBasicPayment();
    }
}

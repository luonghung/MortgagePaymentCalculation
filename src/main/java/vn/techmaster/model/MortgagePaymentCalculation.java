package vn.techmaster.model;

public class MortgagePaymentCalculation {
    private float principal;
    private float rateByYear;
    private int period;

    public MortgagePaymentCalculation(float principal, float rateByYear, int period) {
        this.principal = principal;
        this.rateByYear = rateByYear;
        this.period = period;
    }

    public float getRateByYear() {
        return rateByYear;
    }

    public void setRateByYear(float rateByYear) {
        this.rateByYear = rateByYear;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }


    public float getPrincipal() {
        return principal;
    }

    public void setPrincipal(float principal) {
        this.principal = principal;
    }

    public double calculations() {
        float rateByMonth = rateByYear / 12;
        int periodByMonth = period * 12;
        return principal * rateByMonth * (Math.pow(rateByMonth + 1, periodByMonth)) / (Math.pow(rateByMonth + 1, periodByMonth) - 1);
    }
}

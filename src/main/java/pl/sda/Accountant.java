package pl.sda;

import java.math.BigDecimal;

public class Accountant extends Employee {

    private int yearsServed;

    public int getYearsServed() {
        return yearsServed;
    }

    public void setYearsServed(int yearsServed) {
        this.yearsServed = yearsServed;
    }

    @Override
    public BigDecimal yearlySalary() {
        return super.yearlySalary().multiply(BigDecimal.valueOf(yearsServed));
    }
}

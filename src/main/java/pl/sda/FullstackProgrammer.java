package pl.sda;

import java.math.BigDecimal;

public class FullstackProgrammer extends JavaProgrammer {
    private String frontendLanguage;

    public String getFrontendLanguage() {
        return frontendLanguage;
    }

    public void setFrontendLanguage(String frontendLanguage) {
        this.frontendLanguage = frontendLanguage;
    }

    @Override
    public String getName() {
        return "test";
    }

    @Override
    public BigDecimal yearlySalary() {
        return super.yearlySalary().multiply(BigDecimal.valueOf(4));
    }
}

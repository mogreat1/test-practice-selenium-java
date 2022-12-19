package bootcamp;

import java.io.Serializable;
import java.math.BigDecimal;

public class JavaBean implements Serializable {

    private String regNumber;
    private BigDecimal prive;

    public JavaBean() {
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public BigDecimal getPrive() {
        return prive;
    }

    public void setPrive(BigDecimal prive) {
        this.prive = prive;
    }
}

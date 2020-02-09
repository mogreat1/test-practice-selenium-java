package functions;

import org.testng.annotations.Test;

import java.util.function.Supplier;

public class _Supplier {

    @Test
    public void getConnectionUrlTest() {
        System.out.println(getConnectionUrl());
    }

    static String getConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    @Test
    public void getConnectionSupplierTest() {
        System.out.println(getConnectionSupplier.get());
    }

    static Supplier<String> getConnectionSupplier = () -> "jdbc://localhost:5432/users";
}

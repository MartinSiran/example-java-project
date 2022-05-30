package org.example;

public class Calculator {
    public Double add(Double a, Double b) {
        return a + b;
    }

    public Double divide(Double a, Double b) throws Exception {
        if (b == 0) {
            throw new Exception("Second argument can't be 0.");
        }
        return a / b;
    }
}

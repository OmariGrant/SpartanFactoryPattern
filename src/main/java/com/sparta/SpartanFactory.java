package com.sparta;

public class SpartanFactory {
    public Spartan createSpartan (String spartanType) {
        if (spartanType == null || spartanType.equals("")) {
            return null;
        }
        if (spartanType.equals("Java Developer")) {
            return new JavaDeveloper();
        } else if (spartanType.equals("Java SDET")) {
            return new JavaSdet();
        } else if (spartanType.equals("C# Developer")) {
            return new CsharpDeveloper();
        } else if (spartanType.equals("Business Analyst")) {
            return new BusinessAnalyst();
        } else {
            System.out.println("No Spartans match input");
        }
        return null;
    }
}

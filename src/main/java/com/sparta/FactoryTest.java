package com.sparta;

public class FactoryTest {
    public static void run() {
        SpartanFactory spartanFactory = new SpartanFactory();
        Spartan javaSpartan = spartanFactory.createSpartan("Java Developer");
        javaSpartan.doesJob();

        Spartan csharpSpartan = spartanFactory.createSpartan("C# Developer");
        csharpSpartan.doesJob();

        Spartan javaSdetSpartan = spartanFactory.createSpartan("Java SDET");
        javaSdetSpartan.doesJob();

        Spartan businessSpartan = spartanFactory.createSpartan("Business Analyst");
        businessSpartan.doesJob();
    }
}

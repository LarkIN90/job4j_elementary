package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2, Test result : " + passed);
        float in2 = 240;
        float expected2 = 4;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out;
        System.out.println("140 rubles are 2, Test result : " + passed2);
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(240);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("240 rubles are " + dollar + " dollar");
    }
}

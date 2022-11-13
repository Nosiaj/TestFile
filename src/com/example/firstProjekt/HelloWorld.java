package com.example.firstProjekt;



import calculator.*;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        Frau gulcan = new Frau("NAKD",true,"Mercedes",true);
        Frau frau = new Frau("NAKD",true,"Mercedes");
        Mann serkan = new Mann(true, "Mercedes", Arrays.asList("dhd", "NAKD"), 65);

        boolean resultGulcan = gulcan.magMann(serkan);
        System.out.println(resultGulcan);

        gulcan.putSteadteLiebeWert("Berlin", 10);
        gulcan.putSteadteLiebeWert("New York", 100);
        gulcan.putSteadteLiebeWert("Sydney", 50);

        System.out.println(gulcan.getSteadteLiebeWert("New York"));


        boolean resultSerkan = serkan.magFrau(gulcan);
        System.out.println(resultSerkan);

        System.out.println(serkan.alter);

        System.out.println(serkan.magPerson(gulcan));

        int c = StaticCalculator.addNumber(1,3);

        Calculator ca = new Calculator(1,3);
        int result = ca.add();

    }
}

package com.selimcinar.methodsandclasses;

public class Musicians {
    //Musicians classı
    //Properties özellikleri classın
    String name;
    String instrument;
    int age;

    public Musicians(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
        System.out.println("Constructor çağrıldı");
    }
}

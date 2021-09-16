package com.sda.spring.core.oop;

public class Geek extends Woman {
    public Geek(Love love, FinancialSecurity financialSecurity) {
        super(love, financialSecurity);
    }

    public void newStuff(){
        System.out.println("New stuff");
    }

    @Override
    public void feel() {

    }

    @Override
    public void dream() {

    }

    @Override
    public void relax() {

    }
}

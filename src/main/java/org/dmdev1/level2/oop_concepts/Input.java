package org.dmdev1.level2.oop_concepts;

public class Input {

    public static void main(String[] args) {
        Atm_v1 atm = new Atm_v1(0, 0, 0);
        System.out.println(atm.getAtmBalance());
        atm.addBanknotes(0, 1, 1);
        System.out.println(atm.getAtmBalance());
        atm.cashWithdrawal(70);
    }

}

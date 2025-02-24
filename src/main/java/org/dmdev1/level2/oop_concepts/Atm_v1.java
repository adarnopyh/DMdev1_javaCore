package org.dmdev1.level2.oop_concepts;

public class Atm_v1 {

    private int banknoteQty_10;
    private int banknoteQty_20;
    private int banknoteQty_50;

    public Atm_v1(int banknoteQty_10, int banknoteQty_20, int banknoteQty_50) {
        this.banknoteQty_10 = banknoteQty_10;
        this.banknoteQty_20 = banknoteQty_20;
        this.banknoteQty_50 = banknoteQty_50;
    }

    public void addBanknotes(int banknoteQty_10, int banknoteQty_20, int banknoteQty_50) {
        this.banknoteQty_10 += banknoteQty_10;
        this.banknoteQty_20 += banknoteQty_20;
        this.banknoteQty_50 += banknoteQty_50;
    }

    public int getAtmBalance() {
        int total10 = this.banknoteQty_10 * 10;
        int total20 = this.banknoteQty_20 * 20;
        int total50 = this.banknoteQty_50 * 50;
        return total10 + total20 + total50;
    }

    public void cashWithdrawal(int withdrawal) {
        if (isCashWithdrawalPossible(withdrawal)) {
            int countFirst50 = withdrawal / 50;
            int countThen20 = (withdrawal - (50 * countFirst50)) / 20;
            int countLast10 = (withdrawal - (countFirst50 * 50) - (countThen20 * 20)) / 10;
            if (this.banknoteQty_50 >= countFirst50) this.banknoteQty_50 -= countFirst50;
            if (this.banknoteQty_20 >= countThen20) this.banknoteQty_20 -= countThen20;
            if (this.banknoteQty_10 >= countLast10) this.banknoteQty_10 -= countLast10;
            System.out.println("Notes by 50 qty: " + countFirst50 + ".");
            System.out.println("Notes by 20 qty: " + countThen20 + ".");
            System.out.println("Notes by 10 qty: " + countLast10 + ".");
        } else {
            System.out.println("check inputs");
        }
    }

    private boolean isCashWithdrawalPossible(int withdrawal) {
        if (withdrawal % 10 == 0 && withdrawal <= getAtmBalance()) {
            int countFirst50 = withdrawal / 50;
            int countThen20 = (withdrawal - (50 * countFirst50)) / 20;
            int countLast10 = (withdrawal - (countFirst50 * 50) - (countThen20 * 20)) / 10;
            if (this.banknoteQty_50 < countFirst50) {
                System.out.println("This ATM does not have enough 50 notes");
                return false;
            }
            if (this.banknoteQty_20 < countThen20) {
                System.out.println("This ATM does not have enough 20 notes");
                return false;
            }
            if (this.banknoteQty_10 < countLast10) {
                System.out.println("This ATM does not have enough 10 notes");
                return false;
            }
        } else if (withdrawal % 10 != 0) {
            System.out.println("Check your inputs must be divisible by 10");
            return false;
        } else if (withdrawal <= getAtmBalance()) {
            System.out.println("Your inputs are too high");
            return false;
        }
        return true;

    }
}

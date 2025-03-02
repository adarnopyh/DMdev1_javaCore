package org.dmdev1.oop_level2.oop_concepts.Task1_Atm;

import static org.dmdev1.oop_level2.oop_concepts.Task1_Atm.Nominals.*;


/*
* Задание 1

Создать класс, описывающий банкомат.

Банкомат задается тремя свойствами:
- количеством купюр номиналом 10, 20 и 50.

Создать конструктор с тремя параметрами - количеством купюр каждого номинала.

Сделать методы для добавления денег в банкомат.

Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.

При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма. Сначала банкомат будет пытаться рассчитаться 50, далее добавит недостающие 20, и только затем 10 (не нужно рассматривать более сложные варианты выдачи наличных, чтобы не усложнять алгоритм).
* */


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
        int total10 = this.banknoteQty_10 * NOMINAL_10.getValue();
        int total20 = this.banknoteQty_20 * NOMINAL_20.getValue();
        int total50 = this.banknoteQty_50 * NOMINAL_50.getValue();
        return total10 + total20 + total50;
    }

    public void cashWithdrawal(int withdrawal) {
        if (isCashWithdrawalPossible(withdrawal)) {
            int countFirst50 = withdrawal / NOMINAL_50.getValue();
            int countThen20 = (withdrawal - (NOMINAL_50.getValue() * countFirst50)) / NOMINAL_20.getValue();
            int countLast10 = (withdrawal - (countFirst50 * NOMINAL_50.getValue()) - (countThen20 * NOMINAL_20.getValue())) / NOMINAL_10.getValue();
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
        if (withdrawal % NOMINAL_10.getValue() == 0 && withdrawal <= getAtmBalance()) {
            int countFirst50 = withdrawal / NOMINAL_50.getValue();
            int countThen20 = (withdrawal - (NOMINAL_50.getValue() * countFirst50)) / NOMINAL_20.getValue();
            int countLast10 = (withdrawal - (countFirst50 * NOMINAL_50.getValue()) - (countThen20 * NOMINAL_20.getValue())) / NOMINAL_10.getValue();
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
        } else if (withdrawal % NOMINAL_10.getValue() != 0) {
            System.out.println("Check your inputs must be divisible by 10");
            return false;
        } else if (withdrawal <= getAtmBalance()) {
            System.out.println("Your inputs are too high");
            return false;
        }
        return true;

    }
}

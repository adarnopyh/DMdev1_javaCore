package org.dmdev1.computerScience.loops.homework;

/*
Задание 3.
Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
300$ в месяц Ваня тратит на еду и развлечения.
10% от зарплаты Ваня ежемесячно переводит на расчётный счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.

Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.

Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
*/

public class Task3_v1_VanyaFinance {
    public static void main(String[] args) {

        int fstSalary = 600; // first salary
        int expY = 3; // given experience years
        int expM = 2; // given experience months
        int salaryIncr = 400; // salary increased by salaryIncr each upgrade step
        int upgrStep = 6; // upgrade step are 6 months
        int monthExpenses = 300;
        int incPct = 2; // % getting back from investing per month
        int invPct = 10; // % invested money per month

        printData(fstSalary, expY, expM, salaryIncr, upgrStep, monthExpenses, incPct, invPct);

    }

    private static void printData(int fstSalary, int expY, int expM, int salaryIncr, int upgrStep, int monthExpenses, int incPct, int invPct) {
        System.out.println("Users credit turnover: "
                + userAccount(fstSalary, expY, expM, salaryIncr, upgrStep, monthExpenses, incPct, invPct) + " USD");
        System.out.println("Invested debit turnover: "
                + invTotal(expY, expM, invPct, fstSalary, salaryIncr, upgrStep) + " USD");
    }

    private static int userAccount(int fstSalary, int expY, int expM, int salaryIncr, int upgrStep, int monthExpenses, int incPct, int invPct) {
        int invTotal = invTotal(expY, expM, invPct, fstSalary, salaryIncr, upgrStep);
        return salaryTotal(fstSalary, expMTotal(expY, expM), salaryIncr, upgrStep)
                - expensesTotal(monthExpenses, expMTotal(expY, expM))
                - invTotal
                + income(incPct, invTotal);
    }

    private static int income(int incPct, int invTotal) {
        return invTotal * incPct / 100;
    }

    private static int expMTotal(int expY, int expM) {
        return expY * 12 + expM;
    }

    private static int salaryTotal(int fstSalary, int expMTotal, int salaryIncr, int upgrStep) {

        int result = fstSalary * expMTotal;

        for (int i = 0; i < expMTotal; i++) {
            result += experienceGrade(i, upgrStep) * salaryIncr;
        }

        return result;
    }

    private static int monthSalaryCalc(int fstSalary, int monthToCalc, int salaryIncrease, int upgrStep) {
        return fstSalary + experienceGrade(monthToCalc - 1, upgrStep) * salaryIncrease;
    }

    private static int experienceGrade(int expMTotal, int upgrStep) {
        return expMTotal / upgrStep;
    }

    private static int expensesTotal(int monthExpenses, int expMTotal) {
        return monthExpenses * expMTotal;
    }

    private static int invM(int invPct, int fstSalary, int monthToCalc, int salaryIncr, int upgrStep) {
        int monthSalary = monthSalaryCalc(fstSalary, monthToCalc, salaryIncr, upgrStep);
        return (monthSalary * invPct) / 100;
    }

    private static int invTotal(int expY, int expM, int invPct, int fstSalary, int salaryIncr, int upgrStep) {

        int expMTotal = expMTotal(expY, expM);
        int total = 0;
        for (int i = 0; i < expMTotal; i++) {
            int invM = invM(invPct, fstSalary, i + 1, salaryIncr, upgrStep);
            total += invM;
        }
        return total;
    }

}

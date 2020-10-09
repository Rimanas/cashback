public class Main {
    public static void main(String[] args) {
        int hundreds = 100_00;
        int ordinaryExpenses = 1_000_000_00;
        int elevatedExpenses = 10_999_99;
        int specialsExpenses = 10_599_99;
        int ordinaryPercent = 1;
        int elevatedPercent = 5;
        int specialsPercent = 3;
        int ordinaryCashback = ordinaryExpenses * ordinaryPercent / hundreds * hundreds/ 100;
        System.out.println("Ваш cashback за обычные покупки: ");
        System.out.println(ordinaryCashback);
        System.out.println("Ваш cashback за покупки в категориях повышенного кэшбэка: ");
        int elevatedCashback = elevatedExpenses * elevatedPercent / hundreds * hundreds / 100;
        System.out.println(elevatedCashback);
        System.out.println("Ваш cashback за покупки по спецпредложениям: ");
        int specialsCashback = specialsExpenses * specialsPercent / hundreds * hundreds / 100;
        System.out.println(specialsCashback);
        int cashback = ordinaryCashback + elevatedCashback + specialsCashback;
        System.out.println("Cashback по расчетам: ");
        System.out.println(cashback);

        int limit = 3_000_00;
        if (cashback > limit) {
            cashback = limit;
        }
        System.out.println("Ваш cashback составляет: ");
        System.out.println(cashback);

    }
}

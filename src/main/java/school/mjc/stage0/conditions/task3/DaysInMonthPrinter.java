package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month==1 || month==3) System.out.println("31");
        if (month==2) System.out.println("28");
        if (month==4 || month==6) System.out.println("30");
        if (month>12 || month<1) System.out.println("wrong number!");
    }
}

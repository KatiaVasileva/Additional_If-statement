public class Main {
    public static void main(String[] args) {
//        Задача 6
        System.out.println("Задача 6");
        int age = 42;
        int salary = 110_000;

        double creditLimit;

        if (age >= 23) {
            creditLimit = salary * 3;
        }
        else {
            creditLimit = salary * 2;
        }
        if (salary >= 50_000 && salary < 80_000) {
            creditLimit = creditLimit * 1.2;
        } else if (salary >= 80_000) {
            creditLimit = creditLimit * 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (int) creditLimit + " рублей.");
    }
}
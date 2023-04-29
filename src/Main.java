public class Main {

    public static void main(String[] args) {

        int initially = 145; // изначальный баланс
        int repl = 650; // сумма пополнения
        int present = 100; // 1 бонус за каждые 100 руб. пополнения
        int bonus = repl / present; // кол-во бонусов за каждые 100 руб. пополнения

        if (repl >= present) {
            System.out.println(repl / present + " руб. бонусов");
            System.out.println(initially + repl + bonus + " руб. итоговый баланс");
        } else {
            System.out.println("бонусов нет");
            System.out.println(initially + repl + " руб. итоговый баланс");
        }

    }
}

public class Main {
    public static void main(String[] args) {


        int balance = 150;
        int replenishment = 2000;
        if (replenishment > 1000) {
            balance += replenishment / 100 + replenishment;
        } else {
            balance += replenishment;
        }

        System.out.println("Ваш баланс: " + balance + " рублей");

        System.out.println("Ваш бонус: " + replenishment / 100 + " рублей");
    }
}
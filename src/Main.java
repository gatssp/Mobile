public class Main {
    public static void main(String[] args) {


    int balance = 150;
    int replenishment = 200;
    if (replenishment > 1000) {
        balance+= replenishment/100+ replenishment;
    } else {
        balance+=replenishment;
    }

    System.out.println("Ваш баланс: " + balance  + " рублей");

}
}
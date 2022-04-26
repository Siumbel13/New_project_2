public class Main {

    public static void main(String[] args) {

        int initialAmount = 100; // начальная сумма на счете
        int refill = 500; // сумма пополнения
        int check = initialAmount + refill;

        if (1000 < refill) {
            System.out.println(check = refill / 100 + refill + initialAmount);
        } else {
            System.out.println(check = refill + initialAmount);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        int clientAccount = 400;
        int depositAmount = 1200;
        int balance = (clientAccount + depositAmount);

        int bonusRuble;
        if (depositAmount >= 1000) {
            bonusRuble = (depositAmount / 100);
            balance = (clientAccount + depositAmount + bonusRuble);
        } else {
            bonusRuble = 0;
        }

        System.out.println("Баланс: " + balance);
        System.out.println("Бонусные рубли: " + bonusRuble);


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
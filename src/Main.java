public class Main {
    public static void main(String[] args) {
        int bonusPrice = 100;
        int initialBalance = 100;
        int sumOfTopUp = 1100;
        int topUpForBonus = 1000;
        int bonus;
        if (sumOfTopUp > topUpForBonus) {
            bonus = sumOfTopUp / bonusPrice;
        } else {
            bonus = 0;
        }
        int OutgoingBalance = initialBalance + bonus + sumOfTopUp;
        System.out.println(OutgoingBalance);
        System.out.println(bonus);
    }
}

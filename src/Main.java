public class Main {
    public static void main(String[] args) {
        int bonus_price = 100 ;
        long InitialBalance = 100 ;
        long SumOfTopUp = 1100 ;
        long TopUpForBonus = 1000 ;
        long bonus ;
        if (SumOfTopUp > TopUpForBonus) {
            bonus = SumOfTopUp / bonus_price ;
        } else { bonus = 0 ;
        }
         long OutgoingBalance = InitialBalance + bonus + SumOfTopUp;
    System.out.println(OutgoingBalance) ;
    System.out.println(bonus) ;
}
}

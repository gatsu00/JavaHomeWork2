public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676; // Стоимость билета
        int milesPerRuble = 20; // Количество рублей для одной бонусной мили

        int bonusMiles = ticketPrice / milesPerRuble; // Расчет количества бонусных миль

        System.out.println("За купленный билет начислено " + bonusMiles + " бонусных миль");
    }
}
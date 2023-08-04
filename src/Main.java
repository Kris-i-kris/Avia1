public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);

        // int ticketPrice = 565565;
        //int rub = 20;

        // int miles = int rub;

        //int miles = ticketPrice / rub;

        //System.out.println("Начисленно миль: " + mile );

        System.out.println(miles);
    }
}

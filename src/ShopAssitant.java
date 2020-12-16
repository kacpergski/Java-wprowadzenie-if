public class ShopAssitant {
    public static void main(String[] args) {
        double cash = 1;
        double breadPrice = 2.1;
        double butterPrice = 3.41;
        double rollPrice = 0.58;
        if (breadPrice + butterPrice < cash)
        {
            System.out.println("Kupiłem chleb i masło");
        }
        else if (2 * rollPrice + butterPrice <= cash) {
            System.out.println("Kupiłem dwie bułki i masło");
        }
        else if (rollPrice <= cash)
        {
             System.out.println("Kupiłem bułkę");
        }
        else
         {
            System.out.println("Nic nie kupłem");
        }
    }
}

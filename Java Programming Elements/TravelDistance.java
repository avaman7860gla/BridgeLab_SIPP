import java.util.Scanner;

public class TravelDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        String name = input.nextLine();
       
        String fromCity = input.nextLine();
        
        String viaCity = input.nextLine();
       
        String toCity = input.nextLine();
       
        double fromToVia = input.nextDouble();
       
        double viaToFinalCity = input.nextDouble();

        double timeFromToVia = input.nextDouble();

        double timeViaToFinalCity = input.nextDouble();
        double totalDistanceKm = (fromToVia + viaToFinalCity) * 1.6;
        double totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.printf("The Total Distance travelled by %s from %s to %s via %s is %.2f km and the Total Time taken is %.2f minutes%n",
                         name, fromCity, toCity, viaCity, totalDistanceKm, totalTime);
       
    }
}
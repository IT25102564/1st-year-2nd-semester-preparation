public class Question01 {
    public static void main(String[] args) {
        int miles = 26;
        int yards = 385;
        double kilometers;

        double milesFromYards = yards / 1760.0;

        double totalMiles = miles + milesFromYards;

        kilometers = totalMiles * 1.609;

        System.out.println("Marathon distance in kilometers: " + kilometers);
    }
}
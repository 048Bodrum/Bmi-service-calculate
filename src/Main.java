public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 55;
        double heightInMeters = 1.68;
        int index = service.calculate(weightInKg, heightInMeters);
        System.out.println(index);
    }
}
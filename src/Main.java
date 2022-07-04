public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 57;
        double height = 1.69;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}

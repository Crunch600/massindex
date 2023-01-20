public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 90.5;
        double hight = 1.82;

        double index = service.calculate(weight, hight);
        System.out.println(index);
    }
}
public class BmiService {

    public double calculate(double weight, double hight) {
        double index = weight / (hight * hight);
        if (index < 18.5) {
            System.out.println("Недостаток: менее 18,5");
        } else if (index < 25){
            System.out.println("Нормальный: между 18,5 и 25");
        } else if (index < 30) {
            System.out.println("Избыточный: между 25 и 30");
        } else {
            System.out.println("Ожирение: 30 и более");
        }
        return (int) index;
    }

}

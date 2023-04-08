public class BimService {
    public int calculate(double height, int weight) {

        double bmi = weight / (height * height);

        return (int) bmi;
    }
}

public class BmiService {
    public double bmi(double mass, double height) {
        double result;
        result = mass / Math.pow(height, 2);
        return result;
    }
}

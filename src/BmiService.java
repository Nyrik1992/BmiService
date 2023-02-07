public class BmiService {
    public double calculate(double weight, double growth) {
        double BodyMassIndex = weight / ((growth * growth) / 10000);
        return BodyMassIndex;
    }
}

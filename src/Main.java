public class Main {
        public static void main(String[] args) {
            BmiService service = new BmiService();
            double weight = 50;
            double growth = 160;
            double BodyMassIndex = service.calculate(weight, growth);
            System.out.println(BodyMassIndex);
        }

    }

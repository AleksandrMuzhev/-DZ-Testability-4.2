public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 98; //масса тела, кг
        double height = 1.87; // рост тела, м
        double index = service.bmi(mass, height);
        System.out.println("Индекс массы тела = " + (int)index);
    }
}

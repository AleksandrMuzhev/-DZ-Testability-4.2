// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 98; //масса тела, кг
        double height = 1.87; // рост тела, м
        double index = service.bmi(mass, height);
        System.out.println("Индекс массы тела = " + (int)index);
    }
}
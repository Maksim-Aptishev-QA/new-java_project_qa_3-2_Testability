public class Main {
    public static void main(String[] args) {
        BimService service = new BimService();

        int bmi = service.calculate(1.87, 98);
        System.out.println(bmi + "ИМТ");
    }
}

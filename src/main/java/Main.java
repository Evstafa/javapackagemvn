import ru.netology.javaqa.javapackagemvn.sqr.SQRService;
public class Main {
    public static void main(String[] args) {
        int x = 99;

        for (int i = 10; i < 100; i++) {
            if (i == 100) {
                break;
            }
            System.out.println(i);
        }
        SQRService service = new SQRService();
        System.out.println(service.calcSqrt(99)); // Квадратный корень
    }
}

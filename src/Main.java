public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float i = service.calculate(65);
        System.out.println("Индекс массы тела рвен: " + i + "кг/m^2");
    }
}
// К сожалению я так и не понял, с какой целью мы это делаем и что тестируем, несколько раз пересмотрел лекцию
// и сделал дз по ее подобию. Пожалуйста обьясните, что мы тут делали. Заранее спасибо.
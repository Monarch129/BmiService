public class BmiService {
    public float calculate(float m) {
        float h = 1.7f;
        float i = m / (h * h);
        return i;
    }
}
// h - Рост(высота) в метрах
// m - Вес в кг
// i - Индекс массы тела
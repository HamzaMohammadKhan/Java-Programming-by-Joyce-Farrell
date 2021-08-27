
public class SortDoublesB {
    public static void main(String[] args) {
        double[] values = {0.15, 0.1, 1.2, 2.4, 1.5, 0.22, 11.4, 4.3, 7.8};
        double temp;
        int x;
        for (x = 0; x < values.length - 1; ++x) {
            for (int i = 0; i < values.length - 1; ++i)
                if (values[x] < values[x + 1]) {
                    temp = values[x];
                    values[x] = values[x + 1];
                    values[x + 1] = temp;
                }
            System.out.println(values[x]);
        }
    }
}

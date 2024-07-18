import view.ToyView;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            ToyView.start();
        } catch (Exception e) {
            System.out.println("Введен не верный формат данных игрушки");
        }

    }
}
package accuweather;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите имя города: ");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения погоды на сегодня;\n" +
                    "Введите 5 для прогноза на 5 дней; \n" +
                    "Введите 2 для получения данных из базы; \n" +
                    "Для выхода введите 0:");

            String command = scanner.nextLine();

            //TODO* Сделать метод валидации пользовательского ввода

            if (command.equals("0")) break;

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = scanner.next();

        String[] carNameStrArr = carNames.split(",");
        List<Car> racingCars = new ArrayList<>();
        for (int i = 0; i < carNameStrArr.length; i++) racingCars.add(new Car(carNameStrArr[i]));

        RacingGame racingGame = new RacingGame(racingCars);
        racingGame.start();

        racingGame.printResult();
    }
}

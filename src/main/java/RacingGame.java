import java.util.List;
import java.util.Scanner;

public class RacingGame {

    private final RacingCarCollection racingCars;

    public RacingGame(List<Car> racingCars) {
        this.racingCars = new RacingCarCollection(racingCars);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시도할 회수는 몇회인가요? : ");
        int tryCnt = scanner.nextInt();
        System.out.println();

        System.out.println("실행결과");
        for (int i = 0; i < tryCnt; i++) racingCars.goAll();
    }

    public void printResult() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Car headCar : racingCars.getHeadCars()) stringBuilder.append(headCar.getName()).append(",");

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("가 최종 우승했습니다.");
        System.out.println(stringBuilder.toString());
    }
}

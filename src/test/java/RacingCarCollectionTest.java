import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingCarCollectionTest {
    @Test
    void RacingCarCollection_생성자_테스트() {
        RacingCarCollection racingCarCollection = new RacingCarCollection(Arrays.asList(new Car(), new Car(), new Car()));
        assertThat(racingCarCollection.getRacingCars().size()).isEqualTo(3);
    }

    @Test
    void RacingCarCollection_초기위치가_0이아닌_Car_생성_에러_테스트() {
        Car car1 = new Car();
        car1.goIfRandomValueIs(4);
        Car car2 = new Car();
        car2.goIfRandomValueIs(4);

        assertThatThrownBy(() -> new RacingCarCollection(Arrays.asList(car1, car2)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("차의 위치가 " + 0 + "가(이) 아닙니다.");
    }

    @Test
    void RacingCarCollection_경주할_차_2대_미만_에러_테스트() {
        assertThatThrownBy(() -> new RacingCarCollection(Collections.singletonList(new Car())))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith(RacingCarCollection.CAR_COUNT_ERR_MSG);
    }
}

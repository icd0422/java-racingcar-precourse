import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class RacingCarCollectionTest {
    @Test
    void RacingCarCollection_생성자_테스트() {
        RacingCarCollection racingCarCollection
                = new RacingCarCollection(Arrays.asList(new Car("test1"), new Car("test2"), new Car("test3")));
        assertThat(racingCarCollection.getRacingCars().size()).isEqualTo(3);
    }

    @Test
    void RacingCarCollection_초기위치가_0이아닌_Car_생성_에러_테스트() {
        Car car1 = new Car("test1");
        car1.goIfRandomValueIs(4);
        Car car2 = new Car("test2");
        car2.goIfRandomValueIs(4);

        Throwable thrown = catchThrowable(() -> new RacingCarCollection(Arrays.asList(car1, car2)));
        assertThat(thrown).as("차의 위치가 " + 0 + "가(이) 아닙니다.")
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void RacingCarCollection_경주할_차_2대_미만_에러_테스트() {

        Throwable thrown = catchThrowable(() -> new RacingCarCollection(Collections.singletonList(new Car("test"))));
        assertThat(thrown).as(RacingCarCollection.CAR_COUNT_ERR_MSG)
                .isInstanceOf(IllegalArgumentException.class);
    }
}

public class Position {

    private int currentPos;

    static final String NOT_POSITIVE_VALUE_ERR_MSG = "위치 값은 음수가 될 수 없습니다.";

    public Position(int initPos) {
        if (initPos < 0) throw new IllegalArgumentException(NOT_POSITIVE_VALUE_ERR_MSG);
        this.currentPos = initPos;
    }

    public int getCurrentPos() {
        return this.currentPos;
    }

    public void plusPosition(int i) {
        this.currentPos += i;
    }
}

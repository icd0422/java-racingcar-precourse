public class Position {

    private int pos;

    static final String NOT_POSITIVE_VALUE_ERR_MSG = "위치 값은 음수가 될 수 없습니다.";

    public Position(int pos) {
        if (pos < 0) throw new IllegalArgumentException(NOT_POSITIVE_VALUE_ERR_MSG);
        this.pos = pos;
    }
}

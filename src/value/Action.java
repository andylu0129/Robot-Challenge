public enum Action {
    LEFT(90),
    RIGHT(-90),
    MOVE(0);

    public final int value;

    private Action(int value) {
        this.value = value;
    }
}

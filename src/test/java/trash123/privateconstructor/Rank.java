package trash123.privateconstructor;

final class Rank {
    private int value;

    public Rank(int value) {
        if (value < 1 || value > 13) {
            throw new RuntimeException("Rank must be between 1 and 13");
        }

        this.value = value;
    }
}
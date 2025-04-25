package trash345.enumtype;

public enum DaysEnum {
    SUNDAY("Niedziela"), MONDAY("Pon"), TUESDAY("Wt"), WEDNESDAY("Śro"), THURSDAY("CZwa"), FRIDAY("Pt"), SATURDAY("Sob");

    private String dayName;

    DaysEnum(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }
}

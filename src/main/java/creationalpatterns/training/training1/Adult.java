package creationalpatterns.training.training1;

public class Adult implements Person {
    private Integer age;

    public Adult(Integer age) {
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println(String.format("I've %s years", getAge()));
    }

    @Override
    public Integer getAge() {
        return age;
    }
}
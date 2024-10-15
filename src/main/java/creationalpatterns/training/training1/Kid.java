package creationalpatterns.training.training1;

public class Kid implements Person {
    private Integer age;

    public Kid(Integer age) {
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
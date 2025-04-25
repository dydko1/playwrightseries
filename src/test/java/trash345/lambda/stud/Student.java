package trash345.lambda.stud;

class Student {
    private String name, SClass;
    private int age;

    public Student(String name, int age, String SClass) {
        this.name = name;
        this.age = age;
        this.SClass = SClass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSClass() {
        return SClass;
    }
}
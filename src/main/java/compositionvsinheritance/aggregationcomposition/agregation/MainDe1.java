package compositionvsinheritance.aggregationcomposition.agregation;

import java.util.Arrays;
import java.util.List;

public class MainDe1 {
    public static void main(String[] args) {
        University university = new University("Politechnika");
        List<Department> dep = Arrays.asList(new Department("dep1"), new Department("Dep2"));
        university.setDepartments(dep);

        System.out.println(university.getDepartments().get(0).getName());
    }
}
package compositionvsinheritance.aggregationcomposition.agregation;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
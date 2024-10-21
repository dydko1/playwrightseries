package trash.associationcompositionaggregation.composite;

import java.util.ArrayList;
import java.util.List;

public class Company2 {

    private String companyName;
    private List<Department2> department2s;

    public Company2(String companyName) {
        this.companyName = companyName;
        this.department2s = new ArrayList<>();
    }

    public void addDepartment(Department2 department2) {
        department2s.add(department2);
    }

    List<Department2> getDepartment2s() {
        return new ArrayList<>(department2s);
    }

    public int getTotalDepartment(){
        return department2s.size();
    }
}
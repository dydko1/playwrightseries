package trash.associationcompositionaggregation.assosiation;

import java.util.Set;

public class Bank1 {

    private String bankName;
    private Set<Employee1> employee1Set;

    public Bank1(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public Set<Employee1> getEmployee1Set() {
        return employee1Set;
    }

    public void setEmployee1Set(Set<Employee1> employee1Set) {
        this.employee1Set = employee1Set;
    }
}
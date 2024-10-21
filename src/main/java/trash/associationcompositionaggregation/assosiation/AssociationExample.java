package trash.associationcompositionaggregation.assosiation;

import java.util.HashSet;
import java.util.Set;

public class AssociationExample {
    public static void main(String[] args) {
        Employee1 empl1 = new Employee1("Miro");
        Employee1 empl2 = new Employee1("Zapa");

        Set<Employee1> employee1Set = new HashSet<>();
        employee1Set.add(empl1);
        employee1Set.add(empl2);

        Bank1 bank1 = new Bank1("Bank Mira");

        bank1.setEmployee1Set(employee1Set);

        for (Employee1 emp: bank1.getEmployee1Set()){
            System.out.println(emp.getEmployeeName() +"\t"+bank1.getBankName());
        }
    }
}
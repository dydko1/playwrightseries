package trash.associationcompositionaggregation.composite;

public class CompositonExample {
    public static void main(String[] args) {
        Company2 techCompany = new Company2("TEch Com 123");

        techCompany.addDepartment(new Department2("Eng"));
        techCompany.addDepartment(new Department2("HR"));
        techCompany.addDepartment(new Department2("Operators"));
        techCompany.addDepartment(new Department2("Finance"));

        System.out.println(techCompany.getTotalDepartment());

        techCompany.getDepartment2s().stream().forEach(s -> System.out.println(s.departmentName));

    }
}
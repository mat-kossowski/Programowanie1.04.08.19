package pl.sdaacademy.employee;


        import org.junit.Assert;
        import org.junit.Test;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Map;

public class EmployeeServiceTest {

    @Test
    public void findAllShouldReturnGivenEmployee() {
        //given
        List<Employee> employees = Arrays.asList(
                new Employee("name-1", 5000, 26),
                new Employee("name-2", 6000, 36),
                new Employee("name-3", 3500, 30)
        );
        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository(employees));


        // when
        List<Employee> result = employeeService.findAll();


        //then
        Assert.assertEquals(employees, result);


    }

    @Test
    public void sortByAgeShouldReturnDescendingAgeEmployeesList() {
        //given
        List<Employee> employees1 = Arrays.asList(
                new Employee("name-1", 5000, 26),
                new Employee("name-2", 6000, 36),
                new Employee("name-3", 3500, 30)
        );

        List<Employee> employees2 = Arrays.asList(
                new Employee("name-1", 5000, 26),
                new Employee("name-3", 3500, 30),
                new Employee("name-2", 6000, 36)
        );


        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository(employees1));
        //when
        List<Employee> result = employeeService.sortByAge();

        //then
        Assert.assertEquals(new ArrayList<>(employees2), result);

    }

    @Test

    public void groupByAgeSegmentShouldReturnMapWhitAgeSegmentAsKeyAndListOfEmployeeAsValue() {

        //given
        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository());
        //when
        Map<String, List<Employee>> result = employeeService.groupByAgeSegment();
        //then

        System.out.println();
    }


    @Test
    public void getAvgSalaryOfAgeSegment_ShouldReturnAverageOfSalaryForEmployeeInAgeSegment() {
        //given
        List<Employee> employees = Arrays.asList(
                new Employee("name-1", 1000, 31),
                new Employee("name-2", 2000, 33),
                new Employee("name-3", 50000, 36)
        );
        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository(employees));
        //when

        Double result = employeeService.getAvgSalaryOfAgeSegment(32);
        //then
        Assert.assertEquals(1500.0, result, 0.1);

    }

    @Test
    public void getAvgSalaryOfAgeSegment_ShouldReturnZeroWhenEmployeesForGivenAgeSegmentAreNotExist() {
        //given
        List<Employee> employees = Arrays.asList(
                new Employee("name-1", 1000, 31),
                new Employee("name-2", 2000, 33),
                new Employee("name-3", 50000, 36)
        );
        EmployeeService employeeService = new EmployeeService(new InMemoryEmployeeRepository(employees));
        //when

        Double result = employeeService.getAvgSalaryOfAgeSegment(50);
        //then
        Assert.assertEquals(0.0, result, 0.1);

    }
}

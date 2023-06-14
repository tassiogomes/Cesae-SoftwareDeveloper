package ex1;

import org.example.ex1.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EmployeeTest {

    public Employee employee;

    @BeforeEach
    public void setUp(){
       Employee employee1 = new Employee("Tassio", "Developer", 12);
    }

    @Test
    public void calculateSalaryTest(){
        Employee employee1 = new Employee("Tassio", "Developer", 12);
        Employee employee2 = new Employee("Joana", "Manager", 20);
        Employee employee3 = new Employee("Naruto", "Intern", 10);
        employee1.setHoursWorked(40);
        employee2.setHoursWorked(10);
        employee3.setHoursWorked(10);
        assertEquals(576, employee1.calculateSalary());
        assertEquals(200, employee2.calculateSalary());
        assertEquals(80, employee3.calculateSalary());
    }

}

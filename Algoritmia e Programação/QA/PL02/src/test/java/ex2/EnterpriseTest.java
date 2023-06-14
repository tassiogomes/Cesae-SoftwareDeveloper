package ex2;

import org.example.ex1.Employee;
import org.example.ex2.Enterprise;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class EnterpriseTest {

    public Enterprise enterprise;

    @BeforeEach
    public void setUp(){
        Enterprise enterprise = new Enterprise();
        Employee employee1 = new Employee("Tassio", "Developer", 12);
        Employee employee2 = new Employee("Joana", "Manager", 20);
        Employee employee3 = new Employee("Naruto", "Intern", 10);
        enterprise.addEmployee(employee1);
        enterprise.addEmployee(employee2);
        enterprise.addEmployee(employee3);
    }

    @Test
    public void addEmployeeTest(){

    }



}

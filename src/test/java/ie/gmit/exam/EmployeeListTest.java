package ie.gmit.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeListTest {

    private Employee e1;
    private EmployeeList list1;

    @BeforeEach
    void init() {
        list1 = new EmployeeList();
        e1 = new Employee("Emmett", "08922977", 12345, 21);
    }

    @Test
    void testEmployeeAdd(){
        list1.addEmployee(e1);
        assertEquals(list1.addEmployee(e1) ,"successs");
    }
}

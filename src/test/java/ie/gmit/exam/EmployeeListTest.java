package ie.gmit.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        int size = list1.getSize();
        list1.addEmployee(e1);
        assertEquals(list1.getSize() ,size + 1);
    }

    @Test
    void testEmployeeAddFail(){
        Exception e = assertThrows(IllegalArgumentException.class , ()-> list1.addEmployee(e1));
        assertEquals("Employee already exists" , e.getMessage());
    }

    @Test
    void testGetSize(){
        list1.addEmployee(e1);
        assertEquals(list1.getSize() , 1);
    }

}

package ie.gmit.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeListTest {

    private Employee e1;
    private Employee e2;
    private EmployeeList list1;

    @BeforeEach
    void init() {
        list1 = new EmployeeList();
        e1 = new Employee("Emmett", "08922977", 12345, 21);
        e2 = new Employee("james", "12345678", 12543, 23);
    }

    @Test
    void testEmployeeAdd(){
        int size = list1.getSize();
        list1.addEmployee(e1);
        assertEquals(list1.getSize() ,size + 1);
    }

    @Test
    void testEmployeeAdd2(){
        int size = list1.getSize();
        list1.addEmployee(e1);
        list1.addEmployee(e2);
        assertEquals(list1.getSize() ,size + 2);
    }

    @Test
    void testEmployeeAddFail(){
        list1.addEmployee(e1);
        Exception e = assertThrows(IllegalArgumentException.class , ()-> list1.addEmployee(e1));
        assertEquals("Employee already exists" , e.getMessage());
    }


    @Test
    void testGetSize(){
        list1.addEmployee(e1);
        assertEquals(list1.getSize() , 1);
    }

}

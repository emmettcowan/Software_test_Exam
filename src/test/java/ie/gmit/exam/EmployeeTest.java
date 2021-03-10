package ie.gmit.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    private Employee e1;

    @BeforeEach
    void init() {
        e1 = new Employee("Emmett", "08922977", 12345, 21);
    }

    @Test
    void testConstructorName(){
        assertEquals(e1.getName() ,"Emmett");
    }

    @Test
    void testConstructorNameFail(){
        Exception e = assertThrows(IllegalArgumentException.class, ()-> new Employee("ab", "08922977", 12345, 21));
        assertEquals("invalid Name" , e.getMessage());
    }

    @Test
    void testConstructorPhone(){
        assertEquals(e1.getPhone() ,"08922977");
    }

    @Test
    void testConstructorPhoneFail(){
        Exception e = assertThrows(IllegalArgumentException.class, ()-> new Employee("Emmett", "089763", 12345, 21));
        assertEquals("invalid Phone" , e.getMessage());
    }

    @Test
    void testConstructorID(){
        assertEquals(e1.getID() ,12345);
    }

    @Test
    void testConstructorIDFail(){
        Exception e = assertThrows(IllegalArgumentException.class, ()-> new Employee("Emmett", "08922977", 123, 21));
        assertEquals("invalid ID" , e.getMessage());
    }

    @Test
    void testConstructorAge(){
        assertEquals(e1.getAge() ,21);
    }

    @Test
    void testConstructorAgeFail(){
        Exception e = assertThrows(IllegalArgumentException.class, ()-> new Employee("Emmett", "08922977", 12345, 13));
        assertEquals("invalid Age" , e.getMessage());
    }

}

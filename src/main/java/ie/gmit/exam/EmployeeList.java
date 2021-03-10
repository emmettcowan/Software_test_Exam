package ie.gmit.exam;

import java.util.ArrayList;

public class EmployeeList {

    private ArrayList<Employee> Employees;


    public EmployeeList(){
        Employees = new ArrayList<Employee>();
    }


    public void addEmployee(Employee e){
        if(Employees.contains(e)){
            throw new IllegalArgumentException("Employee already exists");
        }
        else {
            Employees.add(e);
        }
    }

    public int getSize(){
        return Employees.size();
    }
}

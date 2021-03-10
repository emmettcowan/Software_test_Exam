package ie.gmit.exam;

import java.util.ArrayList;

public class EmployeeList {

    private ArrayList<Employee> Employees;


    public EmployeeList(){
        Employees = new ArrayList<Employee>();
    }


    public void addEmployee(Employee e){
        for(int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).getID() == e.getID()) {
                throw new IllegalArgumentException("Employee already exists");
            }
        }
        Employees.add(e);
    }

    public int getSize(){
        return Employees.size();
    }
}

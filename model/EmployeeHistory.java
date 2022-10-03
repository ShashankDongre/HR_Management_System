
package model;

import java.util.ArrayList;


public class EmployeeHistory {
    
    private ArrayList<Employee>history;
    
    public EmployeeHistory(){
        this.history = new ArrayList<Employee>();
        
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        history.add(newEmployee);
        return newEmployee;
        
    }

    public void deleteEmployee(Employee employee) {
        history.remove(employee);
        
    }
    
    
}

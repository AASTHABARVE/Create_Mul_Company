package com.bl.company;


import java.util.List;

//Create multiple Companies -> Create Employees with details(name, age, phoneNumber,city,state, department)
//-> Add multiple employees in each Company -> Also Maintain a dictionary of Company through a
// Map(key->companyName , value->Company-Object)  ->  Create 3 classes - Company , Employee and CompanyMain
class Company{


    private List<Employee> employees;
    public Company(List<Employee> employees)
    {
       this.employees=employees;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}
class Employee {
    private String name;
    private int age;
    private long phoneNumber;
    private String city;
    private String state;
    private String department;

    public Employee(String name, int age, long phoneNumber, String city, String state, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.department = department;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public long getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }




}




public class CompanyMain {
    public static void main(String args[]) {


    }
}



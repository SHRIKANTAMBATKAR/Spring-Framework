package shrikant;

import java.io.Serializable;

public class Employee implements  Serializable{
  private int empid;
  private String name;
  private int salary ,age;
  
  public Employee() {
	super();
  }
 
  public Employee(int empid, String name, int salary, int age) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
	this.age = age;
}


  @Override
  public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
  }
  
}


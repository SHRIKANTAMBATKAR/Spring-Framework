package shrikant;

import java.io.Serializable;

public class Employee implements  Serializable{
  private int empid;
  private String name;
  private int salary ,age;
  private Addresss addres;
  
  public Employee() {
	super();
  }
 
  
  public Employee(int empid, String name, int salary, int age, Addresss addres) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
	this.age = age;
	this.addres = addres;
}


  @Override
  public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", age=" + age + ", addres=" + addres
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
  }


  

 
  
}

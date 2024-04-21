package com.example.hr;

public class Employee {
String name;
int id;
double salary;
 public Employee(String name,int id,double salary){
	this.name=name;
	this.id=id;
	this.salary=salary;
	System.out.println("Employee name is:"+name+"   "+"id is:"+id+"   "+"salary is:"+salary);
}
public void printName() {
	System.out.println("The employee name:"+name);
	
}
public void printSalary() {
	System.out.println("The employee salary:"+salary);
	
}

}

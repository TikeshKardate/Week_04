/*
4. Serialization - Save and Retrieve an Object
 Problem Statement:
Design a Java program that allows a user to store a list of employees in a file using Object Serialization and
later retrieve the data from the file.
Requirements:
Create an Employee class with fields: id, name, department, salary.
Serialize the list of employees into a file (ObjectOutputStream).
Deserialize and display the employees from the file (ObjectInputStream).
Handle ClassNotFoundException and IOException.
*/


package com.streams.serialization;

import java.io.Serializable;
import java.io.*;

public class SaveAndRetrieveData {
    public static void main(String[] args) {
        // creating employee object
        Employee e1= new Employee("Suraj",101,"Testing",450000.0);


        // creating objectOutputStream and FileOutputStream to serialize the object to the file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Week_04\\Day_03\\src\\main\\java\\com\\streams\\serialization\\writeObject.txt"))) {
            oos.writeObject(e1);
            System.out.println("Employee saved successfully to " );
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }

        // ObjectInputStream and FileInputStream used for deserializing the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Week_04\\Day_03\\src\\main\\java\\com\\streams\\serialization\\writeObject.txt"))) {
            //storing the object into its Class type
            Employee printe1= (Employee) ois.readObject();
            System.out.println("Printing user employee data : ");
            System.out.println(printe1.toString());
         }
        // handling the exception
        catch (Exception e) {
            System.out.println(" Fie not found " + e.getMessage());
        }

    }
}

// Creating Employee class to use a object
class Employee implements Serializable {
    String name;
    int id;
    String department;
    double salary;

    Employee(String name,int id,String department,double salary){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.department= department;
    }

    // overriding toString method to print detail of the employee
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}


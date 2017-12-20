package com.kannan.collection.algorithms;

/**
 * @author Kannan Dharmalingam
 */
public class Traverse2DArray {
    class Employee {
        private String name;
        private Integer salary;
        Employee(String name, Integer salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        Traverse2DArray ob = new Traverse2DArray();
        Employee[][] employeesArray = ob.loadArray(x, y);
        System.out.println(ob.averageSalary(employeesArray));
    }

    private int averageSalary(Employee[][] employeeArray) {
        int sum = 0;
        int size = 0;
        for (Employee[] employees : employeeArray) {
            for (Employee employee : employees) {
                if (employee != null) {
                    sum += employee.salary;
                    size++;
                }
            }
        }
        return sum/size;
    }

    private Employee[][] loadArray(int x, int y) {
        Employee[][] employees = new Employee[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                employees[i][j] = new Employee("E" + i + "," + j, 100 * (i+1));
            }
        }
        return employees;
    }
}


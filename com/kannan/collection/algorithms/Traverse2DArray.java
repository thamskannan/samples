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
        Employee[][] employees = ob.loadArray(x, y);
        System.out.println(ob.averageSalary(employees));
    }

    private int averageSalary(Employee[][] employees) {
        int sum = 0;
        int size = 0;
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees[i].length; j++) {
                Employee employee = employees[i][j];
                if (employee != null) {
                    sum += employee.salary;
                    size++;
                }
            }
        }
        return sum/size;
    }

    private Employee[][] loadArray(int x, int y) {
        Employee[][] cells = new Employee[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                cells[i][j] = new Employee("E" + i + "," + j, 100 * (i+1));
            }
        }
        return cells;
    }
}


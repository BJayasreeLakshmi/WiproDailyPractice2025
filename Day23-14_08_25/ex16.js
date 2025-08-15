var employeeList = [
    { empId: 1,
        empName: "Jayasree",
        empSalary: 4000
    },
    { empId: 2,
        empName: "Geetha",
        empSalary: 6000
    },
    { empId: 3,
        empName: "Niharika",
        empSalary: 5000
    }
];
function printEmp(employees) {
    employees.forEach(function (emp) {
        console.log("ID: ".concat(emp.empId, ", Name: ").concat(emp.empName, ", Salary: ").concat(emp.empSalary));
    });
    return employees.length;
}
var total = printEmp(employeeList);
console.log("Total Employees:", total);

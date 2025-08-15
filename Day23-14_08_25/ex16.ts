interface Employee{

    empId:number;
    empName:String,
    empSalary:number

}
let employeeList:Employee[]=[

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
function printEmp(employees: Employee[]): number {
    employees.forEach(emp => {
        console.log(`ID: ${emp.empId}, Name: ${emp.empName}, Salary: ${emp.empSalary}`);
    });
    return employees.length;
}
let total = printEmp(employeeList);
console.log("Total Employees:", total);

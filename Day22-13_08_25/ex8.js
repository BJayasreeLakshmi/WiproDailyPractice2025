function totalSal(){
    let employee=[
        { name: "jayasree", role: "Manager", empId: 101, salary: 8000 },
        { name: "Arun", role: "Manager", empId: 102, salary: 9000 },
        { name: "Bobby", role: "Developer", empId: 103, salary: 7000 },
        { name: "sathish", role: "Developer", empId: 104, salary: 7000 },
        { name: "Geetha", role: "QA", empId: 105, salary: 8000 },
        { name: "Lakshmi", role: "Manager", empId: 106, salary: 9000 },
    ]

    var totalSal=employee.filter(emp=>emp.role=="Manager")
                    .reduce((sum, emp) => sum + emp.salary, 0);

    console.log("total salary of all the managers ="+totalSal);
}
totalSal();
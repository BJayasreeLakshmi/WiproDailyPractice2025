let employee=[
    { name: "jayasree", age: 23, city: "Bengaluru" },
        { name: "geetha", age: 26, city: "hyderabad" },
        { name: "bobby", age: 16, city: "chennai" },
        { name: "sathish", age: 17, city: "hyderabad" },
        { name: "giri", age: 30, city: "chennai" }
]
let eligiblePersons=employee.filter(person=>person.age>=18)
console.log(eligiblePersons);
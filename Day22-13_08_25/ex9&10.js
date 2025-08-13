function minorOrAdult(){
    const listOfVoters=[
    { name: "jayasree", age: 23, city: "Bengaluru" },
        { name: "geetha", age: 26, city: "hyderabad" },
        { name: "bobby", age: 16, city: "chennai" },
        { name: "sathish", age: 17, city: "hyderabad" },
        { name: "giri", age: 30, city: "chennai" }]

    //     for(let i = 0; i < listOfVoters.length; i++) {
    // if(listOfVoters[i]>=18)
    // {
    //     listOfVoters[i].status = "Adult";
    // }else
    // {
    //     listOfVoters[i].status = "Minor";
    // }
    const updatedPeople = listOfVoters.map(person => {
        return {
            name: person.name,
            age: person.age,
            city: person.city,
            status: person.age >= 18 ? "Adult" : "Minor"
        };
    });

    console.log(updatedPeople);
    
 
   
 }


minorOrAdult();
 
 

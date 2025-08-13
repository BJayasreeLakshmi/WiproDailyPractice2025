

function upperCasename(){
const names=["jayasree","lakshmi","geetha","Giri"];
const result = names
        .filter(name => name.length > 5)
        .map(name => name.toUpperCase());

    console.log(result);

}
upperCasename();
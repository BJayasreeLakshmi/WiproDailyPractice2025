
 //ex2//
// document.getElementById("h2").innerHTML="Hello JavaScript";



 //ex3//
// function fn() {
//     const inputText = document.getElementById("myinput").value;
//     const length = inputText.length;
//     document.getElementById("result").textContent = "Length: " + length;
// }

 //ex4

// function updatechars() {
//     const maxLength = 50;
//     const inputText = document.getElementById("myInput").value;
//     const remaining = maxLength - inputText.length;

//     document.getElementById("charCount").textContent = remaining + " characters remaining";
// }

let x=10;
var y=5;
const z=20;

function fn(){
    x=15;
    console.log(x);

    y=6;
    console.log(y)

    
    console.log(z);
}
console.log("---------------");
console.log(x);
console.log(y);
fn()



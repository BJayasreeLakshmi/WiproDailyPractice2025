const arr = [1,2,3];

function sum(a, b, c) {
    return a + b + c;
}

const result = sum(...arr);

console.log(result);
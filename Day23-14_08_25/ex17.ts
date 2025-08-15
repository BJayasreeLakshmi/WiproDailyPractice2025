class Calculator {
    
    add(a: number, b: number): number {
        return a + b;
    }

    subtract(a: number, b: number): number {
        return a - b;
    }
}
const calc = new Calculator();

console.log("Addition:", calc.add(2, 6));      
console.log("Subtraction:", calc.subtract(10, 10));

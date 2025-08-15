class Box<T>{
    value: T;

    constructor(value:T){
        this.value=value;
    }
    getValue(): T {
        return this.value;
    }
}
const num= new Box<number>(256);
console.log(num.getValue());

const str=new Box<string>("Jayasree");
console.log(str.getValue());
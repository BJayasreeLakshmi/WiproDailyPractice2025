function pair<T,U>(first: T, second: U): [T, U] {
    return [first, second];
}
const pair1=pair<number, string>(20, "Jayasree");
console.log(pair1);
const pair2=pair<String,String>("Lakshmi","Bedapuri");
console.log(pair2);
class Stack<T>{
      
     items: T[] = [];

      push(item: T) 
      {
        this.items.push(item);
      }

      pop(): T | undefined 
      {
        return this.items.pop();
      }
      peek(): T | undefined {
        return this.items[this.items.length - 1];
      }
      isEmpty(): boolean {
        return this.items.length === 0;
    }
}

    const numberStack = new Stack<number>();
    numberStack.push(10);
    numberStack.push(20);
    console.log(numberStack.peek()); 
    console.log(numberStack.pop());  
    console.log(numberStack.pop());  
    console.log(numberStack.pop());  

    const stringStack = new Stack<string>();
    stringStack.push("jayasree");
    stringStack.push("bedapuri");
    console.log(stringStack.peek());












class Util{


     getDate()
    {
     let todayDate=new Date();
     return todayDate;
    }

    getPiValue(){
        let piValue=Math.PI;
        return piValue
    }
    convertC2F(celsius) {
        return (celsius * 9/5) + 32;
    }

    getFibanoccie(num){
        if (num==0){
            return 0;
        }else{
            const fib = [0, 1];
            for (let i = 2; i < num; i++) {
            fib.push(fib[i - 1] + fib[i - 2]);
        }
        return fib;
        }
    }


}
let u1=new Util();
console.log(u1.getDate());
console.log(u1.getPiValue());
console.log(u1.convertC2F());
console.log(u1.getFibanoccie(5));
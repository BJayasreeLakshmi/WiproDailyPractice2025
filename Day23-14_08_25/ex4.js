class BankAccount{

    constructor (accountNumber,balance){
        this.accountNumber=accountNumber;
        this.balance=balance

    }

    deposit(amount){
        console.log("previous Balance ="+this.balance);
        this.balance=this.balance+amount;
        console.log("After deposit Balance="+this.balance);

    }

    withdraw(amount){
        if(this.balance<amount){
            console.log("Your Account Balance is not sufficient to withdraw");
        }
        else{
            this.balance=this.balance-amount;
            console.log("Amount "+amount+" debited from accountNumber"+this.accountNumber);
            console.log("current balance ="+this.balance);
        }
    }

}
var b1=new BankAccount(121334,5000);
b1.deposit(500);
b1.withdraw(100);
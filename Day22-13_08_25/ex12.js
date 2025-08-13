function isPalindrome(str) {
    str = str.toLowerCase(); 
    let reversed = "";

    for (let i = str.length - 1; i >= 0; i--) {
        reversed += str[i];
    }

    if(str === reversed)
    {
        console.log("Palindrome");
    }
    else{
        console.log("Not Palindrome");
    }
}

isPalindrome("madarm");
  const num1El = document.getElementById("num1");
    const num2El = document.getElementById("num2");
    const outEl  = document.getElementById("out");
    const msgEl  = document.getElementById("msg");

    
    function readNumbers() {
      const a = Number(num1El.value);
      const b = Number(num2El.value);

     
      if (num1El.value === "" || num2El.value === "" || Number.isNaN(a) || Number.isNaN(b)) {
        msgEl.textContent = "Please enter valid numbers in both fields.";
        return null;
      }
      msgEl.textContent = ""; 
      return { a, b };
    }

   
    function add() {
      const v = readNumbers(); if (!v) return;
      outEl.textContent = v.a + v.b;
    }

    function sub() {
      const v = readNumbers(); if (!v) return;
      outEl.textContent = v.a - v.b;
    }

    function mul() {
      const v = readNumbers(); if (!v) return;
      outEl.textContent = v.a * v.b;
    }

    function div() {
      const v = readNumbers(); if (!v) return;
      if (v.b === 0) { msgEl.textContent = "Cannot divide by zero."; return; }
      outEl.textContent = v.a / v.b;
    }

    
    document.getElementById("addBtn").onclick = add;
    document.getElementById("subBtn").onclick = sub;
    document.getElementById("mulBtn").onclick = mul;
    document.getElementById("divBtn").onclick = div;
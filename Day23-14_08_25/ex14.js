
// function login() {
//     let user = document.getElementById("username").value;
//     let pass = document.getElementById("password").value;

//     if (user && pass) {
//         localStorage.setItem("username", user);
//         console.log("User logged in: " + user);
//     } else {
//         console.log("Please enter both username and password");
//     }
// }

// function logout() {
//     localStorage.removeItem("username");
//     console.log("User logged out");
// }
const userIdInput = document.getElementById("userId");
        const passwordInput = document.getElementById("password");
        const statusText = document.getElementById("status");

        document.getElementById("loginBtn").addEventListener("click", function () {
            const userId = userIdInput.value.trim();
            if (userId) {
                localStorage.setItem("userId", userId);
                statusText.innerText = "Logged in as: " + userId;
            } else {
                alert("Please enter a User ID");
            }
        });

        document.getElementById("logoutBtn").addEventListener("click", function () {
            localStorage.removeItem("userId");
            statusText.innerText = "Logged out";
        });

        // Show status if already logged in
        window.onload = function () {
            const savedUser = localStorage.getItem("userId");
            if (savedUser) {
                statusText.innerText = "Logged in as: " + savedUser;
            } else {
                statusText.innerText = "Not logged in";
            }
        };

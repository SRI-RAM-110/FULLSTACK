document.addEventListener("DOMContentLoaded", () => {

    const form = document.getElementById("registerForm");
    const messageBox = document.getElementById("registerMessage");

    form.addEventListener("submit", async (event) => {

        event.preventDefault();

        const formData = new FormData(form);

        const user = {
            username: formData.get("username"),
            email: formData.get("email"),
            password: formData.get("password"),
            role: "USER"
        };

        try {

            const response = await fetch(
                "http://localhost:8080/api/users",
                {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json"
                    },
                    body: JSON.stringify(user)
                }
            );

            if (!response.ok) {
                throw new Error("Registration Failed");
            }

            const savedUser = await response.json();

            messageBox.innerHTML =
                "Registration Successful! Redirecting to Login...";

            console.log(savedUser);

            setTimeout(() => {
                window.location.href = "login.html";
            }, 1500);

        } catch (error) {

            console.error(error);

            messageBox.innerHTML =
                "Registration Failed. Please try again.";

        }

    });

});
const passwordRegex = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*()-+]{6,}$/;

const handlePasswordInputChange = (event) => {

    if ((event.target.value).match(passwordRegex)) {
        console.log("Password meets all criteria");
    } else {
        console.log("Your password must be at least 6 characters long, have 1 uppercase character, 1 lowercase character, and 1 special character of !@#$%^&*()-+");
    }
}


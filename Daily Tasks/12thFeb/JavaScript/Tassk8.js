const guessNumberGame = () => {
    const randomNumber = Math.floor(Math.random() * 10) + 1;
    
    const container = document.createElement("div");
    
    const input = document.createElement("input");
    input.type = "number";
    input.placeholder = "Enter a number (1-10)";
    
    const button = document.createElement("button");
    button.textContent = "Guess";
    
    const result = document.createElement("p");
    
    button.onclick = () => {
        const userGuess = parseInt(input.value, 10);
        if (!isNaN(userGuess) && userGuess >= 1 && userGuess <= 10) {
            result.textContent = userGuess === randomNumber ? "Good Work" : "Not matched";
        } else {
            result.textContent = "Please enter a valid number between 1 and 10.";
        }
    };
    
    container.appendChild(input);
    container.appendChild(button);
    container.appendChild(result);
    document.body.appendChild(container);
};

guessNumberGame();

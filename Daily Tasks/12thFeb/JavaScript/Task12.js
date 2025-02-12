const createLargestIntegerChecker = () => {
    const container = document.createElement("div");
    
    const input1 = document.createElement("input");
    input1.type = "number";
    input1.placeholder = "Enter first number";
    
    const input2 = document.createElement("input");
    input2.type = "number";
    input2.placeholder = "Enter second number";
    
    const button = document.createElement("button");
    button.textContent = "Find Largest";
    
    const result = document.createElement("p");
    
    button.onclick = () => {
        const num1 = parseInt(input1.value, 10);
        const num2 = parseInt(input2.value, 10);
        
        if (!isNaN(num1) && !isNaN(num2)) {
            if (num1 > num2) {
                result.textContent = `The largest number is: ${num1}`;
            } else if (num2 > num1) {
                result.textContent = `The largest number is: ${num2}`;
            } else {
                result.textContent = "Both numbers are equal.";
            }
        } else {
            result.textContent = "Please enter valid numbers.";
        }
    };
    
    container.appendChild(input1);
    container.appendChild(input2);
    container.appendChild(button);
    container.appendChild(result);
    document.body.appendChild(container);
};

createLargestIntegerChecker();

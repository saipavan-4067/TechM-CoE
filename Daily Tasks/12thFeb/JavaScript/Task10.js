const createCalculator = () => {
    const container = document.createElement("div");
    
    const input1 = document.createElement("input");
    input1.type = "number";
    input1.placeholder = "1st Number";
    
    const input2 = document.createElement("input");
    input2.type = "number";
    input2.placeholder = "2nd Number";
    
    const multiplyButton = document.createElement("button");
    multiplyButton.textContent = "Multiply";
    
    const divideButton = document.createElement("button");
    divideButton.textContent = "Divide";
    
    const result = document.createElement("p");
    
    multiplyButton.onclick = () => {
        const num1 = parseFloat(input1.value);
        const num2 = parseFloat(input2.value);
        if (!isNaN(num1) && !isNaN(num2)) {
            result.textContent = `The Result Is: ${num1 * num2}`;
        } else {
            result.textContent = "Please enter valid numbers.";
        }
    };
    
    divideButton.onclick = () => {
        const num1 = parseFloat(input1.value);
        const num2 = parseFloat(input2.value);
        if (!isNaN(num1) && !isNaN(num2) && num2 !== 0) {
            result.textContent = `The Result Is: ${num1 / num2}`;
        } else {
            result.textContent = "Please enter valid numbers and ensure divisor is not zero.";
        }
    };
    
    container.appendChild(input1);
    container.appendChild(input2);
    container.appendChild(multiplyButton);
    container.appendChild(divideButton);
    container.appendChild(result);
    document.body.appendChild(container);
};

createCalculator();

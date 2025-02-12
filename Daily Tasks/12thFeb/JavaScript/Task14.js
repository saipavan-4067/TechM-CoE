const sortNumbers = () => {
    const container = document.createElement("div");
    
    const input1 = document.createElement("input");
    input1.type = "number";
    input1.placeholder = "Enter first number";
    
    const input2 = document.createElement("input");
    input2.type = "number";
    input2.placeholder = "Enter second number";
    
    const input3 = document.createElement("input");
    input3.type = "number";
    input3.placeholder = "Enter third number";
    
    const button = document.createElement("button");
    button.textContent = "Sort Numbers";
    
    button.onclick = () => {
        const num1 = parseFloat(input1.value);
        const num2 = parseFloat(input2.value);
        const num3 = parseFloat(input3.value);
        
        if (!isNaN(num1) && !isNaN(num2) && !isNaN(num3)) {
            const sortedNumbers = [num1, num2, num3].sort((a, b) => b - a);
            alert(`Sorted numbers: ${sortedNumbers.join(", ")}`);
        } else {
            alert("Please enter valid numbers.");
        }
    };
    
    container.appendChild(input1);
    container.appendChild(input2);
    container.appendChild(input3);
    container.appendChild(button);
    document.body.appendChild(container);
};

sortNumbers();

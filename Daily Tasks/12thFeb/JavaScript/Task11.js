const createTemperatureConverter = () => {
    const container = document.createElement("div");
    
    const input = document.createElement("input");
    input.type = "number";
    input.placeholder = "Enter temperature";
    
    const cToFButton = document.createElement("button");
    cToFButton.textContent = "Convert to Fahrenheit";
    
    const fToCButton = document.createElement("button");
    fToCButton.textContent = "Convert to Celsius";
    
    const result = document.createElement("p");
    
    cToFButton.onclick = () => {
        const celsius = parseFloat(input.value);
        if (!isNaN(celsius)) {
            const fahrenheit = (celsius * 9/5) + 32;
            result.textContent = `${celsius}°C is ${fahrenheit}°F`;
        } else {
            result.textContent = "Please enter a valid temperature.";
        }
    };
    
    fToCButton.onclick = () => {
        const fahrenheit = parseFloat(input.value);
        if (!isNaN(fahrenheit)) {
            const celsius = (fahrenheit - 32) * 5/9;
            result.textContent = `${fahrenheit}°F is ${celsius}°C`;
        } else {
            result.textContent = "Please enter a valid temperature.";
        }
    };
    
    container.appendChild(input);
    container.appendChild(cToFButton);
    container.appendChild(fToCButton);
    container.appendChild(result);
    document.body.appendChild(container);
};

createTemperatureConverter();

const isLeapYear = (year) => {
    return (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
};

const displayLeapYearCheck = () => {
    const container = document.createElement("div");
    
    const input = document.createElement("input");
    input.type = "number";
    input.placeholder = "Enter a year";
    
    const button = document.createElement("button");
    button.textContent = "Check Leap Year";
    
    const result = document.createElement("p");
    
    button.onclick = () => {
        const year = parseInt(input.value, 10);
        if (!isNaN(year)) {
            result.textContent = isLeapYear(year) ? `${year} is a leap year.` : `${year} is not a leap year.`;
        } else {
            result.textContent = "Please enter a valid year.";
        }
    };
    
    container.appendChild(input);
    container.appendChild(button);
    container.appendChild(result);
    document.body.appendChild(container);
};

displayLeapYearCheck();

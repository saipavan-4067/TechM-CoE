const findSundays = () => {
    const container = document.createElement("div");
    const result = document.createElement("p");
    
    let sundays = [];
    for (let year = 2014; year <= 2050; year++) {
        let firstDay = new Date(year, 0, 1).getDay();
        if (firstDay === 0) {
            sundays.push(year);
        }
    }
    
    result.textContent = `1st January falls on a Sunday in the years: ${sundays.join(", ")}`;
    container.appendChild(result);
    document.body.appendChild(container);
};

findSundays();

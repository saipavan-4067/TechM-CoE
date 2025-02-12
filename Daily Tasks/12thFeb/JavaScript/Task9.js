const daysUntilChristmas = () => {
    const today = new Date();
    const year = today.getFullYear();
    const christmas = new Date(year, 11, 25);
    
    if (today > christmas) {
        christmas.setFullYear(year + 1);
    }
    
    const diffTime = christmas - today;
    const daysLeft = Math.ceil(diffTime / (1000 * 60 * 60 * 24));
    
    const result = document.createElement("p");
    result.textContent = `Days left until Christmas: ${daysLeft}`;
    document.body.appendChild(result);
};

daysUntilChristmas();

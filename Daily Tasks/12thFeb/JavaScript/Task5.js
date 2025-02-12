const rotateStringRight = (str) => {
    const display = document.createElement("p");
    document.body.appendChild(display);
    
    let rotatedStr = str;
    setInterval(() => {
        rotatedStr = rotatedStr.slice(-1) + rotatedStr.slice(0, -1);
        display.textContent = rotatedStr;
    }, 500);
};

rotateStringRight("digiterati");

const displayCurrentDate = () => {
    const now = new Date();
    const day = String(now.getDate()).padStart(2, '0');
    const month = String(now.getMonth() + 1).padStart(2, '0');
    const year = now.getFullYear();
    
    const formats = [
        `${month}-${day}-${year}`,
        `${month}/${day}/${year}`,
        `${day}-${month}-${year}`,
        `${day}/${month}/${year}`
    ];
    
    const container = document.createElement("div");
    formats.forEach(format => {
        const p = document.createElement("p");
        p.textContent = format;
        container.appendChild(p);
    });
    document.body.appendChild(container);
};

displayCurrentDate();

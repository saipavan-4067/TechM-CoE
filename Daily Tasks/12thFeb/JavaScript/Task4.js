const calculateTriangleArea = (a, b, c) => {
    const s = (a + b + c) / 2;
    const area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    
    const result = document.createElement("p");
    result.textContent = `The area of the triangle is: ${area.toFixed(2)}`;
    document.body.appendChild(result);
};

calculateTriangleArea(5, 6, 7);

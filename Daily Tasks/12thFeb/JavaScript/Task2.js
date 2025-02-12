const printWindowContents = () => {
    const printButton = document.createElement("button");
    printButton.textContent = "Print Page";
    printButton.onclick = () => window.print();
    document.body.appendChild(printButton);
};

printWindowContents();

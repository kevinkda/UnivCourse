function func_num(value) {
    let exponent = document.getElementById('exponent_td');
    if (Number.parseInt(exponent.innerText) === 0) {
        exponent.innerText = value;
    } else {
        exponent.innerText = exponent.innerText + value;
    }
}

function clean() {
    let exponent = document.getElementById('exponent_td');
    let result = document.getElementById('result');
    exponent.innerText = 0;
    result.innerText = 0;
}

function equals() {
    let exponent = document.getElementById('exponent_td');
    let result = document.getElementById('result');
    try {
        result.innerText = eval(exponent.innerText);
    } catch (e) {
        result.innerText = NaN;
    }
}

function func_oper(value) {
    let exponent = document.getElementById('exponent_td');
    exponent.innerText = exponent.innerText + value;
}
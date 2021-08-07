let allGoodsCount = 0;
let allPriceTotal = 0;

function add(price, index) {
    let allGoods = document.getElementsByClassName("all").length;
    let goodCount = document.getElementById('good' + index).value.trim();
    if (goodCount < 99) {
        //不能超过100件
        document.getElementById('good' + index).value++;
        document.getElementById('all' + index).innerHTML = parseFloat(++goodCount * price);
        allGoodsCount = 0;
        allPriceTotal = 0;
        for (let i = 1; i <= allGoods; i++) {
            allGoodsCount += parseInt(document.getElementById('good' + i).value);
            allPriceTotal += parseFloat(document.getElementById('all' + i).innerHTML.trim());
            if (document.getElementById('checker' + i).checked === true) {
                document.getElementById('allGoodsCount').innerHTML = allGoodsCount;
                document.getElementById('allPriceTotal').innerHTML = allPriceTotal;
            }
        }
    } else {
        alert('商品件数不能超过100！');
    }
}

function sub(price, index) {
    let allGoods = document.getElementsByClassName("all").length;
    let goodCount = document.getElementById('good' + index).value.trim();
    if (goodCount > 0) {
        //不能少于0件
        document.getElementById('good' + index).value--;
        document.getElementById('all' + index).innerHTML = parseFloat(--goodCount * price);
        allGoodsCount = 0;
        allPriceTotal = 0;
        for (let i = 1; i <= allGoods; i++) {
            // if (document.getElementById('checker' + i).checked == true) {
            allGoodsCount += parseInt(document.getElementById('good' + i).value);
            allPriceTotal += parseFloat(document.getElementById('all' + i).innerHTML.trim());
            if (document.getElementById('checker' + i).checked === true) {
                document.getElementById('allGoodsCount').innerHTML = allGoodsCount;
                document.getElementById('allPriceTotal').innerHTML = allPriceTotal;
            }
        }
    }
}

function valiAllChecked() {
    let checker = document.getElementsByName('checker');    //存name为checker的
    if (checker[0].checked === true) {
        for (let i = 1; i < checker.length; i++) {
            checker[i].checked = 'checked';
        }
        document.getElementById('allGoodsCount').innerHTML = allGoodsCount;
        document.getElementById('allPriceTotal').innerHTML = allPriceTotal;
    } else {
        for (let i = 1; i < checker.length; i++) {
            checker[i].checked = '';
        }
        document.getElementById('allGoodsCount').innerHTML = 0;
        document.getElementById('allPriceTotal').innerHTML = 0;
    }
}

function checkerControl(index) {
    let checker = document.getElementsByName('checker');    //存name为checker的
    let checkStatus = true;
    for (let i = 1; i < checker.length; i++) {
        if (checker[i].checked === false) {
            checkStatus = false;
        }
    }
    if (checker[index].checked === true) {
        document.getElementById('allGoodsCount').innerHTML =
            parseInt(document.getElementById('allGoodsCount').innerHTML) + parseInt(document.getElementById('good' + index).value);
        document.getElementById('allPriceTotal').innerHTML =
            parseFloat(document.getElementById('allPriceTotal').innerHTML) + parseFloat(document.getElementById('all' + index).innerHTML.trim());
    } else {
        document.getElementById('allGoodsCount').innerHTML =
            parseInt(document.getElementById('allGoodsCount').innerHTML) - parseInt(document.getElementById('good' + index).value);
        document.getElementById('allPriceTotal').innerHTML =
            parseFloat(document.getElementById('allPriceTotal').innerHTML) - parseFloat(document.getElementById('all' + index).innerHTML.trim());
    }
    if (checkStatus) {
        checker[0].checked = 'checked';
    } else {
        checker[0].checked = '';
    }
}
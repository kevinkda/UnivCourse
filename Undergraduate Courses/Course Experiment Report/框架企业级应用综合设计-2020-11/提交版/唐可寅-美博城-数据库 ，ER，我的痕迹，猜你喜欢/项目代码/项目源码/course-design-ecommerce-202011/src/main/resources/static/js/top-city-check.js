// JavaScript Document
//城市选择
function jsoverA() {
    document.getElementById("a1").style.display = "block";
}

function jsoutA() {
    document.getElementById("a1").style.display = "none";
}

//商圈或社区
function jsoverB() {
    document.getElementById("b1").style.display = "block";
}

function jsoutB() {
    document.getElementById("b1").style.display = "none";
}

//网站导航
function jsoverC() {
    document.getElementById("c1").style.display = "block";
}

function jsoutC() {
    document.getElementById("c1").style.display = "none";
}

//收藏夹
function jsoverD() {
    document.getElementById("d1").style.display = "block";
}

function jsoutD() {
    document.getElementById("d1").style.display = "none";
}

//我易到的货
function jsoverE() {
    document.getElementById("e1").style.display = "block";
}

function jsoutE() {
    document.getElementById("e1").style.display = "none";
}

//其他
function jsoverF() {
    document.getElementById("f1").style.display = "block";
}

function jsoutF() {
    document.getElementById("f1").style.display = "none";
}


//伸缩代码调用	
function hideAll() {
    for (i = 0; i < odiv.length; i++) {
        odiv[i].style.display = "none";
    }
}

function showObj(num) {

    if (odiv[num].style.display == "none") {
        hideAll();
        odiv[num].style.display = "inline";
    } else {
        odiv[num].style.display = "none";
    }

}

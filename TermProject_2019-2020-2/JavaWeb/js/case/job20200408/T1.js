function t1() {
    let comA_conut = prompt("请输入A公司员工人数", 1);
    let comA_sum = 0;
    for (let i = 0; i < comA_conut; i++) {
        let temp = "请输入第" + (i + 1) + "位员工的工资";
        comA_sum += Number.parseFloat(prompt(temp, 0));
    }
    let comB_conut = prompt("请输入B公司员工人数", 1);
    let comB_sum = 0;
    comA_sum = comA_sum / comA_conut;
    for (let i = 0; i < comB_conut; i++) {
        let temp = "请输入第" + (i + 1) + "位员工的工资";
        comB_sum += Number.parseFloat(prompt(temp, 0));
    }
    comB_sum = comB_sum / comB_conut;
    document.getElementById("t1a").style.display = "table-row";
    document.getElementById("t1b").style.display = "table-row";
    document.getElementById("comA_Pcount").innerText = comA_conut;
    document.getElementById("comA_Psum").innerText = comA_sum;
    document.getElementById("comB_Pcount").innerText = comB_conut;
    document.getElementById("comB_Psum").innerText = comB_sum;
}

function t2() {
    let sharpNum = Number.parseInt(prompt("请选择要计算的图形的编号（1:圆形、2:正方形、3:长方形、4:三角形）", 2));
    let sharp = "输入错误";
    let area = 0.0;
    switch (sharpNum) {
        case 1:
            sharp = "圆形";
            let r = Number.parseFloat(prompt("请输入圆的半径", 1));
            area = Math.PI * Math.pow(r, 2);
            break;
        case 2:
            sharp = "正方形";
            let x = Number.parseFloat(prompt("请输入正方形的边长", 1));
            area = Math.pow(x, 2);
            break;
        case 3:
            sharp = "长方形";
            let a = Number.parseFloat(prompt("请输入长方形的长", 1));
            let b = Number.parseFloat(prompt("请输入长方形的宽", 1));
            area = a * b;
            break;
        case 4:
            sharp = "三角形";
            let y = Number.parseFloat(prompt("请输入三角形的底边长", 1));
            let h = Number.parseFloat(prompt("请输入三角形的高", 1));
            area = y * h / 2;
            break;
    }
    document.getElementById("t2").style.display = "table-row";
    document.getElementById("sharp").innerText = sharp;
    document.getElementById("area").innerText = area;
}
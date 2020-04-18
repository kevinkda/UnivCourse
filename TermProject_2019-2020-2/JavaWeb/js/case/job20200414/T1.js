function guess() {
    let result = Math.floor(Math.random() * 10 + 1);
    let guessCount = 1;
    let maxGuessCount = 10;
    alert('游戏开始！');
    do {
        let num = prompt('第' + guessCount + '回合');
        if (num === result) {
            if (confirm('恭喜你猜对了！<br/>是否继续游戏？若是请按确认，退出请按取消。')) {
                guess();
            } else {
                break;
            }
        } else {
            if (maxGuessCount - guessCount >= 1) {
                alert('很遗憾猜错了哦！您还有' + (maxGuessCount - guessCount) + '次机会');
                if (confirm('是否继续？若是请按确认，退出请按取消')) {
                    guessCount++;
                } else {
                    break;
                }
            } else {
                alert('机会已用完，游戏结束！');
                if (confirm('是否再来一局？若是请按确认，退出请按取消。')) {
                    guess();
                } else {
                    break;
                }
            }
        }
    } while (guessCount <= 10);
}

let str = 'abcdefgabcdf'; //原生字符串
let showInfo = '';

function getAB() {
    let str2 = '';
    for (let i = 0; i < str.length - 1; i++) {
        if (str.substring(i, i + 2) === 'ab') {
            str2 += str + '的索引' + i + '处和索引' + (i + 1) + '处有"ab"字样<br/>';
        }
    }
    if (showInfo.indexOf(str2) === -1) {
        showInfo += str2;
        document.getElementById('shower').innerHTML = showInfo;
    }
}

function markStarA() {
    let str2 = str;
    let str3 = '';
    for (let i = 0; str2.indexOf('f') !== -1; i++) {
        str2 = str2.replace('f', '*');
    }

    str3 = '现在我变成这样了：' + str2 + '<br/>';
    if (showInfo.indexOf(str3) === -1) {
        showInfo += str3;
        document.getElementById('shower').innerHTML = showInfo;
    }
}


let inputs = [];

function changeA() {
    let strs = '';
    let input = prompt('请输入任意一段英文，每句话之间以!隔开').trim();
    inputs = input.trim().split('!');
    for (let i = 0; i < inputs.length; i++) {
        strs += inputs[i] + '<br/>';
    }
    document.getElementById('userInput').innerHTML = strs;
    document.getElementById('hidBtn').style.display = 'block';
}

function markStarB() {
    let str2 = inputs;
    let str3 = '';
    for (let j = 0; j < str2.length; j++) {
        for (let i = 0; str2[j].indexOf('a') !== -1; i++) {
            str2[j] = str2[j].replace('a', '*');
        }
        str3 += str2[j] + '<br/>';
        document.getElementById('shower2').innerHTML = str3;
    }

}
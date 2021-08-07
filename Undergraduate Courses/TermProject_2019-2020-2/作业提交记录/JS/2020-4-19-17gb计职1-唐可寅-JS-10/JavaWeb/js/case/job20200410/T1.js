let str = '';
window.onload = function () {
    //先获取所有的tr存进数组
    let trs = document.getElementsByTagName('tr');
    for (let i = 1; i < trs.length; i++) {
        trs[i].ondblclick = function () {
            //打开隐藏的div
            document.getElementById('modify-Div').style.display = 'block';
            let tds = this.getElementsByTagName('td');
            for (let i = 0; i < tds.length; i++) {
                document.getElementById('newName').value = tds[0].innerText;
                document.getElementById('preName').value = tds[0].innerText;
                document.getElementById('newAge').value = tds[1].innerText;
                document.getElementById('newID').value = tds[2].innerText;
                str = document.getElementById('newName').value;//存要修改的用户原名称
            }
        }
    }
}

function modify() {
    let trs = document.getElementsByTagName('tr');
    if (confirm('将要修改好友列表里原名为：' + str + '的数据，您确定吗？')) {
        for (let i = 1; i < trs.length; i++) {
            let tds = trs[i].getElementsByTagName('td');
            if (document.getElementById('preName').value === str) {
                tds[0].innerText = document.getElementById('newName').value;
                tds[1].innerText = document.getElementById('newAge').value;
                tds[2].innerText = document.getElementById('newID').value;
                break;
            } else {
                alert('修改失败！查无此人！')
            }
        }
        alert('修改成功！');
    } else {
        alert('已取消操作。');
    }
}
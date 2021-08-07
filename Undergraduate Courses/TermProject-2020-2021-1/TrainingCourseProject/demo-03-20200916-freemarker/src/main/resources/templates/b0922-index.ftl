<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div class="container">
    <#if list?? && (list?size>0)>
        <table>
            <tr>
                <td><input type="checkbox" name="ids" value="全选/非全选" onclick="choose()"></td>
                <td>序号</td>
                <td>user_id</td>
                <td>user_name</td>
                <td>reg_time</td>
            </tr>
            <#list list as item>
                <tr>
                    <td><input type="checkbox" name="ids"></td>
                    <td>${item_index+1}</td>
                    <td>${item.user_id}</td>
                    <td>${item.user_name}</td>
                    <td>${item.reg_time}</td>
                </tr>
            </#list>
            <tr>
                <td><input type="button" value="删除"></td>
            </tr>
        </table>
    <#else >
        暂无数据
    </#if>
</div>
</body>
<script>
    //全选
    function choose() {
        let box = document.getElementsByName("ids");
        if (box[0].checked) {//第一个多选框选中
            for (let i = 0; i < box.length; i++) {
                box[i].checked = true;
            }
            document.getElementById("btn").disabled = ""
        } else {
            for (let i = 0; i < box.length; i++) {//第一个多选框未选中
                box[i].checked = false;
            }
            document.getElementById("btn").disabled = "disabled"
        }
    }

    //监听每一个checkbox
    function chooseA() {
        let box = document.getElementsByName("ids");
        let result = false;
        for (let i = 1; i < box.length; i++) {
            if (box[i].checked === false) {
                result = true;
                break;
            }
        }
        if (result) {
            box[0].checked = false;
        } else {
            box[0].checked = true;
        }
        let temp = false;
        for (let i = 1; i < box.length; i++) {
            if (box[i].checked) {
                temp = true;
                break;
            }
        }

        if (temp) {
            document.getElementById("btn").disabled = "";
        } else {
            document.getElementById("btn").disabled = "disabled";
        }
    }

    function del() {
        //取得所有id的值
        let box = document.getElementsByName("ids");
        let ids = "";
        for (let i = 1; i < box.length; i++) {
            if (box[i].checked) {
                ids += box[i].value + ",";
            }
        }
        if (confirm("你确定要删除" + ids + "吗")) {
            alert("数据已删除");
        } else {
            alert("取消删除");
        }
    }
</script>
</html>
let count = 1;
$(function () {
    $("#showInfo").append("<p>---" + $("#info").val().trim() + "---");
    $("#showInfo").append("<p>已成功注册的信息：");
    $("#submitBtn").click(function () {
        /*账号，密码，select三个框不能为空*/
        if ($("#account").val().trim() !== '' && $("#pass").val().trim() !== '' && $("#lang-user").val() !== '请选择') {
            alert('注册成功！');
            $("#showInfo").show();
            let account = $("#account").val().trim();
            let pwd = $("#pass").val().trim();
            let sex = '';
            if ($(".sex")[0].checked === true) {
                sex = '男';
            } else {
                sex = '女';
            }
            let idols = '无';
            $("input[name='idol']").each(function () {
                if ($(this).is(":checked")) {
                    if (idols === '无') {
                        idols = '';
                    }
                    idols += $(this).val() + ',';
                }
            });
            if (idols !== '无') {
                idols = idols.substring(0, idols.length - 1);
            }
            let lang = $("#lang-user").val();
            $("#showInfo").append("<p>" + count + "、<span>账号：" + account + "<span>；密码：" + pwd + "<span>；性别：" + sex +
                "<span>；喜欢的歌手：" + idols + "<span>；选择的语言：" + lang);
            //添加完后初始化页面
            $("#account").val("");
            $("#pwd").val("");
            $("#lang-user").val("请选择");
            $(".sex")[0].checked = 'checked';
            $("input[name='idol']").prop("checked", false);
            count++;
        } else {
            alert('请检查注册信息是否填写完毕！');
        }
    })

})

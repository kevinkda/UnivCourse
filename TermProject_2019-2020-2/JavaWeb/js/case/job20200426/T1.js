$(function(){
    $("btn").click(function(){
        let user=$("#user").clone(true).val();//复制姓名到user
        let sex=$("input:radio:checked").clone(true).val();//把性别复制到sex
        console.log(user);
        console.log(sex);
        $.each($("input:checkbox:checked"),function(){
            console.log($(this).clone(true).val());
        });
    });
});

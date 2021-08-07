$(document).ready(function(){
    $('#passwordRepeat').change(function (){
        var password=$("#password").val();
        var passwordRepeat=$("#passwordRepeat").val();
        console.log('val1'+password);
        console.log('val2'+passwordRepeat);
        if ((password!=''&passwordRepeat!='')&&(passwordRepeat==password)){
            console.log('密码等于空且相等');
            $('#password').css("borderColor","green");
            $('#passwordRepeat').css("borderColor","green");
        }else{
            $('#password').css("borderColor","red");
            $('#passwordRepeat').css("borderColor","red");
        }
    })
})
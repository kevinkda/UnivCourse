$(function(){
    $("#btn").click(function(){
        $("ul li ul li").remove("ul li ul li:eq(0)");
    })
});

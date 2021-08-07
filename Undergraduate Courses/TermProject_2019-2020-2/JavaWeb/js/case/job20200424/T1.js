$(function () {
    $("#btn").click(function () {
        $("tr").css("background-color", "#767070");
        let val = $("#content").val().trim();
        let td = $("tr td:contains(" + val + ")");
        td.parent().css("background-color", "#6aff00");
    })
})

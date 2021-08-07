$(function () {
    $("#btn").click(function () {
        let val = $("#content").val().trim();
        let td = $("tr td:contains(" + val + ")");
        td.parent().css("background-color", "#ff8c00");
        $("tr").each(function () {
            if ($(this).css("background-color") !== 'rgb(0,85,255)') {
                $(this).hide();
            }
        })
    })
});

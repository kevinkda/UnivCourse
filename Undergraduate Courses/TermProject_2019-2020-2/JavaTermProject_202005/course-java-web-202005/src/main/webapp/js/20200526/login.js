function checkNick() {
    let userNick = $("#userNick").val().trim();
    if (userNick === '') {
        $("#errTag").html("Nick Null");
    } else {
        $.ajax({
            url: "/course/UserNickCheckServlet0526",
            type: "post",
            async: false,
            dataType: "text",
            data: {
                userNick: userNick
            },
            success: function (data) {
                console.log(data);
                if (data == 1) {
                    $("#errTag").html("ok");
                }
            },
            error: function (data) {

            }
        });
    }
}

function loginNow() {
    let userNick = $("#userNick").val().trim();
    if (userNick === '') {
        $("#errTag").html("Nick Null");
    } else {
        $.ajax({
            url: "/course/LoginServlet0526",
            type: "post",
            async: false,
            dataType: "text",
            data: {
                userNick: userNick,
                sex: $()
            },
            success: function (data) {

            },
            error: function (data) {

            }
        });
    }
}
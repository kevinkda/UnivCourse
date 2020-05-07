let Timer = null;
let player_degree = [];
$(function () {
    $(".box").each(function () {
        player_degree.push(1);
    });
    $(".btn").click(function () {
        let $index = $(".btn").index($(this)) + 1;
        if ($(".btn:eq(" + ($index - 1) + ")").val() === '播放') {
            $(".btn").each(function (i) {
                $(this).val('播放');
                $("#player" + (i + 1))[0].pause();
                clearInterval(Timer);
            });
            $(this).val('暂停');
            $("#player" + $index)[0].play();
            Timer = setInterval(function () {
                twirl($index - 1);
            }, 50)
        } else {
            $(this).val('播放');
            $("#player" + $index)[0].pause();
            clearInterval(Timer);
        }
    });
    $('.dec').click(function () {
        let $index = $(".dec").index($(this)) + 1;
        let vol = $('#player' + $index)[0].volume;
        vol = vol > 0 ? (vol * 10 - 1) / 10 : 0;
        $('#player' + $index)[0].volume = vol;
        console.log(vol);
    });
    $('.add').click(function () {
        let $index = $(".add").index($(this)) + 1;
        let vol = $('#player' + $index)[0].volume;
        vol = vol < 1 ? (vol * 10 + 1) / 10 : 1;
        $('#player' + $index)[0].volume = vol;
        console.log(vol);
    });
});


function twirl(index) {
    let str;
    str = 'rotate(' + player_degree[index] + 'deg)';
    $("#img-" + (index + 1))[0].style.webkitTransform = str;
    player_degree[index]++;
}

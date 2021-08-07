$(document).ready(function () {
    $('.mine_list').mousemove(function () {
        $(this).find('.i-list').show();
        $(this).find('.mine_text').addClass('hover');
    });
    $('.mine_list').mouseleave(function () {
        $(this).find('.i-list').hide();
        $(this).find('.mine_text').removeClass('hover');
    });
});

//slideUp
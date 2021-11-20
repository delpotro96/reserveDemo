$(document).ready(function () {
    //reserveCode 넘겨줄거임
    const reserveCode = 3;

    $("#deleteReserveBtn").click(function () {
        $.post('../deleteReserve', {reserveCode}, function () {
            alert("예약이 취소되었습니다")
        })
    })
})
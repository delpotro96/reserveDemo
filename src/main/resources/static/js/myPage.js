$(document).ready(function () {
    $("#showReserveBtn").click(function () {
        const reserveCode = 2; // 지워야됨
        $.post('../detailReserve', {reserveCode}, function () {
            alert()
        })
    })
})
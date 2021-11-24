$(document).ready(function () {
    $("#showReserveBtn").click(function () {
        const reserveCode = 2; // 지워야됨
        $.get('../detailReserve', {reserveCode}, function (data) {
            console.log(data)

        })
    })
})
$(document).ready(function () {

    $("#reserveBtn").click(function () {
        const name = $("#name").val();
        const phone = $("#phone").val();
        const email = $("#email").val();
        const password = $("#password").val();
        const reserveTime = $("#reserveTime").val();
        const reserveNumber = $("#reserveNumber").val();


        $.post('../reserve', {name, phone, email, password, reserveTime, reserveNumber}, function () {
            aler("예약이 완료되었습니다");
        })
    })
})
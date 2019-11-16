// 網頁的主程式寫在這裡
// 等待畫面內容載入完成後...
$(document).ready(function () {
    //載入完成後的流程...
    // 啟動Wow.js的流程
    new WOW().init();
    // console.log('loaded!');
    // 選到navbar裡面的nav-link
    //class.  id#
    $('.navbar .nav-link, #goBackBtn').click(function () {
        console.log('*************************');
        // this會代表當下被點到的.nav-link
        console.log('this:', this)
        // 取得移動目標
        let target = $(this).attr('href');
        console.log('target:', target);
        // 取得移動目標的y軸的座標
        let targetPosition = $(target).offset().top;
        console.log('targetPosition:', targetPosition);
        // 取得導覽列的高度
        let navbarHeight = $('.navbar').outerHeight();
        console.log('navbarHeight:', navbarHeight);
        // 準備動畫時間
        let duration = 400;
        // 觸發動畫 .animate({物件}, 時間)
        $('html, body').stop().animate({
            scrollTop: targetPosition - navbarHeight
        }, duration);

        console.log('************************');
    });

});

function search_animal() {
    let input = document.getElementById('searchbar').value
    input = input.toLowerCase();
    let x = document.getElementsByClassName('animals');

    for (i = 0; i < x.length; i++) {
        if (!x[i].innerHTML.toLowerCase().includes(input)) {
            x[i].style.display = "none";
        }
        else {
            x[i].style.display = "list-item";
        }
    }
} 
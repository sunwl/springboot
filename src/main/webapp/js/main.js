$(function(){
    //  $("#mainid").click();这种方式不能触发a的click事件，原因是jQuery的click触发的是元素onClick方法，而不是click点击事件
    $("#mainid")[0].click();
    //document.getElementById("mainid").click();
});


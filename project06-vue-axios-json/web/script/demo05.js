window.onload = function () {
    var app = new Vue({
        "el": "#app",
        "data": {
            "position": "暂时没有获取到鼠标的位置信息"
        },
        "methods": {
            "recordPosition": function (event) {
                this.position = event.clientX + " " + event.clientY;
            }
        }
    });
}
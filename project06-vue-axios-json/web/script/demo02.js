window.onload = function () {
    let vue = new Vue({
        "el": "#div0",
        data: {
            msg: "Hello World!"
        }
    });

    // 创建Vue对象，挂载#app这个div标签
    let app1 = new Vue({
        "el": "#app",
        "data": {
            "vueValue1": "太阳当空照"
        }
    });

    // 创建Vue对象，挂载#app这个div标签
    let app2 = new Vue({
        "el": "#doubleApp",
        "data": {
            "vueValue2": "太阳当空照"
        }
    });
}
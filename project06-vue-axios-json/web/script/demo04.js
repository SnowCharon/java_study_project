window.onload = function () {
    let app = new Vue({
        "el": "#div0",
        data: {
            msg: "Hello World!"
        },
        methods: {
            myRevers: function () {
                this.msg = this.msg.split("").reverse().join("");
            }
        }
    });
}
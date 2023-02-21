window.onload = function () {
    let vue = new Vue({
        "el": "#div0",
        data: {
            uname: "好耶",
            pwd: "123456"
        },
        methods: {
            axios01: function () {
                axios({
                    method: "POST",
                    url: "axios01.do",
                    params: {
                        uname: vue.uname,
                        pwd: vue.pwd
                    }
                })
                    .then(function (value) {
                        console.log(value)
                    })
                    .catch(function (reason) {
                        console.log(reason)
                    })
            }
        }
    });
}
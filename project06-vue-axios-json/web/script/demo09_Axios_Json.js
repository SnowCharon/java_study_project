window.onload = function () {
    let vue = new Vue({
        "el": "#div0",
        data: {
            uname: "好耶",
            pwd: "123456"
        },
        methods: {
            axios02: function () {
                axios({
                    method: "POST",
                    url: "axios02.do",
                    data: {
                        uname: vue.uname,
                        pwd: vue.pwd
                    }
                })
                    .then(function (value) {
                        let data = value.data;
                        //data对应的是：{uname:'mike',pwd:'ok'}
                        console.log(data);
                        vue.uname = data.uname;
                        vue.pwd = data.pwd;

                        //此处vue返回的是js object对象，所以可以直接点出属性
                        //如果获取的是一个字符串：“{uname:'mike',pwd:'ok'}”
                        //js语言中也有json字符串转换成对象的API
                        // String JSON.stringify(object)
                        // Object JSON.parse(String)
                    })
                    .catch(function (reason) {
                        console.log(reason)
                    })
            }
        }
    });
}
window.onload = function () {
    let vue = new Vue({
        "el": "#div0",
        "data": {
            "msg": "hello"
        },
        methods: {
            changeValue: function () {
                this.msg = "你好"
            }
        },

        //创建前
        beforeCreate: function () {
            console.log("beforeCreate:vue创建之前……")
            console.log("msg:" + this.msg)
        },

        //创建
        created: function () {
            console.log("created:vue创建之后……")
            console.log("msg:" + this.msg)
        },


        //装载前
        beforeMount: function () {
            console.log("beforeMount:数据装载之前……")
            console.log("msg:" + document.getElementById("span").innerText)
        },

        //装载
        mounted: function () {
            console.log("mounted:数据装载之后……")
            console.log("msg:" + document.getElementById("span").innerText)
        },

        //更新前
        beforeUpdate: function () {
            console.log("beforeUpdate:数据更新之前……")
            console.log("msg:" + this.msg)
            console.log("span:" + document.getElementById("span").innerText)
        },

        //更新
        updated: function () {
            console.log("updated:数据更新之后……")
            console.log("msg:" + this.msg)
            console.log("span:" + document.getElementById("span").innerText)
        }
    });
}
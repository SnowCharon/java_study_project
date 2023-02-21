window.onload = function () {
    let app = new Vue({
        "el": "#div0",
        data: {
            fruitList: [
                {fname: "苹果", price: 18, fcuont: 20, remark: "好吃"},
                {fname: "香蕉", price: 5, fcuont: 80, remark: "吵好吃"},
                {fname: "猕猴桃", price: 8, fcuont: 90, remark: "好吃"},
                {fname: "桃子", price: 6, fcuont: 50, remark: "好吃"},
                {fname: "橘子", price: 8, fcuont: 29, remark: "好吃"}
            ]
        }
    });
}
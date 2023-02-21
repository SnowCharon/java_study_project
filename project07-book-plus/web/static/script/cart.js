window.onload = function () {
    let vue = new Vue({
        el: "#cart_div",
        data: {
            cart: {}
        },
        methods: {
            getCart: function () {
                axios({
                    method: "POST",
                    url: "cart.do",
                    params: {
                        operate: 'cartInfo'
                    }
                })
                    .then(function (value) {
                        vue.cart = value.data;
                    })
                    .catch(function (reason) {
                        console.log(reason)
                    });
            },
            editCart: function (cartItemId, buyCount) {
                axios({
                    method: "POST",
                    url: "cart.do",
                    params: {
                        operate: 'editCart',
                        cartItemId: cartItemId,
                        buyCount: buyCount
                    }
                })
                    .then(function (value) {
                        vue.getCart();
                    })
                    .catch(function (reason) {
                        console.log(reason)
                    })
            }
        },
        mounted: function () {
            this.getCart();
        }
    });
}
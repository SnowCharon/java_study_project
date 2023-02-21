window.onload = function () {
    let app = new Vue({
        "el": "#div0",
        data: {
            "firstName": "jim",
            "lastName": "green",
            "fullName": "jim green"
        },
        watch: {
            "firstName": function (inputValue) {
                this.fullName = inputValue + " " + this.lastName;
            },
            "lastName": function (inputValue) {
                this.fullName = this.firstName + " " + inputValue;
            }
        }
    });
}
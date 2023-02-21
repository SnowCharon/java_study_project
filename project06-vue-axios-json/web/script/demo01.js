/*let person = new Object();
person.pid="001";
person.pname="mike";
person.sayHello=function (){
    alert("Hello World!");
}
*/

let person = {
    "pid": "001",
    "pname": "mike",
    "sayHello": function () {
        alert("Hello World!")
    }
};

function hello() {
    person.sayHello();
}


window.onload = function () {
    let vue = new Vue({});
}
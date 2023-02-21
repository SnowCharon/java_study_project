window.onload = function () {
    let vue = new Vue({
        "el": "#appTable",
        "data": {
            "employeeList": [{
                "empId": 1,
                "empName": "tom",
                "empAge": 11,
                "empSubject": "java"
            },
                {
                    "empId": 2,
                    "empName": "jerry",
                    "empAge": 22,
                    "empSubject": "php"
                },
                {
                    "empId": 3,
                    "empName": "peter",
                    "empAge": 33,
                    "empSubject": "python"
                }
            ]
        }
    });

    let appDiv = new Vue({
        "el": "#appDiv",
        "data": {
            // 初始值设置空字符串即可
            "empId": "",
            "empName": "",
            "empAge": "",
            "empSubject": ""
        },
        methods: {
            addRecord: function () {
                // 确认单击事件是否绑定成功
                console.log("我点击了那个按钮……");

                // 确认是否能够正确收集到文本框数据
                console.log(this.empId);
                console.log(this.empName);
                console.log(this.empAge);
                console.log(this.empSubject);

                // 将收集到的文本框数据封装为一个对象
                let employee = {
                    "empId": this.empId,
                    "empName": this.empName,
                    "empAge": this.empAge,
                    "empSubject": this.empSubject
                };

                // 将上面的对象压入表格数据的employeeList数组
                vue.employeeList.push(employee);
            }
        }
    });
}
//1.为表单绑定提交事件
document.getElementById("register").onsubmit = function () {
    //2.获取填写的用户名和密码
    const userName = document.getElementById("userName").value;

    //3.判断用户名和密码是否符合规则：1~7位汉字
    const name = /^[\u4e00-\u9fa5]{1,7}$/;
    if (!name.test(userName)) {
        alert("用户名必须由汉字组成，且长度在1-7之间！")
        return false;
    }

    //4.判断密码是否符合规则  6~18位英文大小写，下划线或者数字
    const userPassword = document.getElementById("userPassword").value;
    const password = /^[a-zA-Z0-9_-]{6,18}$/;
    if (!password.test(userPassword)) {
        alert("为了确保安全，密码长度须在6-16位间！")
        return false;
    }
    //5.如果所有条件都满足，则提交表单
    $("myForm").action = "index.html";
    alert('登录成功！即将以该用户的身份进入拾遗首页');
    $("myForm").submit();
}



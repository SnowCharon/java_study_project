function $(id) {
    return document.getElementById(id);
}

function resetForm() {
    $("validate").innerHTML = "";
    $("form").reset();


}

function checkForm() {
    let userName = $("userName").value;
    if (isEmpty(userName)) {
        $("validate").innerHTML = "用户名不能为空！";
        alert("用户名不能为空！");
        return;
    }
    if (userName.length < 3 || userName.length > 10) {
        $("validate").innerHTML = "用户名长度须在3-10位间！";
        alert("用户名长度须在3-10位间！");
        return;
    }
    $("validate").innerHTML = "";
    let userPassword = $("userPassword").value;
    if (isEmpty(userPassword)) {
        $("validate").innerHTML = "密码不能为空！";
        alert("密码不能为空！");
        return;
    }
    if (userPassword.length < 6 || userPassword.length > 16) {
        $("validate").innerHTML = "为了确保安全，密码长度须在6-16位间！";
        alert("为了确保安全，密码长度须在6-16位间！");
        return;
    }
    if (userPassword.indexOf(userName) > -1) {
        $("validate").innerHTML = "密码不能包含用户名";
        alert("密码不能包含用户名");
        return;
    }
    $("validate").innerHTML = "";
//   $("myform").action="http://127.0.0.1:5500/%E6%9C%9F%E6%9C%AB%E4%BD%9C%E4%B8%9A/index.html";
    $("myForm").action = "index.html";
    alert('登录成功！即将以该用户的身份进入拾遗首页');
    $("myForm").submit();
}

function isEmpty(str) {
    return str == null || str.trim() === "";
}
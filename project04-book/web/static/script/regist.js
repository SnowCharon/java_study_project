function $(id) {
    return document.getElementById(id);
}

function preRegist() {
    //用户名不能为空，而且是6~16位汉字、数字和字母组成
    const unameReg = /^[\u4E00-\u9FA5A-Za-z0-9]{6,16}/;
    const unameTxt = $("unameTxt");
    const uname = unameTxt.value;
    const unameSpan = $("unameSpan");
    if (!unameReg.test(uname)) {
        unameSpan.style.visibility = "visible";
        return false;
    } else {
        unameSpan.style.visibility = "hidden";
    }

    //密码的长度至少为6位
    const pwdTxt = $("pwdTxt");
    const pwd = pwdTxt.value;
    const pwdReg = /\w{6,}/; // /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,}$/;
    const pwdSpan = $("pwdSpan");
    if (!pwdReg.test(pwd)) {
        pwdSpan.style.visibility = "visible";
        return false;
    } else {
        pwdSpan.style.visibility = "hidden";
    }

    //密码两次输入不一致
    const pwd2 = $("pwdTxt2").value;
    const pwdSpan2 = $("pwdSpan2");
    if (pwd2 !== pwd) {
        pwdSpan2.style.visibility = "visible";
        return false;
    } else {
        pwdSpan2.style.visibility = "hidden";
    }

    //请输入正确的邮箱格式
    const email = $("emailTxt").value;
    const emailSpan = $("emailSpan");
    const emailReg = /^[a-zA-Z0-9_\.-]+@([a-zA-Z0-9-]+[\.]{1})+[a-zA-Z]+$/;
    if (!emailReg.test(email)) {
        emailSpan.style.visibility = "visible";
        return false;
    } else {
        emailSpan.style.visibility = "hidden";
    }

    return true;
}

//如果想要发送异步请求，我们需要一个关键的对象 XMLHttpRequest
let xmlHttpRequest;

function createXMLHttpRequest() {
    if (window.XMLHttpRequest) {
        //符合DOM2标准的浏览器 ，xmlHttpRequest的创建方式
        xmlHttpRequest = new XMLHttpRequest();
    } else if (window.ActiveXObject) {//IE浏览器
        try {
            xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
        } catch (e) {
            xmlHttpRequest = new ActiveXObject("Msxml2.XMLHTTP")
        }
    }
}

function checkUname(uname) {
    createXMLHttpRequest();
    let url = "user.do?operate=checkUname&uname=" + uname;
    xmlHttpRequest.open("POST", url, true);
    //设置回调函数
    xmlHttpRequest.onreadystatechange = checkUnameCB;
    //发送请求
    xmlHttpRequest.send();
}

function checkUnameCB() {
    if (xmlHttpRequest.readyState === 4 && xmlHttpRequest.status === 200) {
        //xmlHttpRequest.responseText 表示服务器端的响应文本内容
        //  alert(xmlHttpRequest.responseText);
        let responseText = xmlHttpRequest.responseText;
        //{'uname':'1'}
        alert(responseText);
        if (responseText === "{'uname':'1'}") {
            alert("用户名已经被注册！");
        } else {
            alert("用户名可以注册！");
        }
    }
}


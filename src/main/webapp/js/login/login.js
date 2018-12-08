
/**
 *表单校验
 */
function login_check() {
	var username = document.getElementById("username");
	var passwd = document.getElementById("passwd");
	if (username == '' || username == null) {
		alert("用户名不能空！");
		username.focus();
		return false;
	}
	return true;
}

/**
 *校验表单方式2
 */
function login_check2(form) {
	if(form.username.value==""||form.username.value==null){
		alert("请输入用户登陆名！");
		form.username.focus();
		return false;
	}
	if(form.passwd.value==""||form.passwd.value==null){
		alert("请输入密码！");
		form.passwd.focus();
		return false;
	}
	return true;
}

/**
 *校验值是否为空
 * @param {Object} field
 * @param {Object} alerttxt
 */
function validate_required(field, alerttxt) {
	with (field) {
		if (value == null || value == "") {
			alert(alerttxt);
			return false;
		} else {
			return true;
		}
	}
}

/**
 *校验表单
 * @param {Object} thisform
 */
function validate_form(thisform) {
	with (thisform) {
		if (validate_required(email, "Email must be filled out!") == false) {
			email.focus();
			return false;
		}
	}
}
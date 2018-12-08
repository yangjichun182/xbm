

document.write("<script language=javascript src='../../js/jquery/jquery.js'></script>");

/**
 *JavaScript带有换行的弹出框【消息框】
 */
function disp_alert() {
	alert("Hello again! This is how we" + '\n' + "add line breaks to an alert box!");
}

/**
 *消息确认框
 */
function disp_confirm() {
	var r = confirm("Press a button");
	if (r == true) {
		document.write("You pressed OK!");
	} else {
		document.write("You pressed Cancel!");
	}
}

/**
 *消息提示框
 */
function disp_prompt() {
	var name = prompt("Please enter your name", "Harry Potter");
	if (name != null && name != "") {
		document.write("Hello " + name + "! How are you today?");
	}
}

/**
 * 检查浏览器版本
 */
function check_browser() {
	var browser = navigator.appName;
	var b_version = navigator.appVersion;
	var version = parseFloat(b_version);
	document.write("Browser name: " + browser);
	document.write("<br />");
	document.write("Browser version: " + version);

}

function check_all() {
	document.write("<p>Browser: ");
	document.write(navigator.appName + "</p>");
	document.write("<p>Browserversion: ");
	document.write(navigator.appVersion + "</p>");

	document.write("<p>Code: ");
	document.write(navigator.appCodeName + "</p>");

	document.write("<p>Platform: ");
	document.write(navigator.platform + "</p>");

	document.write("<p>Cookies enabled: ");
	document.write(navigator.cookieEnabled + "</p>");

	document.write("<p>Browser's user agent header: ");
	document.write(navigator.userAgent + "</p>");

}

/**
 * 点击所有的p标签消失
 */
$(document).ready(function() {
	$("p").click(function() {
		$(this).hide();
	});
});


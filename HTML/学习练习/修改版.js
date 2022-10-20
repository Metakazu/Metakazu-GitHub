$(function () {
	$;
});

function clearvalue() {
	var allvalues = document.getElementsByName('user');
	var ptest = document.getElementById('ptest');
	for (var i = 0; i < allvalues.length; i++) {
		allvalues[i].value = null;
	}
	ptest.innerHTML = '';
}

function check() {
	// 先检查用户名
	var userId = document.getElementById('userId').value;
	var ptest = document.getElementById('ptest');
	if (userId == ' ' || userId == null || userId == '') {
		// alert('用户名不能为空!请重新输入');
		ptest.innerHTML = '<small>🤔 用户名不能为空!请重新输入</small>';
		return;
	}
	//再检查密码1是否合格
	var password1 = document.getElementById('password').value;
	if (password1 == ' ' || password1 == null || password1 == '') {
		// alert('密码不能为空!请重新输入');
		ptest.innerHTML = '<small>🤔 密码不能为空!请重新输入</small>';
		return;
	} else if (password1.length < 6) {
		// alert('输入的密码不可小于六位');
		ptest.innerHTML = '<small>🤔 输入的密码不可小于六位</small>';
		return;
	} else if (password1.length > 20) {
		// alert('输入的密码不可超过20位');
		ptest.innerHTML = '<small>🤔 输入的密码不可超过20位</small>';
		return;
	}

	//再检查密码2是否合格
	var password2 = document.getElementById('password2').value;
	if (password2 == ' ' || password2 == null || password2 == '') {
		// alert('确认密码不能为空!请重新输入');
		ptest.innerHTML = '<small>🤔 确认密码不能为空!请重新输入</small>';
		return;
	} else if (password1 != password2) {
		// alert('两次密码不一致，请重新输入');
		ptest.innerHTML = '<small>🤔 两次密码不一致，请重新输入</small>';
		return;
	} else {
		// alert('登录成功！');
		ptest.innerHTML = '<small>🤗 登录成功！正在跳转页面...</small>';
		ptest.className = 'ok';
		setTimeout(
			(window.location =
				'file:///Users/kazumeta/Desktop/HTML/瑜伽呼吸/breathe.html'),
			2000
		);
	}
}

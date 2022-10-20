function allclear(value) {
	// getElementById() 方法可返回对拥有指定 ID 的第一个对象的引用。必须。元素ID属性值。
	// .value与.innerHTML的区别在于，这个id元素中的内容是如何表示出来的.
	// 如果是通过value表示出来的，我们则通过.value获取id元素中的内容，
	// 那如果id元素中没有value值要如何获取id元素中的内容呢？这个时候就用到我们的innerHTML了。
	//清零
	document.getElementById('result').value = '';
}

function display(value) {
	//字符串叠加
	document.getElementById('result').value += value;
}

function sum12(value) {
	var num = document.getElementById('result').value;
	// switch (value) {
	// 	case '+':
	// 		break;
	// 	case '-':
	// 		break;
	// 	case '*':
	// 		break;
	// 	case '/':
	// 		break;
	// }
	// 求和
	// eval() 函数计算 JavaScript 字符串，并把它作为脚本代码来执行。
	// eval("x=10;y=20;document.write(x*y)");
	// document.write("<br>" + eval("2+2"));
	// document.write("<br>" + eval(x+17));
	let sths = eval(num);
	document.getElementById('result').value = sths;
}

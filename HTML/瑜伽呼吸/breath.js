const box = document.getElementById('bos');
const text = document.getElementById('text');

const totleTime = 8000;
const breatheTime = (totleTime / 5) * 2;
const holdTime = totleTime / 5;

breathAction();

function breathAction() {
	text.innerText = '吸 气！';
	box.className = 'Box充气中...';

	setTimeout(() => {
		text.innerText = 'Hold';

		setTimeout(() => {
			text.innerText = '吐 气 🐰';
			box.className = 'Box换气中...';
		}, holdTime);
	}, breatheTime);
}

function getnow() {
	var now = new Date();

	//var hour = now.getHours();
	//if (hour < 10) {
	//    hour = "0" + hour;
	// }

	var minute = now.getMinutes();
	if (minute < 10) {
		minute = '0' + minute;
	}
	var second = now.getSeconds();
	if (second < 10) {
		second = '0' + second;
	}
	//var nowstr = hour + ":" + minute + ":" + second;
	//var nowstr = hour + ":" + minute;
	var nowstr = minute + ':' + second;

	var nowspan = document.getElementById('nowspan');

	nowspan.innerHTML = nowstr;

	setTimeout(getnow, 1000);
}

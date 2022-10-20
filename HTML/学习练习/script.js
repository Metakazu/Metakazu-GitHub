function test() {
    // var result = confirm;
    // if (result) {
    //     alert("OK");
    // } else {
    //     alert("NG")
    // }
    var result = prompt('请输入文字列', '测试');
    if (result) {
        alert("OK");
    } else {
        alert("cancle");
        // 有值输入 会返回 ok 没有值输入 则返回cancle
    }
    // javascript 变量
    var vartest = '默认值OK';
    vartest = '再代入';

    let lettest = '默认值OK';
    lettest = '再代入';

    const consttest = '默认值OK';
    // consttest = '再代入NG';
    var date = 3;
    var date = false;
}

$(function() {
	
	$("#nameCheck").click(function() {
		//Ajax通信技術
		$.ajax({
			//HTTPメソッド
			type: "POST",
			//データの送信先
			url: "nama",
			//送信するデータ
			data: {
				//""为传来的类的对应属性
				"sid": $("#sid").val(),
				"password": $("#password").val()
			},
			//送信するデータの型、種類
			contentType: "application/x-www-form-urlencoded;charset=UTF-8",
			//レスポンスの型、種類
			dataType: "json"
		})
			.done(function(map) {

				$("#loginMsg").html(map.msg);

			});
	})

	$('#dpname').change(function() {
		var dpname = $('#dpname option:selected').val();
		$.ajax({
			url: '/selectAllMajor',
			data: {
				//数据库中dpid这里对应的是前台传过来的var dpname.val
				"dpid": dpname
			},
			dataType: 'json',
			type: 'post',
			//在调试过程中发现
			//success function函数中添加的应该是optionJson[i].mname
			//而不是optionJson[i]
			success: function(obj) {
				//alert(obj[0].mname);
				console.log(obj);
				// $("#mname").empty();
				var selectObj = document.getElementById("mname");
				selectObj.innerHTML = "";
				selectObj.options.length = 0;
				selectObj.options.add(new Option("専攻を選択してください", 0));
				for (var i = 0; i < obj.length; i++) {
					selectObj.add(new Option(obj[i].mname, obj[i].mid));
					// $("#mname").append("<option value='" + obj[i].mid + "'>" + obj[i].mname + "</option>")
				}
			}
		});
	});


	$('#mname').change(function() {
		var mname = $('#mname option:selected').val();

		$.ajax({
			url: '/selectAllMajor2',
			data: {
				"mid": mname
			},
			dataType: 'json',
			type: 'post',
			success: function(obj) {
				console.log(obj);
				$("#cinfo").empty();
				$("#cinfo").append("<tr>" + "<th> 科目ID </th>" +
					"<th>科目名称</th>" +
					"<th>区分 </th>" +
					"<th>単位数 </th>" +
					"<th>上限人数</th>" +
					"<th>選択人数</th>" +
					"<th>選択欄</th>" + "</tr>");

				for (var i = 0; i < obj.length; i++) {
					$("#cinfo").append("<tr>" + "<td>" + obj[i].cid + "</td>" +
						"<td>" + "<a href='/selectOneCourse?cid=" + obj[i].cid + "'>" + obj[i].cname + "</a>" + "</td>" +
						"<td>" + obj[i].ctype + "</td>" +
						"<td>" + obj[i].credit + "</td>" +
						"<td>" + obj[i].std_max + "</td>" +
						"<td>" + obj[i].std + "</td>" +
						"<td>" + "<input type='checkbox' name='cid' value='" + obj[i].cid + "'>" + "</td>" + "</tr>");
				}
			}
		});
	});

	//科目検索用ajax

	$('#main_submit').click(function() {
		$.ajax({
			url: '/mainSelectAllCourse',
			data: $('#main_form').serialize(),
			dataType: 'json',
			type: 'post',
			success: function(obj) {
				console.log(obj);
				$("#main_msg").empty();
				$("#mianSelection").empty();
				$("#mianSelection").append("<tr>" + "<th> 学科名 </th>" +
					"<th>専攻名</th>" +
					"<th>科目ID </th>" +
					"<th>科目名称 </th>" +
					"<th>区分</th>" +
					"<th>選択人数</th>" +
					"<th>曜日</th>" +
					"<th>時限</th>" +
					"<th>詳細</th>" + "</tr>");

				if (obj != null && obj.length != 0) {
					for (var i = 0; i < obj.length; i++) {
						$("#mianSelection").append("<tr>" + "<td>" + obj[i].dpname + "</td>" +
							"<td>" + obj[i].mname + "</td>" +
							"<td>" + obj[i].cid + "</td>" +
							"<td>" + obj[i].cname + "</a>" + "</td>" +
							"<td>" + obj[i].ctype + "</td>" +
							"<td>" + obj[i].std + "</td>" +
							"<td>" + obj[i].weekday + "</td>" +
							"<td>" + obj[i].ctime + "</td>" +
							"<td>" + "<a href='/selectOneCourse?cid=" + obj[i].cid + "'>詳細</a>" + "</td>" + "</tr>");
					}
				} else {
					$("#main_msg").html("該当する授業がみつかりませんでした！");
				}
			}
		});
	});
	 
	 
})


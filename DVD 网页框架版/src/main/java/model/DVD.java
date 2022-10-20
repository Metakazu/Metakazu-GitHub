package model;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DVD {
	// 序号
	private int id;
	// 名称
	private String name;
	// 状态
	private int state;
	// 借出日期
	private Date date;
	// 借出次数
	private int count;
	// 删除FLAG
	private int deleteFlag;
	
	

	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");

		String state = this.state == 0 ? "已借出" : "可借";
		String name = this.name != null ? "《" + this.name + "》" : "";
		String date = this.date != null ? sdf.format(this.date) : "";
		String count = this.count != 0 ? this.count + "次" : "";

		return id + "\t" + state + "\t" + name + "\t" + date + "\t" + count;
	}
}

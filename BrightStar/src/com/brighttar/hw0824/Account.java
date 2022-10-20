package com.brighttar.hw0824;

//等价值判定方法的指定
//等值【==】：同一个存在
//等价【equals】：同一个内容

//利用。equals的重写里来判定

public class Account {

	private String accountNumber;
	private int balance;

	public static void main(String[] args) {
		//	①口座番号4669、残高1592円のAccountインスタンスを変数aに生成し、「System.out.println(a);」を実行すると、

		Account a = new Account();
		a.accountNumber = "4669";
		a.balance = 1592;
		System.out.println(a);

		Account b = new Account();
		b.accountNumber = " 4669";
		b.balance = 1592;
		System.out.println(b);

		System.out.println(a.equals(b));

	}

	//	②口座番号が等しければ等価と判断される。ただし、「 4669」など、口座番号の先頭に半角スペースが付けられた場合でも、それを無視して比較できる。
	//	（「 4669」口座と「4669」口座は同じものと捉える）
	// 重写了Object类的equals()
	// 1.先比较地址
	// 2.再比较数据类型
	// 3.最后比较属性
	public boolean equals(Object c) {
		// 判断当前对象和anObject地址是否相同
		if (this == c) {
			return true;
		}
		// 判断c是否是Account类型
		if (c instanceof Account) {
			//  把Object类型的对象强转成Account类型
			Account a = (Account) c;
			// 自定义的比较内容
			//.trim()是忽略内容的首尾空格部分
			if (this.accountNumber.trim().equals(a.getAccountNumber().trim())
					&& this.balance == a.getBalance()) {
				return true;
			}
		}
		return false;
	}

	public Account() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Account(String accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public String toString() {
		//		　 画面に「\1592（口座番号：4669）」と表示される。
		//return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
		return "¥" + balance + "（口座番号：" + accountNumber + ")";
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

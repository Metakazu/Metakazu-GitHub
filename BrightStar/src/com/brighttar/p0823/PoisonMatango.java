package com.brighttar.p0823;

public class PoisonMatango extends Matango {
	//	int hp = 50;
	//	char suffix;
	//PoisonMatangoは、
	//毒を用いた攻撃が可能な残り回数をint型フィールドとして持っており、初期値は5である。
	int Poison = 1;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	@Override
	public void attack(Hero h) {
		// 调用父类的方法
		for (int i = Poison; i >= 0; i--) {
			if (i > 0) {
				super.attack(h);
				System.out.println("警報！進化毒キノコ" + this.suffix + "の侵入攻撃開始！");
				double damage = h.getHp() * 0.2;
				if (i > 0) {
					System.out.println("さらに毒の胞子をばらまいた！");
					//使得hp的最大值为当前hp的值
					h.setHp(h.getHp() * 0.8);
					System.out.println(damage + "ポイントのダメージをあたえた！");
					h.states();
				}
			} else {
				super.attack(h);
				System.out.println("毒の胞子使い切っちゃ＞＜");
				System.out.println("攻撃無効");
			}
		}

	}

}

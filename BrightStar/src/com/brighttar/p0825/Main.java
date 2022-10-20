package com.brighttar.p0825;

public class Main {
	public static void main(String[] args) {
		Monster[] monsters = new Monster[3];
		monsters[0] = new Goblin();
		monsters[1] = new Slime();
		monsters[2] = new DeathBat();

		for (int m = 0; m < monsters.length; m++) {
			monsters[m].run();
			System.out.println("--------");
		}

		
		
		//增强for循环
		for (Monster M : monsters) {
			M.run();
		}

	}
}

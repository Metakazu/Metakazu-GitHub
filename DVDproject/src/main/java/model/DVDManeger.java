package model;



import java.util.List;
import java.util.Scanner;

public class DVDManeger {
	// 菜单功能
	public void menu() {
		System.out.println("欢迎使用DVD管理器");
		System.out.println("---------------------");
		System.out.println("1.新增DVD");
		System.out.println("2.查看DVD");
		System.out.println("3.删除DVD");
		System.out.println("4.借出DVD");
		System.out.println("5.归还DVD");
		System.out.println("6.退出DVD");
		System.out.println("---------------------");
		System.out.println("请选择");

		int option = new java.util.Scanner(System.in).nextInt();

		switch (option) {
		case 1:
			insertDVD();
			break;
		case 2:
			selectDVD();
			break;
		case 3:
			deleteDVD();
			break;
		case 4:
			lendDVD();
			break;
		case 5:
			returnDVD();
			break;
		case 6:
			System.exit(0);
			break;
		}
	}

	// 新增DVD功能
	private void insertDVD() {
		System.out.println("---→新增DVD");
		System.out.println("请输入DVD名字：");
		String dvdName = new java.util.Scanner(System.in).nextLine();

		// 判断输入的DVD名字是否为空
		if (dvdName != null && !"".equals(dvdName)) {
			DVDDao.addDVD(dvdName);
			System.out.println("成功新增DVD《" + dvdName + "》");
		} else {
			DVDDao.addDVD(dvdName);
			System.out.println("输入的DVD名字为空，无法新增！");
		}
		returnMenu();
	}

	// 查看DVD功能
	private void selectDVD() {
		System.out.println("---→查看DVD");
		System.out.println("序号\t状态\t名称\t借出日期\t借出次数");

		List<DVD> dvds = DVDDao.viewDVD();
		//		for (DVD dvd : dvds) {
		//			System.out.println(dvd);
		//		}

		returnMenu();
	}

	// 删除DVD功能
	private void deleteDVD() {
		System.out.println("---→删除DVD");
		System.out.println("请输入删除的DVD序号：");
		int id = new java.util.Scanner(System.in).nextInt();

		DVD dvd = DVDDao.selectDVDById(id);

		if (dvd.getName() == null) {
			System.out.println("输入的号码范围不正，请重新输入!");
		} else {
			if (1 == dvd.getDeleteFlag()) {
				System.out.println("输入的序号的DVD已被删除，请重新输入");
			} else if (0 == dvd.getState()) {
				System.out.println("输入的序号的DVD已被借出，请重新输入");
			} else {
				DVDDao.deleteDVD(id);
				System.out.println("成功删除DVD《" + dvd.getName() + "》");
			}
		}
		returnMenu();
	}

	// 借出DVD功能
	private void lendDVD() {
		System.out.println("---→借出DVD");
		System.out.println("请输入借出的DVD序号：");
		int id = new java.util.Scanner(System.in).nextInt();
		DVD dvd = DVDDao.selectDVDById(id);

		if (dvd.getName() == null) {
			System.out.println("输入的号码范围不正，请重新输入!");
		} else {
			if (1 == dvd.getDeleteFlag()) {
				System.out.println("输入序号的DVD不存在，请重新输入");
			} else if (0 == dvd.getState()) {
				System.out.println("输入的序号的DVD已被借出，请重新输入");
			} else {
				DVDDao.lendDVD(id);
				System.out.println("成功借出DVD《" + dvd.getName() + "》");
			}
		}
		returnMenu();
	}

	// 归还DVD功能
	private void returnDVD() {
		System.out.println("---→归还DVD");
		System.out.println("请输入归还的DVD序号：");
		int id = new java.util.Scanner(System.in).nextInt();
		DVD dvd = DVDDao.selectDVDById(id);

		if (dvd.getName() == null) {
			System.out.println("输入的序号范围不正，请重新输入!");
		} else {
			if (1 == dvd.getDeleteFlag()) {
				System.out.println("输入序号的DVD不存在，请重新输入");
			} else if (1 == dvd.getState()) {
				System.out.println("输入的序号的DVD未被借出，请重新输入");
			} else {
				DVDDao.returnDVD(id);
				DVD dvdcost = DVDDao.cost(id);
				System.out.println("花费金额" + dvdcost.getCost() + "元");
				System.out.println("成功归还DVD《" + dvd.getName() + "》");
			}
		}
		returnMenu();
	}

	// 返回功能
	private void returnMenu() {
		System.out.println("输入0返回：");
		int input = new Scanner(System.in).nextInt();

		if (input == 0) {
			menu();
		} else {
			System.out.println("输入有误，请重新输入！");
			returnMenu();
		}
	}
}
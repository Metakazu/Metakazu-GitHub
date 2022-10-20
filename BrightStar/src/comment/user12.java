package comment;

//复杂方法 不可取
public class user12 {
	public static void main(String[] args) {
		System.out.println("请下第一枚棋子");
		int num = new java.util.Scanner(System.in).nextInt();
		int turnnum = scaner(num);
	}

	public static int scaner(int turnnum) {
		int num = 0;

		for (int x = 0; x < 5; x++) {
			if (turnnum != num) {
				System.out.println(num);
			} else {
				System.out.println("请下第二枚棋子");
				int num2 = new java.util.Scanner(System.in).nextInt();
				int turnnum2 = scaner(num2);
			}
		}
		return num;
	}

}

package com.brighttar.p0815$19;

public class practice0815 {
	//class文件名必须要大写英文字母。program名字的做成规范：提倡和自己的程序内容相近的名字。各个现场有不同的规范。
	/**
	 * 文本注释
	 * @param args
	 * */
	public static void main(String[] args) {
		//Loacal变量未被使用，左侧状态栏会有黄色注意符号表示，表意为：创建了一个电脑磁盘空间，并给与付意，但却未使用。
		int version;//定义变量，并进行命名。
		int helloWorld;//定义一个负数单词的名称，第二个或第三个单词的首字母大写：驼峰式命名。
		int hello_world;//定义一个负数单词的名称，用下划线断开单词：蛇型命名。
		version = 5 + 1;
		System.out.println("Verは:" + version);
		//写程序的时候，程序括号问题，为了能够让正反括号能够正确指向，程序的书写我们提倡：从外向内书写，而不是从上向下。

		byte glasses;
		glasses = 2;
		short age;
		age = 15;
		int salary;
		salary = 23900234;
		long population;
		population = 129892839218309L;
		float weight;
		weight = 6.5F;
		double height;
		height = 186.5;
		boolean result;
		result = false;
		char 汉字;
		汉字 = '米';//使用单引号表示。
		String name;
		name = "やじま";//使用双引号表示文字
		final double pi = 3.1415926;
		System.out.println("hello \t world"); //\t:缩进 单词之间有间隔。反斜线=\
		System.out.println("\"\"");
		int apple = 10;
		apple += 2;//相当于重新定义apple
		System.out.println(apple);

		int a = 20;
		int b = a + 5;
		for (double i = b + age + 0.4 * 2 / 8; i < height + 1; i++) {
			System.out.println("Distance." + i + 汉字);
		}
		int i = 5;
		int s = (i++) + (i++); //占用资源
		int d = 5;
		int t = (++d) + (++d); //效率更高
		System.out.println(s); //11
		System.out.println(t); //13

	}

}

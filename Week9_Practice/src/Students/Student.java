package Students;

public class Student {

	// 私有變數「name」，存學生姓名
	private String name = "";

	// Student 的建構子
	// 要求傳入字串「name」， 創建同時設定私有變數「name」
	public Student(String name) {
		this.name = name;
	}

	// 取得私有變數「name」
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		String.valueOf(3);
		return String.format("%-5s", name);
	}

}

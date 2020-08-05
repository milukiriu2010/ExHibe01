package milu.kiriu2010.exhibe01.main;

// https://www.techscore.com/tech/Java/Others/Hibernate/03/
// データをロードするサンプル
public class ExHibe02 {
	public static void main(String[] args) {
		Book book = new BookDao().load("ISBN4-7561-4340-7");
		System.out.println(book);
	}

}

package milu.kiriu2010.exhibe01.main;

import java.util.List;

// データを全取得するサンプル
// https://www.techscore.com/tech/Java/Others/Hibernate/03-3/
public class ExHibe03 {

	public static void main(String[] args) {
		BookDao bookDao = new BookDao();
		List<Book> bookList = bookDao.searchAll();
		for (Book book: bookList) {
			System.out.println(book);
		}
	}

}

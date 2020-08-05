package milu.kiriu2010.exhibe01.main;

// データを登録するサンプル
// psql -U milu -d miludb2 -W
// https://www.techscore.com/tech/Java/Others/Hibernate/02/
// http://www.vineetmanohar.com/2009/11/3-ways-to-run-java-main-from-maven/
public class ExHibe01 {

	public static void main(String[] args) {
		BookDao bookDao = new BookDao();
		
		Book book = new Book();
		book.setIsbn("ISBN4-7561-4340-7");
		book.setName("ゼロから始めるJava増補改訂版");
		book.setPrice(1905);
		// Bookクラスのインスタンスを永続化している
		bookDao.save(book);
		
		Book book2 = new Book();
		book2.setIsbn("ISBN4-7561-4383-0");
		book2.setName("ゼロから始めるJSP/サーブレット");
		book2.setPrice(2095);
		// Bookクラスのインスタンスを永続化している
		bookDao.save(book2);

	}

}

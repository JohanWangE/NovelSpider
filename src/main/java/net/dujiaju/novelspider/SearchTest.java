package net.dujiaju.novelspider;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * Created by lilujia on 16/5/4.
 */
public class SearchTest {
	public static void main(String... args) throws IOException {
		
		
		
		
		
		
		
		
		
		String url = "http://www.biquger.com/biquge/9895/";

		
		
		
		
		
		
		
		Document doc = Jsoup.connect(url).get();
		Elements news = doc.select("dl");
		System.out.println(news.html());

	}

}

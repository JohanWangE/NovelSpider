package net.dujiaju.novelspider.spiderrule;

import java.util.List;

import net.dujiaju.novelspider.spiderrule.model.Book;
import net.dujiaju.novelspider.spiderrule.model.Chapter;

public class BiqugerComRule implements Rule {

	@Override
	public String getRuleUrl() {
		return "http://www.biquger.com/";
	}

	@Override
	public String getRuleName() {

		return "新笔趣阁儿";
	}

	@Override
	public int getRuleVersion() {

		return 0;
	}

	@Override
	public Book getBook(String bookName) {

		return null;
	}

	@Override
	public List<Chapter> getChapters(Book book) {

		return null;
	}

}

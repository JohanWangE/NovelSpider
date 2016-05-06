package net.dujiaju.novelspider.spiderrule;

import java.util.List;

import net.dujiaju.novelspider.spiderrule.model.Book;
import net.dujiaju.novelspider.spiderrule.model.Chapter;

public interface Rule {
	public String getRuleUrl();

	public String getRuleName();

	public int getRuleVersion();

	public Book getBook(String bookName);

	public List<Chapter> getChapters(Book book);
}

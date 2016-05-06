package net.dujiaju.novelspider.spiderrule.model;

import java.util.List;

public class Book {
	List<Chapter> mChapterList;
	String mBookName;
	String mBookUrl;
	String mBookSource;

	public List<Chapter> getChapterList() {
		return mChapterList;
	}

	public void setChapterList(List<Chapter> chapterList) {
		mChapterList = chapterList;
	}

	public String getBookName() {
		return mBookName;
	}

	public void setBookName(String bookName) {
		mBookName = bookName;
	}

	public String getBookUrl() {
		return mBookUrl;
	}

	public void setBookUrl(String bookUrl) {
		mBookUrl = bookUrl;
	}

	public String getBookSource() {
		return mBookSource;
	}

	public void setBookSource(String bookSource) {
		mBookSource = bookSource;
	}

}

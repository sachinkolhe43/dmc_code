package p1;

import java.io.Serializable;

public class Quote implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int id;
	private String text;
	private String author;
	private int user_id;
	
	public Quote() {
		super();
	}

	public Quote(int id, String text, String author, int user_id) {
		super();
		this.id = id;
		this.text = text;
		this.author = author;
		this.user_id = user_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Quotes [id=" + id + ", text=" + text + ", author=" + author + ", user_id=" + user_id + "]";
	}
	
	
	
	
	
	

}

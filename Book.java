
public abstract class Book extends Item {
	private String genre;
	
	public Book(String title, String author, String itemId, String genre) {
		super(title, author, itemId);
		this.genre = genre;
	}
	
	@Override
	public void displayInfo1() {
		super.displayinfo1();
		System.out.println("Genre: " + genre);
		
	}
}

abstract class Magazine extends Item {
	private String issueDate;
	
	public Magazine (String title, String author, String itemId, String issueDate) {
		super(title, author, itemId);
		this.issueDate = issueDate;
	}
	
	@Override
	public void displayInfo1() {
		super.displayinfo1();
		System.out.println("IssueDate: " + issueDate);
	}
}
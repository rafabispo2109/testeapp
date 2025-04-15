
public abstract class Item {
	
		private String title;
		private String author;
		private String itemId;
		private boolean isAvailable;
				
		public Item(String title, String author, String itemId) { 
	    	this.title = title;
			this.author = author;
			this.itemId = itemId;
			this.setAvailable(true);
	    }
		public static void main(String[] args) {
		}
	    public void displayinfo1() {
	    	System.out.println("Title; " + title + "Author; " + author + "ID; " + itemId);
	    }
	    
			public boolean isAvailable() {
			return isAvailable;
		}

		public void setAvailable(boolean isAvailable) {
		}
		public void displayInfo1() {
			// TODO Auto-generated method stub
			
		}

	
}


	 class user {
		private String userId;
		private String name; 
					
		public user(String userId, String name) {
			this.setUserId(userId);
			this.setName(name);
			
		}
			
	class Patron extends user {
		public Patron(String userId, String name, int maxBorrowLimit) {
			super(userId, name);
			
		}
	}
		
		public void borrowItem (Item item) {
			
		}
			
	class Librarian extends user {
		private String employeeId;
		
		public Librarian(String userId, String name, String employeeId) {
			super(userId, name);
			this.setEmployeeId(employeeId); 
		}

		public String getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}
	}
			
			// TODO Auto-generated constructor stub
			
		public void addNewItem(Item item) {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
		
	}
	
	


package APITest;

public class singleUser {
	public Data data;
	public Support support;
	public static class Data{
		public int id;
		public String email;
		public String first_name;
		public String last_name;
		public String avatar;
		
		public int getId() {
			return id;
		}
		public String getEmail() {
	
			return email;
		}
		public String getFirst_name() {
		
			return first_name;
		}
		public String getLast_name() {
		
			return last_name;
		}
		public String getAvatar() {
		
			return avatar;
		}
	}

	public class Support{
		public String url;
		public String text;
	}
}


public interface IStorage {
		public void add(students s);
		public void delete(int i); 	// if linear, it will delete at this index 
									//also cater for passing in student to delete them.
		//public void copy(students s);
		//public void update(students s);
		public int size();
	}

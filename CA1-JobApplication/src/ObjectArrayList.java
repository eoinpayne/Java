import java.util.ArrayList;

public class ObjectArrayList implements IStorage{
	IContact message = null;
	
	public ArrayList<Object> list = new ArrayList<Object>();

	public void addObject(Object o) {
		list.add(o);
	}
	public Object get(int i) {
		return list.get(i);
	}
	

	
	public void addIndex(int i) {
		list.add(i);
		}
	public void deleteObject(Object o) {
		list.remove(o);
	}
	public void deleteIndex(int i) {
		list.remove(i);
	}
	public int size() {
		return list.size();
		
	}

	

		

}

import java.util.ArrayList;

public class ObjectArrayList implements IStorage{
	
	public ArrayList<Object> list = new ArrayList<Object>();

	public void addObject(Object o) {
		list.add(o);
	}
	public void get(int i) {
		list.get(i);
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
	public void size() {
		list.size();
	}

	

		

}

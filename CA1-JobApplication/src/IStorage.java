import java.util.Iterator;

public interface IStorage {
	
	public void addObject(Object o);
	public Object get(int i);
	public void addIndex(int i);
	public void deleteObject(Object o);
	public void deleteIndex(int i);
	public int size();
	

}

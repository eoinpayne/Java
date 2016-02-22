import java.util.Iterator;

public interface IStorage {
	
	public void addObject(Object o);
	public void get(int i);
	public void addIndex(int i);
	public void deleteObject(Object o);
	public void deleteIndex(int i);
	public void size();
	

}

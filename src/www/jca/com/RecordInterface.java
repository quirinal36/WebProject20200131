package www.jca.com;

import java.util.List;

public interface RecordInterface <T>{
	public int insert(T input);
	public int update(T input);
	public int delete(T input);
	public T selectOne(int id);
	public List<T> selectList(T input);
	public int count(T input);
}

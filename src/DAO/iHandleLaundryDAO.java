package DAO;

import java.util.*;

public interface iHandleLaundryDAO <T>{
	public List<T> getList();
	public T FindObj(String value);
	public boolean AddObj(T t);
	public boolean Update(T t);
	public boolean Remove(String id);
}

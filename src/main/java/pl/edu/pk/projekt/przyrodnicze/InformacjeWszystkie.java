package pl.edu.pk.projekt.przyrodnicze;

import java.awt.List;
import java.util.ArrayList;


public class InformacjeWszystkie {
	private static ArrayList<List> list = new ArrayList<List>();
	private static int size;
	private static ArrayList <String> name= new ArrayList<String>();
		
	public InformacjeWszystkie(){
		super();
		list = new ArrayList<List>();
		name = new ArrayList<String>();
		}
	public static ArrayList<List> getList() {
		return list;
	}

	public static void addList(List list) {
		InformacjeWszystkie.list.add(list);
	}
	
	public static void removeList(List list){
		InformacjeWszystkie.list.remove(list);
	}
	
	public static void removeName(String name){
		InformacjeWszystkie.name.remove(name);
	}
	public static int getSize() {
		size = list.size();
		return size;
	}
	
	public static ArrayList <String> getName() {
		return name;
	}
	
	public static void addName(String name) {
		InformacjeWszystkie.name.add(name);
	}
	
}
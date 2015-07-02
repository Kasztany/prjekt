package pl.edu.pk.projekt.przyrodnicze;

import java.awt.List;
import java.util.ArrayList;

public class ListRepository implements Container {
	  	public ArrayList<List> lista = InformacjeWszystkie.getList();

	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int index;

	      public boolean hasNext() {
	      
	         if(index < InformacjeWszystkie.getSize()){
	            return true;
	         }
	         return false;
	      }

	      public Object next() {
	      
	         if(this.hasNext()){
	            return lista.toArray()[index++];
	         }
	         return null;
	      }		
	   }
}
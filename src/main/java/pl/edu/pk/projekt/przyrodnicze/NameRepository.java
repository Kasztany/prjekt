package pl.edu.pk.projekt.przyrodnicze;

import java.util.ArrayList;

public class NameRepository implements Container {
	  	public ArrayList<String> lista = InformacjeWszystkie.getName();

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
package pl.edu.pk.projekt.przyrodnicze;

public class Memento {
	   private String state;
	   private Boolean stateB;

	   public Memento(String state){
	      this.state = state;
	   }

	   public String getState(){
	      return state;
	   }
	   
	   public Boolean getStateB(){
		   return stateB;
	   }
}

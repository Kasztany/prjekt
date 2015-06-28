package pl.edu.pk.projekt.przyrodnicze;


public class Originator {
		private String state;
		private Boolean stateB;
	   
	   public void setState(String state){
	      this.state = state;
	   }
	   
	   public void setStateB(Boolean stateB){
		   this.stateB = stateB;
	   }

	   public String getState(){
	      return state;
	   }
	   
	   public Boolean getStateB(){
		      return stateB;
		   }

	   public Memento saveStateToMemento(){
	      return new Memento(state);
	   }

	   public void getStateFromMemento(Memento Memento){
	      state = Memento.getState();
	   }
}

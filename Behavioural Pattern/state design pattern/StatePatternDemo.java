interface State {
   public void doReview(Context context);
}

 class StartState implements State {

   public void doReview(Context context) {
      System.out.println("Customer is reviewing");
      context.setState(this);	
   }

   public String toString(){
      return "The place is wonderfull in first view";
   }
}

 class StopState implements State {

   public void doReview(Context context) {
      System.out.println("Customer reviewed");
      context.setState(this);	
   }

   public String toString(){
      return "The best experience , Kerela is gods own land";
   }
}

 class Context {
   private State state;

   public Context(){
      state = null;
   }

   public void setState(State state){
      this.state = state;		
   }

   public State getState(){
      return state;
   }
}

public class StatePatternDemo {
   public static void main(String[] args) {
      Context context = new Context();

      StartState startState = new StartState();
      startState.doReview(context);

      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doReview(context);

      System.out.println(context.getState().toString());
   }
}
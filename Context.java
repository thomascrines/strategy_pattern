public class Context {
  private Strategy strategy;

public Context(Strategy strategy) {
  this.strategy = strategy;
}

public void defineAppetite(int date){
  this.strategy.defineAppetite(date);
}
}
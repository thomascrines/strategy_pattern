public class Main {
  public static void main(String args[]){
    Werewolf werewolf = new Werewolf();
    NormalForm normalform = new NormalForm();

    Context fullMoon = new Context(werewolf);
    Context anyOtherPhaseOfTheMoon = new Context(normalform);

    fullMoon.defineAppetite();
    anyOtherPhaseOfTheMoon.defineAppetite();
  }
}
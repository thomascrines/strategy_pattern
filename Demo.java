public class Main {
  public static void main(String args[]){
    Werewolf werewolf = new Werewolf();
    NormalForm normalform = new NormalForm();

    Context context1 = new Context(werewolf);
    Context context2 = new Context(normalform);

    context1.defineAppetite(31);
    context2.defineAppetite(31);
  }
}
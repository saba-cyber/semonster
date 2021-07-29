public class Main {
  public static void main(String[] args) {
    System.out.println("SEMONSTER!");
    Monster monster = new Monster();
    Player player = new Player();
    player.showDeck();
    System.out.println(monster.toString());

  }
}

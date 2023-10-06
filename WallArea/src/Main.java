public class Main {
    public static void main(String[] args) {
        Wall mywall = new Wall();
        Wall mynewwall = new Wall(22, 45);
        System.out.println("W : " + mywall.getHeight() + " H: " + mywall.getWidth());
        System.out.println("W : " + mynewwall.getHeight() + " H: " + mynewwall.getWidth());
    }
}

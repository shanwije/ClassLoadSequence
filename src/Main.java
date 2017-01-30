public class Main extends xxx{

    public static void main(String[] args) {
        int x =10;
        Main m = new Main();
        xxx xa = new xxx();
    }
    static {
        System.out.println("sub static");
    }
    {
        System.out.println("sub instance");}
    Main(){
        System.out.println("sub constructor");}
}
 class xxx extends yyy{
    static {
        System.out.println("super static");
    }
     {
         System.out.println("super instance");}
         xxx(){
             System.out.println("super constructor");}

    }

class yyy{
    static {
        System.out.println("super super static");
    }
    {
        System.out.println("super super instance");}
    yyy(){
        System.out.println("super super constructor");}

}

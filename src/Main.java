public class Main extends xxx{

    public static void main(String[] args) {
        System.out.println("Start#####################");
        Main m = new Main();
        System.out.println(
                "########### end main"
        );
        xxx xa = new xxx();
        System.out.println(
                "########### end xxx"
        );
        yyy df = new yyy();
        System.out.println(
                "########### end yyy"
        );
    }
    static {
        System.out.println("sub static");
    }
    {
        System.out.println("sub instance");}
    Main(){
        System.out.println("sub constructor");}
}
 class xxx{
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

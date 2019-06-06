package menu;

public class MenuBuilder {

    public MenuBuilder() {}

    //print main text
    public void mainManu(){
        System.out.println("Main menu :> ");
        System.out.println(" 1 :> Unlimit abroad calls  ");
        System.out.println(" 2 :> Who used abroad calls  ");
        System.out.println(" 3 :> Sort clients  ");

        System.out.println(" 0 :> Exit ");

        System.out.println("Please select menu item :> ");
    }

    public void numbersEnter(){
        System.out.println("Enter pizza numbers (max-> 10):");
    }
}

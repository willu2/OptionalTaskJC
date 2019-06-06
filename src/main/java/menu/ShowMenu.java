package menu;

import builders.ServiceData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowMenu {

    private int itemMenu = 0;

    ServiceData data;
    MenuBuilder menu;

    public ShowMenu() {
        data  = new ServiceData();
        menu = new MenuBuilder();
    }

    boolean exit = false;

    public void show() {
        do {
            menu.mainManu(); //main text menu
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            //main menu block
            try {
                switch (Integer.parseInt(in.readLine())) {
                    case 1:
                        data.clientVisor();
                        break;
                    case 2:
                        data.abroadCall();
                        break;
                    case 3:
                        data.sortByName();
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("Try again...");
                }
            } catch (IOException e) {
                System.err.println("Error: " + e);
            } catch (NumberFormatException e) {
                System.out.println("You entered an invalid operation");
                continue;   // go to beginning of loop
            }

        }while (!exit);
    }
}

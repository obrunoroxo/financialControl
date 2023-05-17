package financialControl.subClasses;

import java.util.Scanner;

import financialControl.subComponent.ClearTerminal;

public class LoginSystem {
    public void loginSystem() {
        ClearTerminal Clear = new ClearTerminal();

        Scanner reader = new Scanner(System.in);

        System.out.println("Type your login:");

        String login = reader.nextLine();

        Clear.clearTerminal();

        System.out.println("Type your password:");

        String password = reader.nextLine();

        Clear.clearTerminal();

        System.out.println("You taped: " + login + " " + password);
    }
}

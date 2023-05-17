package financialControl.subClasses;

import java.util.Scanner;

import financialControl.subComponent.TimerSystem;
import financialControl.subComponent.ClearTerminal;

public class EntryPoint {
    public void entryPoint() {
        ClearTerminal Clear = new ClearTerminal();
        TimerSystem Timer = new TimerSystem();
        LoginSystem Login = new LoginSystem();

        Clear.clearTerminal();

        System.out.println("Wellcome to our software!\n");

        Scanner reader = new Scanner(System.in);

        System.out.printf("1 - If you want to do a login.\n2 - If you want to creat a new register.\n3 - If you want to go out.\nAnswer: ");

        int response = reader.nextInt();

        if(response == 1) {
            Clear.clearTerminal();
            Timer.timerSystem(2000);
            Login.loginSystem();
        } else if(response == 2) {
            System.out.println("Do your register!");
        } else {
            System.out.println("Exit...");
        };
    }
}

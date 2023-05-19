package financialControl.subClasses;

import java.util.Scanner;

import financialControl.subComponent.*;

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

        do{
            if (response == 1){
                Clear.clearTerminal();
                Timer.timerSystem(2000);
                Login.loginSystem();
            } else if (response == 2) {
                System.out.println("Do your register!");
            } else if (response == 3) {
                System.out.println("Exit...");
                break;
            } else {
                Clear.clearTerminal();
                System.out.println("Please, type an avaiable answer!\n");
            }

            System.out.printf("1 - If you want to do a login.\n2 - If you want to creat a new register.\n3 - If you want to go out.\nAnswer: ");

            response = reader.nextInt();

        } while(response != 3);
    };
}

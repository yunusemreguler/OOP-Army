package com.company;

import com.company.Service.ArmyManager;
import com.company.Model.Abstract.Soldier;
import com.company.Model.Object.*;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArmyManager manager = ArmyManager.getInstance();

        Army army = manager.createArmy();
        Commander commander = army.getCommander();
        List<Soldier> soldiers = army.getSoldiers();

        Scanner scanner = new Scanner(System.in);
        String input ;

        //A simple switch case statement for experimenting
        //and understanding how it works
        do{
            System.out.println("You are the commander. Choose what you want to do with your army :" +
                    "\n1.Attack\n2.Defense\n3.Train\n4.Print Army\n5.Exit");

            input = scanner.nextLine();

            if("12345".contains(input))
            {
                switch (input) {
                    case "1":
                        commander.commandToAttack(soldiers);
                        break;
                    case "2":
                        commander.commandToDefense(soldiers);
                        break;
                    case "3":
                        commander.commandToTrain(soldiers);
                        break;
                    case "4":
                        manager.printArmyAttributes(army);
                        break;
                }
            }
            else
            {
                System.out.println("Soldiers need a decent command.");
            }

        }while(!input.equals("5"));

        System.out.println("Exit");
    }
}

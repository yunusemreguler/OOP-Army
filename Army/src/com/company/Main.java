package com.company;

import com.company.Function.ArmyCreator;
import com.company.Function.ArmyPrinter;
import com.company.Function.CommanderFinder;
import com.company.Soldier.Abstract.Soldier;
import com.company.Soldier.Object.*;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArmyCreator creator = new ArmyCreator();
        List<Soldier> army = creator.createArmy();//Creating the army using an ArmyCreator object and storing it inside a list

        CommanderFinder commanderFinder = new CommanderFinder();
        Commander commander = commanderFinder.findCommander(army);//Find the commander inside the army and use him to command soldiers

        ArmyPrinter armyPrinter = new ArmyPrinter();//Create an instance of Army Printer class to use it for printing army

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
                        commander.commandToAttack(army);
                        break;
                    case "2":
                        commander.commandToDefense(army);
                        break;
                    case "3":
                        commander.commandToTrain(army);
                        break;
                    case "4":
                        armyPrinter.printArmy(army);
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

package org.sun1zu.ExamTasks.T1;

import org.sun1zu.ExamTasks.T1.Model.Dictionary;

public class View {
    private static int MenuWaitUserInput(String menu, int min, int max) {
        while (true) {
            IO.println(menu);
            var selection = IO.readln();

            if (!selection.isEmpty()) {
                int menuSelection;
                try {
                    menuSelection = Integer.parseInt(String.valueOf(selection.charAt(0)));
                } catch (NumberFormatException ex) {
                    IO.println("Invalid input!");
                    continue;
                }
                if (menuSelection < min || menuSelection > max) {
                    IO.println("Please select a valid menu item!");
                    continue;
                }
                return menuSelection;
            }
        }
    }

    static String menu1 = "1. Create dict\n2. Edit dict\n3. Remove dict\n0. Exit";

    public static void run() {
        IO.println("Dictionaries by sun1zu\n");

        while (true) {
            var input = MenuWaitUserInput(menu1, 0, 3);
            switch (input) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    break;
                default:
                    IO.println("Unknown command!");
                    break;
            }
        }
    }

    String menu2 = "1. Read all pairs\n2. Delete by key\n3. Find value by key\n4. Add value\n0. Back";

    void DictMenu(Dictionary dict) {
        while(true) {
            var input = MenuWaitUserInput(menu2, 0, 4);
            switch (input) {
                case 0:
                    return;
                case 1:
                    dict.PrintPairs();
                    break;
                case 2:
                    var del_inp = IO.readln("Input a key for pair to delete: ");
                    dict.DeletePairByKey(del_inp);
                    break;
                case 3:
                    var find_inp = IO.readln("Input a key for pair to output: ");
                    dict.FindValue(find_inp);
                    break;
                case 4:
                    // TODO
                    var key_inp = IO.readln("Input a key to add pair to a dict: ");
                    var val_inp = IO.readln("Input a value to add pair to a dict: ");
                    dict.AddValue(add_inp, );
            }

        }
    }
}

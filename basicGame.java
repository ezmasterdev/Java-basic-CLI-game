import java.util.Scanner;

public class basicGame {
    public static void main (String[] args) {
        // General initializations
        Scanner sc1 = new Scanner (System.in);
        boolean isRunning1 = true;

        // Introduction
        System.out.println("Welcome to 'The Hero and the Princess;.");
        System.out.println("");
        System.out.println("What is your name young hero?");
        String heroName = sc1.nextLine();
        System.out.println("");
        System.out.println("The king needs your help, " + heroName + ".");
        System.out.println("");
        System.out.println("The princess was kidnapped and locked up in a dungeon inside the cavern.");
        System.out.println("Your task is to rescue the princess from the dungeon and bring her back.");
        System.out.println("But be warned, you will have to fight dangerous monsters inside.");
        System.out.println("");

        // Gameplay
        while (isRunning1) {
            // Storyline
            System.out.println("Are you ready? (yes/no)");
            String userInput1 = sc1.nextLine();
            String yes = "yes";
            String no = "no";
            System.out.println("");

            if (userInput1.equals(yes)) {
                // 3 routes
                System.out.println("As you went deep inside the cavern, you encountered 3 different routes.");
                System.out.println("");
                System.out.println("Path #1: A narrow path where you have to crawl to pass through.");
                System.out.println("Path #2: An old Hanging bridge that reaches the other side.");
                System.out.println("Path #3: A path that descends deeper into the caverns.");
                System.out.println("");
                System.out.println("Which route will you choose? (1/2/3)");
                int userInput2 = sc1.nextInt();
                System.out.println("");
                
                if (userInput2 == 1) {
                    Scanner sc2 = new Scanner (System.in);
                    boolean isRunning2 = true;
                    String inventory = "i";

                    System.out.println("You found a chest and you looted it.");

                    while (isRunning2) {
                        System.out.println("Press 'i' to check inventory.");
                        String userInput3 = sc2.nextLine().toLowerCase();
                        System.out.println("");
            
                        if (userInput3.equals(inventory)) {
                            System.out.println("Your inventory:");
                            System.out.println("- Sword");
                            System.out.println("- Shielld");
                            System.out.println("- Key");
                            System.out.println("");
                            
                            Scanner sc3 = new Scanner (System.in);
                            boolean isRunning3 = true;
                            String ok = "ok";

                            while (isRunning3) {
                                System.out.println("Type 'ok' to continue.");
                                String userInput4 = sc3.nextLine().toLowerCase();
                                System.out.println("");
                    
                                if (userInput4.equals(ok)) {
                                    System.out.println("You went back to where the 3 routes divereged.");
                                    System.out.println("You only have 2 routes left to explore.");
                                    System.out.println("");
                                    System.out.println("Path #2: An old Hanging bridge that reaches the other side.");
                                    System.out.println("Path #3: A path that descends deeper into the caverns.");
                                    System.out.println("");
                                    System.out.println("Which route will you choose? (2/3)");
                                    int userInput5 = sc3.nextInt();
                                    System.out.println("");
                                    
                                    if (userInput5 == 2) {
                                        System.out.println("GAME OVER!");
                                        System.out.println("The old bridge collapsed and you fell.");
                                        System.out.println("Rerun the program to play again.");
                                        System.out.println("");
                                        System.exit(0);
                                    }

                                    else if (userInput5 == 3) {
                                        Scanner sc4 = new Scanner (System.in);
                                        String item1 = "sword";
                                        String item2 = "shield";
                                        String item3 = "key";
                                        System.out.println("You found the dungeon where the princess is. You ventured further.");
                                        System.out.println("You encountered a large dragon guarding the princess' cell.");
                                        System.out.println("The dragon breathes fire at you.");
                                        System.out.println("");
                                        System.out.println("What item should you use? (sword/shield/key)");
                                        String userInput6 = sc4.nextLine().toLowerCase();
                                        System.out.println("");

                                        if (userInput6.equals(item1)) {
                                            System.out.println("GAME OVER!");
                                            System.out.println("You picked the wrong tool.");
                                            System.out.println("You got burned to death.");
                                            System.out.println("Rerun the program to play again.");
                                            System.out.println("");
                                            System.exit(0);
                                        }

                                        else if (userInput6.equals(item2)) {
                                            Scanner sc5 = new Scanner (System.in);
                                            System.out.println("You Successfully blocked the dragon's fire breath.");
                                            System.out.println("The dragon is exhausted. Use this moment to attack.");
                                            System.out.println("");
                                            System.out.println("What item should you use? (sword/shield/key)");
                                            String userInput7 = sc5.nextLine();
                                            System.out.println("");

                                            if (userInput7.equals(item1)) {
                                                Scanner sc6 = new Scanner (System.in);
                                                System.out.println("You fatally wounded the dragon.");
                                                System.out.println("You went to the princess' cell but it is locked.");
                                                System.out.println("");
                                                System.out.println("What item should you use? (sword/shield/key)");
                                                String userInput8 = sc6.nextLine();
                                                System.out.println("");

                                                if (userInput8.equals(item1)) {
                                                    System.out.println("GAME OVER!");
                                                    System.out.println("You picked the wrong tool.");
                                                    System.out.println("The princess died because of your stupidity.");
                                                    System.out.println("Rerun the program to play again.");
                                                    System.out.println("");
                                                    System.exit(0);
                                                }

                                                else if (userInput8.equals(item2)) {
                                                    System.out.println("GAME OVER!");
                                                    System.out.println("You picked the wrong tool.");
                                                    System.out.println("The princess died because of your stupidity.");
                                                    System.out.println("Rerun the program to play again.");
                                                    System.out.println("");
                                                    System.exit(0);
                                                }

                                                else if (userInput8.equals(item3)) {
                                                    System.out.println("YOU WON!");
                                                    System.out.println("You successfully rescued the princess.");
                                                    System.out.println("The king owes you his gratitude, " + heroName + ".");
                                                    System.out.println("");
                                                    System.out.println("Rerun the program to play again.");
                                                    System.out.println("");
                                                    System.exit(0);
                                                }

                                                else {
                                                    System.out.println("GAME OVER!");
                                                    System.out.println("Program terminates because the player is not cooperative.");
                                                    System.out.println("Rerun the program to play again.");
                                                    System.out.println("");
                                                    System.exit(0);
                                                }
                                            }

                                            else if (userInput7.equals(item2)) {
                                                System.out.println("GAME OVER!");
                                                System.out.println("You picked the wrong tool.");
                                                System.out.println("The dragon bit you to death.");
                                                System.out.println("Rerun the program to play again.");
                                                System.out.println("");
                                                System.exit(0);
                                            }

                                            else if (userInput7.equals(item3)) {
                                                System.out.println("GAME OVER!");
                                                System.out.println("You picked the wrong tool.");
                                                System.out.println("The dragon bit you to death.");
                                                System.out.println("Rerun the program to play again.");
                                                System.out.println("");
                                                System.exit(0);
                                            }

                                            else {
                                                System.out.println("GAME OVER!");
                                                System.out.println("Program terminates because the player is not cooperative.");
                                                System.out.println("Rerun the program to play again.");
                                                System.out.println("");
                                                System.exit(0);
                                            }

                                        }

                                        else if (userInput6.equals(item3)) {
                                            System.out.println("GAME OVER!");
                                            System.out.println("You picked the wrong tool.");
                                            System.out.println("You got burned to death.");
                                            System.out.println("Rerun the program to play again.");
                                            System.out.println("");
                                            System.exit(0);
                                        }

                                        else {
                                            System.out.println("GAME OVER!");
                                            System.out.println("Program terminates because the player is not cooperative.");
                                            System.out.println("Rerun the program to play again.");
                                            System.out.println("");
                                            System.exit(0);
                                        }

                                    }

                                    else {
                                        System.out.println("GAME OVER!");
                                        System.out.println("Program terminates because the player is not cooperative.");
                                        System.out.println("Rerun the program to play again.");
                                        System.out.println("");
                                        System.exit(0);
                                    }

                                }
        
                                else {
                                    System.out.println("Please input a valid response.");
                                    System.out.println("");
                                }
                            }

                        }

                        else {
                            System.out.println("Please input a valid response.");
                            System.out.println("");
                        }
                    }
                }

                else if (userInput2 == 2) {
                    System.out.println("GAME OVER!");
                    System.out.println("The old bridge collapsed and you fell.");
                    System.out.println("Rerun the program to play again.");
                    System.out.println("");
                    break;
                }
                
                else if (userInput2 == 3) {
                    System.out.println("You found the dungeon where the princess is. You ventured further.");
                    System.out.println("You encountered a large dragon guarding the princess' cell.");
                    System.out.println("");
                    System.out.println("GAME OVER!");
                    System.out.println("The dragon breathes fire at you and you burned to death.");
                    System.out.println("Rerun the program to play again.");
                    System.out.println("");
                    break;
                }

                else {
                    System.out.println("GAME OVER!");
                    System.out.println("Program terminates because the player is not cooperative.");
                    System.out.println("Rerun the program to play again.");
                    System.out.println("");
                    System.exit(0);
                }

            }

            else if (userInput1.equals(no)) {
                System.out.println("GAME OVER!");
                System.out.println("Your fear has conquered you.");
                System.out.println("Rerun the program to play again.");
                System.out.println("");
                break;
            }

            else {
                System.out.println("Please input a valid response.");
                System.out.println("");
            }
        }       
    }
}

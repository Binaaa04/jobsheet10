import java.util.Scanner;
/**
 * ModifyCinemaWithScanner21No2
 */
public class ModifyCinemaWithScanner21No2 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner (System.in);
        String [][]audience = new String[3][5];
        int menuSelection;
        String name;
        String line;
        int movieSelection;
        int row;
        int column;
        int audienceData;
        String isValidSeat;
        String[] movieTitles = {
            "Put Your Head On My Shoulder", 
            "Iron Man", 
            "The Conjuring", 
            "172 Days"
        };
        String [] movieSchedules = {
            "09:00 - 11:00", 
            "13:00 - 15:00", 
            "16:00 - 18:00", 
            "19:00 - 21:00"
        };

        System.out.println("   Welcome to the cinema!  ");
    
    while (true) {
            System.out.println("        ~ Menu ~        ");
            System.out.println("1. input audience data");
            System.out.println("2. display audience data");
            System.out.println("3. Exit");
            System.out.println();

            System.out.print("Select a menu (1-3): ");
            menuSelection = input21.nextInt();
            input21.nextLine();

        switch (menuSelection) {
            case 1:

                while (true) {
                  System.out.print("Enter a name: ");
                    name = input21.nextLine();
                    if (!name.equalsIgnoreCase("invalid")){
                    }

                    System.out.println();
                    System.out.println("              ~ Movie ~");

                    for (int i = 0; i < movieTitles.length; i++) {
                        System.out.println((i+1)+ ". "+movieTitles[i]+" ("+movieSchedules[i]+")");
                    }
                    
                    System.out.print("Select a movie (1-"+movieTitles.length+"): ");
                    movieSelection = input21.nextInt();

                    if (movieSelection>= 1 && movieSelection <= movieTitles.length) {
                        System.out.println();
                        System.out.println("You choose a movie :"+movieTitles[movieSelection-1]);
                        System.out.println("Schedule : "+ movieSchedules[movieSelection-1]);
                        System.out.println();
                    } else if (movieSelection == movieTitles.length + 1) {
                        System.out.println("thank you! out of the program");
                        return;
                    } else {
                        System.out.println("invalid option! please select the correct movie number");
                        break;
                    } 

                    for (int ticket = 1; ticket <= 2; ticket++) {
                        do {
                            System.out.print("enter the row number (1 - 3) for " + ticket + " ticket"+": ");
                            row = input21.nextInt();
                            System.out.print("enter the column number (1 - 5) for " + ticket + " ticket"+": ");
                            column = input21.nextInt();

                            if (row >= 1 && row <= audience.length && column >= 1 && column <= audience[row-1].length) {
                                if (audience [row - 1][column - 1] == null) {
                                    audience[row - 1][column - 1] = name; 
                                     System.out.println("Booking on behalf of " + name + " for " + movieTitles[movieSelection - 1] +
                                        " at " + movieSchedules[movieSelection - 1] + " in row " + row + ", column " + column);
                                } else {
                                    System.out.println("seats are occupied, please select another seat!");
                                    continue;
                                }break;
                               
                                } else {
                                System.out.println("Invalid seat! Please choose a valid number");
                                continue;
                                }
                        } while (audience[row - 1][column - 1] != null);
                } break;
            }

            case 2: 
                    System.out.println("audience list: ");
                 for (int i = 0; i <audience.length ; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        if (audience[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(audience[i][j]+"\t");
                        }
                    }
                    System.out.println("audience to"+(i+1)+": "+audience[i]);
                    
                }   break;
                
            case 3:
            System.out.println("Thank you! Enjoy your movie ^_^");
            return;
            default:
            System.out.println("Invalid selection! please try again");
            break;
                }
           
        }
    }
}

    
    


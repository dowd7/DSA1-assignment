import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //the 50 states and their capitals are stored in a two-dimensional array in order by state name
        String[][] statesAndCapitals = {
                {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"}, {"Colorado", "Denver"},
                {"Connecticut", "Hartford"}, {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"}, {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"}, {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"}, {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"}, {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"}, {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"}, {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, {"Tennessee", "Nashville"},
                {"Texas", "Austin"}, {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"}, {"Washington", "Olympia"}, {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"}, {"Wyoming", "Cheyenne"}
        };

        //Display the current contents of the array then use a bubble sort to sort the content by capital
        System.out.println("Original Array:");
        for(int i = 0; i < statesAndCapitals.length; i++) {
            System.out.println(statesAndCapitals[i][0] + " - " + statesAndCapitals[i][1]);
        }

        //Bubble sort
        for(int i = 0; i < statesAndCapitals.length; i++) {
            for(int j = 0; j < statesAndCapitals.length - 1; j++) {
                if(statesAndCapitals[j][1].compareTo(statesAndCapitals[j + 1][1]) > 0) {
                    String[] temp = statesAndCapitals[j];
                    statesAndCapitals[j] = statesAndCapitals[j + 1];
                    statesAndCapitals[j + 1] = temp;
                }
            }
        }

        Scanner scan = new Scanner(System.in);
        int counter = 0;

        for(int i = 0; i < statesAndCapitals.length; i++) {
            System.out.println("What is the capital of " + statesAndCapitals[i][0] + "?");
            String answer = scan.nextLine();
            if(answer.equalsIgnoreCase(statesAndCapitals[i][1])) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("Incorrect. The correct answer is " + statesAndCapitals[i][1] + ".");
            }
        }
        System.out.println("You got " + counter + " out of 50 correct!");
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //Part 1
        //the 50 states and their capitals are stored in a two-dimensional array in order by state name
        String[][] statesAndCapitalsArray = {
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
        for(int i = 0; i < statesAndCapitalsArray.length; i++) {
            System.out.println(statesAndCapitalsArray[i][0] + " - " + statesAndCapitalsArray[i][1]);
        }

        //Bubble sort
        for(int i = 0; i < statesAndCapitalsArray.length; i++) {
            for(int j = 0; j < statesAndCapitalsArray.length - 1; j++) {
                if(statesAndCapitalsArray[j][1].compareTo(statesAndCapitalsArray[j + 1][1]) > 0) {
                    String[] temp = statesAndCapitalsArray[j];
                    statesAndCapitalsArray[j] = statesAndCapitalsArray[j + 1];
                    statesAndCapitalsArray[j + 1] = temp;
                }
            }
        }

        Scanner scan = new Scanner(System.in);
        int counter = 0;

        //iterate through the sorted array and prompt the user to enter the capital of each state
        for(int i = 0; i < statesAndCapitalsArray.length; i++) {
            System.out.println();
            System.out.println("What is the capital of " + statesAndCapitalsArray[i][0] + "?");
            String answer = scan.nextLine();

            System.out.println();

            //if the user enters the correct capital, display a message indicating that they are correct and increment a counter
            if(answer.equalsIgnoreCase(statesAndCapitalsArray[i][1])) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("Incorrect. The correct answer is " + statesAndCapitalsArray[i][1] + ".");
            }
        }

        //display the number of correct answers
        System.out.println();
        System.out.println("You got " + counter + " out of 50 correct!");


        //Part 2
        //store the pairs of each state and its capital in a Map using a HashMap
        Map<String, String> statesAndCapitalsMap = new HashMap<>();
        for(int i = 0; i < statesAndCapitalsArray.length; i++) {
            statesAndCapitalsMap.put(statesAndCapitalsArray[i][0], statesAndCapitalsArray[i][1]);
        }

        //display the contents of the Map
        System.out.println();
        System.out.println(statesAndCapitalsMap);
        System.out.println();

        //use the TreeMap class to sort the map while using a binary search tree for storage
        Map<String, String> statesAndCapitalsTreeMap = new TreeMap<>();
        for(int i = 0; i < statesAndCapitalsArray.length; i++) {
            statesAndCapitalsTreeMap.put(statesAndCapitalsArray[i][0], statesAndCapitalsArray[i][1]);
        }

        //prompt the user to enter a state and display the capital for that state
        System.out.println("Enter a state to find its capital: ");
        String state = scan.nextLine();
        if(statesAndCapitalsTreeMap.containsKey(state)) {
            System.out.println("The capital of " + state + " is " + statesAndCapitalsTreeMap.get(state) + ".");
        } else {
            System.out.println("The state you entered is not in the list (Case matters).");
        }

    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Aaran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");


//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");


//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
        System.out.println("Scottish Islands: " +scottishIslands);


//        4. Print out the index position of "Skye"
        System.out.println("Index position of Skye: " + scottishIslands.indexOf("Skye"));


//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
        System.out.println("Scottish Islands excluding Tresco: " + scottishIslands);


//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
        System.out.println("Scottish Islands excluding Tresco & Aaran: " +scottishIslands);


//        7. Print the number of islands in your arraylist
        System.out.println("Number of Island: " +scottishIslands.size());


//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);


//        9. Print out all the islands using a for loop
        for(String islands: scottishIslands) {
            System.out.println(islands);
        }


//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        List<Integer> evenNumbers = new ArrayList<>();

        for(int no : numbers) {
            if (no % 2 == 0) {
                evenNumbers.add(no);
            }
        }

        System.out.println("Even numbers: " + evenNumbers);


//        2. Print the difference between the largest and smallest value
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        int difference = max - min;

        System.out.println("Range: " + difference);


//        3. Print True if the list contains a 1 next to a 1 somewhere.
        boolean consecutiveOnes = false;
        for(int i = 0; i < numbers.size() -1; i++) {
            if(numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                consecutiveOnes = true;
                break;
            }
        }

        System.out.println("Consecutive ones?: " + consecutiveOnes);


//        4. Print the sum of the numbers,
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
        

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
        int total = 0;
        for(int number : numbers) {
            if(number == 13) {
                break;
            }
                total += number;
            }

            System.out.println("Sum excluding 13 and any numbers after: " + total);
        }

}


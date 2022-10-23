# CS 201 Notes: August 31, 2022

## Java basics

Casting

1. You can change the type of a variable by the cast method:
   1. `int x = 5;`
   2. `System.out.println((double)x/2);`
2. placing the new type in parentheses before the use of the variable will convert it
3. Type casting will round if you cast to integers

Types

1. Primitive Types

   1. byte, short
   2. int
   3. float, double
   4. boolean
   5. char (use single quotes 'n')

2. Special Case

   1. String

      1. no need to call "new"

      2. Most reference types require new call, while primitive types don't

      3. Allows for storing arrays of characters

      4. String Methods:

         1. ```java
            String myString = "Hello World";
            Sysout(myString.length());
            Sysout(myString.charAt(0));
            Sysout(myString.substring(0,4)); //Prints the characters from 0-4 exclusive of 4 (so really just 0, 1, 2, 3)
            ```

            

3. Reference Types

   1. Need to call "new" and then call the constructor to create a reference type
   2. Example:
      1. `Scanner reader = new Scanner()`
   3. A type's constructor has the same name as the reference type
   4. These variables store a reference to an object - a place in memory
   5. You can access methods and variables from the object with the dot operator (period)

4. Java Arrays

   1. Arrays hold a fixed number of values of a single type (no mixing types)

   2. Example:

      1. ```java
         int[] numbers = new int[5];
         numbers[0] = 201;
         numbers[1] = 22;
         ```

      2. this creates an array of length 5 (for indices 0, 1, 2, 3, 4, NOT 5)

5. Java Loops

   1. For loop

      1. same as cpp:

         ```java
         for(int i = 0; i < myArray.length(); i++) {
         	bodyOfLoop;
         }
         ```

   2. Enhanced For Loop:

      1. ```
         for(int number : numbers) {
         	bodyOfLoopUsing(number);
         }
         ```

      2. This will loop over each value in the numbers array

   3. While loop

      1. same as cpp
      2. remember to iterate or increment at end (or beginning)

6. Methods

   1. Dynamics Methods
      1. Operate on a object, and has access to object data and arguments
   2. Static Methods
      1. Called on the class, and has access to arguments
         1. Like:
         2. `Math.sqrt(x)`
      2. these are often utility "functions"

7. Java API data structures:

   1. API ArrayList
      1. Need import: `import java.util.HashSet;`
      2. Need to specify type, and this list can grow dynamically
      3. Methods:
         1. .add()
         2. .get() //get the value at a specific index
         3. .size() //get the length of the array
         4. .contains() //returns bool if the value is inside the list
      4. CANT store primitive types in arraylist
         1. need to use wrapper object types
         2. This is why we use `ArrayList<Integer>` instead of `ArrayList<int>`
   2. API HashSet
      1. needs `import java.util.HashSet;`
      2. HashSets won't take in duplicates


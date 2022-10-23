# CS201 / Java General Notes:

## Git

Personal Access Token:

glpat-_epg7otiAcwTmu4Dhffx

## Javadoc

Method creating documentation within comments in java code

Common annotations for methods:

1. @param

   1. Example:

   2. ```java
      /*
       * @param name preferred name/nickname of person or anonymous
       * @param building common name of building where you can be found
       * @param floor which floor is your room
       */
       
      public Person201(String name, String building, int floor) {
      	myName = name;
      	myBuilding = building;
      	myFloor = floor;
      }
      ```

      

2. @returns

3. @throws

## Types

### String

#### Construction

1. Initialize with String typing, but no need to call "new String"
2. Use double quotes to surround the string you want to store

```java
String myString = "words";
```

#### Methods

1. Get size using length() method - since this is a method you need parantheses

   1. ```java
      String myString = "Words";
      len = myString.length();
      ```

### ArrayList

1. lists of values of same type
2. ordered
3. can grow

#### Importing

Since ArrayLists are classes in the java standard API, we must import from java.util

1. ```java
   import java.util.ArrayList;
   ```

   

#### Construction

1. Need to use ArrayList type with the specific type of object within array brackets

2. use the "new ArrayList<>" constructor

   1. ```java
      ArrayList<Float> myArray = new ArrayList<Float>;
      ```

#### Methods

1. .contains() method: will return true if the arraylist has that object, false otherwise

   1. ```java
      if(myArray.contains(2)) {
          ...
      }
      ```

2. .add() method - use ".add()"

   1. Appends to the end of the list

   2. ```
      myArray.add(7);
      ```

3. Accessing items - use ".get(i)" method

   1. This will access the object at index i

   2. ```
      myArray.get(2);
      ```


#### Conversion

1. You can convert an array into an array list through the use of a for loop, and vice versa

2. ```java
   ArrayList<Integer> intList = new ArrayList<>();
   int[] intArray = {2, 0, 1};
   
   //Converting a primitive type array to a list
   for (int number : intArray) {
   	intList.add(number);
   }
   
   //Convert an Integer list to an int[] array
   int[] newIntArray = new int[intList.size()];
   for (int i = 0; i < intList.size(); i++) {
       newIntArray[i] = intList.get(i);
   }
   ```

   

### HashSet

#### Importing

1. Import from java standard API

   1. ```java
      import java.util.HashSet;
      ```

#### Construction

1. Requires new keyword

   1. ```java
      HashSet<type> variableName = new HashSet<>();
      ```

      

#### Usage

1. Unordered collection
2. Does not store duplicates

#### Methods

1. .add() - stores the value
   1. if the value is already in the HashSet nothing changes
   
2. .size() - returns the number of objects in the set

3. .contains() - checks for if the object

4. .retainAll()

   1. This method copies only the items that are in both sets to the set before the method

   2. ```java
      Set.retainAll(Set2);
      ```

   3. This will copy all the common items from Set and Set2 to Set


Example:

```java
import java.util.HashSet;
public static void main (String[] args) {
	HashSet<String> strSet = new HashSet<>();
    strSet.add("Hello");
    strSet.add("World");
    strSet.add("Hello");
    
    if(strSet.contains("World")) {
        System.out.println(strSet.size());
    }
}
```

1. This example returns 2, as there are only two words stored  in the set, as duplicates are not allowed

### Java API Collections and Primitive vs object types

1. Java API Collections (like arraylists and hashsets) only store reference types not primitive types
   1. So "Integer" is allowed, while "int" is not
   2. Integer is an int object, but int is merely a primitive type

## Java Tips and Tricks

### Keywords

#### "this"

1. The *this* keyword refers to the object being called on. We use the keyword within the class creation, and is equivelent to an object of that class in the main function (or helper functions)

### Classes

#### Constructors

1. Constructors must have the same name as the class

2. Constructors specify how to create a new object of that class

3. example:

   1. ```java
      public class Point {
      	public double x;
          public double y;
         	
          public Point(double x, double y) {
              this.x = x;
              this.y = y;
          }
      }
      ```

### Methods

#### .equals()

1. The .equals() method is used to check if two objects are the same.
2. While you can use == to check for equality among primitive types, == does not generally work for objects
3. instead you should write a .equals() method for your classes, so that you can compare your own objects

#### Static methods

1. Operates on a class, not a specific object of that class

### Privacy

#### Public

1. Public variables can be accessed outside of the class
2. Private variables can only be accessed within the class that it is created
3. Methods can be public or private, and their privacy determines where the methods can be called
   1. If a method is private, then it cannot be called outside of its class

## Object Orientation

#### Definition

1. Object Oriented languages are organized by the specification and use of objects

2. An object consists of some internal data items plus the operations that can be performed on that data

   1. Those operations are called methods

   2. Example:

      1. ```java
         Scanner s = new Scanner(filename);
         s.next();
         ```

      2. Here, *s* is an object of the *Scanner* class

#### Classes and Objects

1. A class specifies the data and operations for a type of object
   1. objects are instances of a class
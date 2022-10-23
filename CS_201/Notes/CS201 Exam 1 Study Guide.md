# CS201 Exam 1 Study Guide

Table of Contents:

1. Data Structures
   1. Primitive Types
   2. Arrays
   3. String
   4. ArrayList
   5. HashSet
   6. HashMap
2. Java API Methods
   1. Collections Methods
   2. Arrays Methods

### Primitive Types

#### List of Primitive Types

1. byte, short
2. int, long (common integer types)
3. float, double (decimal types)
4. boolean (true vs false)
5. char (single character)

#### Basic Operations

1. +, -, *, /
   1. add, subtract, multiply, divide
2. % - modulo, returns the remainder
3. <, <= , >, >=less than and less than or equal to, greater...
4. == equality (returns boolean)
5. ! Logical NOT (returns boolean)
6. && Logical and
7. || Logical or

### Strings

#### Declaration

```java
String s = "Hello";
String v = new String("Hello");
```

#### Methods

1. charAt(index)

   1. returns the character from the index provided of that string

   2. Example: 

      ```java
      String s = "Hello"
      char myChar = s.charAt(2);
      System.out.println(myChar);
      ```

   3. Returns: "l"

#### Misc.

1. Strings are special as they are not primitive, but you do not need to call the "new" keyword to create a string
   1. If you don't initialize with value, use new
2. Strings are immutable, meaning you cannot change them after initialization
   1. When you concatenate Strings, it actually just copies every part of that string to a new string

#### Discussion answers:

Common map mistakes

1. When instantiating maps, you must use 

   ```
   Map<String, Integer> myMap = new HashMap<>();
   ```

   1. You cannot just do new Map<>(); as 

2. Counting in a map

   1. You must use "myMap.put()" if you change something in the map that is not a reference (you can't just change it)

3. Grouping

   1. Use 

      ```
      myMap.putIfAbsent(firstLetter, new ArrayList<>())
      ```

   2. This will add a new pair if the firstLetter isn't in map yet

   3. HERE, you can use the references to add to the list thats inside the map, with no need to put back in map

      1. ```
         List<String> current = myMap.get(firstLetter);
         current.add(w);
         ```

4. Scanning, indexing, 

BigO notation

1. nlog(n)
   1. When you divide your iterator inside a while loop, you get exponentially closer to the while condition (assuming its while(i > n)), meaning its log(N) where the base of the log is the divisor
2. m*n
   1. n^2m is right answer
   2. The for loop has complexity O(N)
   3. result += s has complexity O(MN)
   4. Together, they have N*MN
      1. Since you add N lengths (in the worst case) of length m, n times, we get nm * n
3. m^2
4. (mn^2)^2
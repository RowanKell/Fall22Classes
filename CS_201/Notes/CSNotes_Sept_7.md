# CS201 Lecture Notes: Sept, 7, 2022

#### Abstract Data Type (ADT)

1. ADT tells what a data structure does but not how

#### Java Interface

1. An interface specifies a set of abstract methods that an implementing class must override and define

2. 3 Most important ADTs

   1. List: ordered sequence of values
   2. Set: An unordered collection of unique values
   3. Map: a collection that associates keys and values

3. Collections

   1. Java API data structures storing groups of objects likely based on the Collection interface
   2. Lists, Sets and Maps are interfaces of collections

4. Interfaces need an implementing class specified when you create it

   1. ```
      List<String> strList = new List<>():
      ```

   2. This will throw an error, as Lists are not types

5. Implementations must override and implement all methods

   1. The list interface has the .get() method, meaning any classes that implement Lists must have a .get() method

6. Implementations of the same interface all have at least the same methods as the interface

   1. This means that you can have parameters that are lists, and then you can call the .contains() method on that list, because you know any implementations of list must have a contains() method, even though you don't know what implementation is being input

*Algorithmic Tradeoffs*

1. We are often interested in the efficiency of operations depending on scale.
2. For example: How effecient are the methods of an ArrayList with N values
   1. .get() - directly lookup in an array. "Constant time" - does not depend on how many values are stored in ArrayList
   2. contains() - loops through Array calling .equals() on each - takes longer the larger the list
   3. size() - Returns value of an instance variable tracking size, and does not depend on size of the list
   4. add() - depends

*How does ArrayList add work?*

1. Implements list (can grow) with array (cannot grow)
2. This works by keeping an array with extra space at the end. There are two cases when adding to end of arraylist:
   1. Has extra space- add to first open position
   2. No extra space - create a new (larger) array, copy everything, then add to first open position
      1. This creating a new array takes time, hurting runtime efficiency

*Overloading Constructors*

1. Instead of just creating a single constructor that requires a set number of parameters, we can create multiple allowing for the class to be constructed with different numbers of parameters
2. 


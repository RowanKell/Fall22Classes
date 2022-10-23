# CS Notes: September 12, 2022

#### Schedule

1. Wed:
   1. APT2 due
   2. Hashing
2. Fri:
   1. Discussion
3. Mon:
   1. P1: Nbody
   2. Runtime efficiency

#### WOTO: Reviewing Arraylist

1. Arraylist of 1 million values, it takes T nanoseconds to add to the front
   1. This requires shifting every element one to the right
2. It would take T/1 million nanoseconds - on average
3. In the worst case, it would take about the same time to make a new array with 2 million slots and copy 1 million values, so the same as moving 1 million to the right

### Array vs Collection

#### Array

1. Stores primitives or objects
2. Does not print to terminal, print one at a time
3. API static utility methods in java.util.Arrays

#### Collection

1. Stores objects only, use wrapper (Integer instead of int)
2. Prints to terminal
3. API static methods in java.util.Collections

#### ArrayList

1. Arraylist is an array of objects, easy to convert with API methods
   1. for example: the <ArrayListname>.addAll(<List>);
   2. you can convert an array to a list using: .asList(<Arrayname>)

### Set Review

1. Stores unique elements

   1. Relies on your equals method to know what duplicates are

2. Methods

   1. contains() - check if an element is in that set
   2. add() - add an element
      1. Returns false if already there
   3. remove() - to delete an element
   4. Don't expect the set to be stored in an order

3. FAQs

   1. How to loop over a set

      1. Can use enhanced for loop

         1. ```java
            for (String s : mySet) {
            	__code__;
            }
            ```

      2. How to convert lists and sets

         1. Use addAll()

         2. ```java
            myList.addAll(Set);
            ```

4. HashSet is a very efficient implement of Set

#### TreeSet

1. Also a set like HashSet, but different implementation
2. Doesn't store duplicates
3. Stores value sorted
   1. Sorts by type of object - depends on how the object implements a compare method

#### WOTO: List vs Set efficiency

1. Changing a set to a list when looping over that object
   1. Both loops take n runtime, as it has to go over every object
   2. Equal efficiency
2. Changing set to a list when you are calling .contains() on that object
   1. Set takes constant time, list takes linear time
   2. Set more efficient
3. Changing a set with an array (not arraylist)
   1. Since .contains() is being called, array doesn't have a method called containst() and hence the code wouldn't work
4. Does using .containsAll() work faster, slower, or the same as looping through a set using contains?
   1. Same, as you must loop through the set regardless when containsAll() is called

#### Maps

1. Pairs of keys and values
   1. keys are used to look up values
2. Map is an interface and must have methods like:
   1. put(k, v)
      1. assigns a key k to the value v in the map
   2. get(k)
      1. Search and obtain the value associated with the key k
   3. containsKey(k)
      1. return true if key k is in the map

3. Major implements
   1. HashMap: very efficient; put, get, containskey
   2. TreeMap: Nearly as efficient; sorted by keys
4. Note:
   1. Check before you get - if you call .get(key) on a map where that key is not in the map, the call returns null, and can crash the value
   2. check to see if the map contains the key ahead of time
5. If you get() the value from a map, it makes a copy of that value
   1. To change the value, need to use put() again

6. Updating note:
   1. for single values, .get() returns a copy of the value
   2. for collections, .get() returns a reference to collection - much better for efficiency
      1. You can then update that collection directly
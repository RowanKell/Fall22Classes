# CS 201 September 26th

Today:

1. Memory, Pointers, LinkedList (not exam 1)
2. Outline
   1. Review Big O
   2. LinkedList: API perspective
   3. LinkedList: DIY low-level perspective

Wed:

1. Midterm 1: 60 mins
   1. bring 1 page reference/study sheet
2. APT4 due

Monday:

1. P2 Markov due
2. More LinkedList

### Big O

#### Notes

1. When there are functions called on other functions

   1. Ex: stuff(stuff(n))
   2. We care about what value is returned by stuff(n), as this is what is passed to stuff()
   3. if stuff(n) returns $n^2$ then really we have stuff($n^2$)
   4. since stuff() has linear runtime complexity, stuff(stuff(n)) has quadratic

2. Composing methods in general

   1. Given two methods outer() and inner()

   2. if you do outer(inner(n)) this is the same as:

      1. ```
         inside = inner(n);
         outerr = outer(inside);
         ```

   3. We can calculate the size of inside, and use that for calculating runtime complexity of outer

      1. However, we must still add together inner and outer runtime complexity for our overall complexity

   4. Example:

      1. if inner(n) has complexity of O(1) - constant
      2. inner(n) returns a value of O($n^2$)
      3. outer($n^2$) is O(log($n^2$)) which simplifies to O(logn)

#### WOTO 1

1. Question 2:
   1. foo(bar(n))
      1. foo(n) has quadratic complexity 
         1. nested for loops
         2. quadratic on n is $n^2$
      2. bar(n) has quadratic complexity
         1. returns size O(n)
2. Question 3:
   1. bar(foo(n))
      1. foo(n) has quadratic complexity
         1. nested for loops
         2. returns a value of size $n^2$
      2. bar(n) has quadratic complexity too
         1. takes in value $n^2$ and hence bar($n^2$) has complexity $n^4$
      3. 

### Linked Lists

#### Notes

List interface, implemented by LinkedList

1. LinkedList and arraylist have same interface, meaning they do the same things, have same methods

2. Declaration

   1. ```java
      List<String> a = new LinkedList<>();
      ```

Why use linkedlist? efficiency

1. ArrayList uses Array. These have fast RAM, and fast get() method
2. get(i) has constant time runtime complexity
   1. This is possible because java knows where in memory the array starts, and that the array is consecutive, as well as how much memory each value takes

What is a linkedlist

1. A reference to the first node in a list, connected by a reference to the next node
   1. The list is not necessarily allocated all at once or sequentially in memory
2. No constant time access to nodes in the middle
   1. To get C in a list A,B,C, need to start at A

LinkedList .get() runtime

1. The runtime is not constant time
2. Calling list.get(k) is O(N) for LinkedList
   1. Almost, as its really doubly linked list, but typically still O(N)
3. list.get(k) is O(1) for Arraylist
4. To loop over a LinkedList with .get() has complexity O($n^2$)

get() vs iterator

1. Using an iterator has linear time complexity

   1. either use enhacned for loop

      1. ```
         for (int val : llist)
         ```

   2. or use while loop

      1. ```
         while(llist.hasNext())
         ```

Why use LinkedList?

1. ArrayList has bad efficiency with adding or removing objects at front of list
2. LinkedList can add/remove from front in constant time complexity

#### WOTO

1. Removing a middle element of a LinkedList
   1. O(n) since you need to go through n/2 objects in the list to get to the middle (depends on n)
2. Removing a middle element of an ArrayList
   1. O(n) - getting to that reference is constant, but removing requires shifting n/2 objects to the left (depends on n)
3. runtime complexity of removing all zeros from a linkedlist of length n
   1. Quadratic complexity
   2. For each iteration (n iterations), call get() which is then linear complexity - linear of linear is $n^2$
      1. removing then takes n, but you only add the get and remove runtime, so 2n
4. Storing the reverse of a linked list
   1. Linear runtime
   2. loop over the linked list with iterator
      1. add a new to the front each time - constant time complexity when adding to front
      2. since looping over list of size n, linear
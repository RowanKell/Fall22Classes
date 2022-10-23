# CS Notes September 19, 2022

#### Reminders

1. Test next Wednesday

#### Repeated concatenation

1. Using a string object and the + operator

   1. ```java
      String result = new String;
      result += toConcat;
      ```

      

2. Using StringBuilder object and the append method

   1. ```java
      String toConcat;
      String result = new StringBuilder();
      result.append(toConcat)
      ```

Runtime efficiency:

1. Stringbuilder efficiency is faster than using the + operator
2. Furthermore, the efficiency of Stringbuilder increases with number of concatenations
   1. This is because when the + operator method does twice as many concatenations it takes 4 times as long - quadratic complexity
   2. In contrast, when the StringBuilder method does twice as many concatenations, it takes twice as long - linear
3. Since one method is quadratic and one is linear, they diverge and are called asymptotic

Why?

1. String are immutable - they are set when they are created, and cannot be changed
   1. If you create a loop that adds new things to the string each iteration, the program is copying every character in your string  and the addition string every iteration
   2. On iteration i, you need to copy 3 * (i + 1) characters
      1. if you are adding 3 characters each time
   3. Using a summation, we find that the runtime is quadratic
2. With StringBuilder, only 3 characters must be copied each iteration, making the runtime linear

Memory:

1. StringBuilder uses about 146k / 98k (necessary) = 1.5 as much used as necessary - shows the tradeoff between memory usage and runtime efficiency
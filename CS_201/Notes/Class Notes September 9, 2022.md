# Class Notes: September 9, 2022

## Topic: Object Oriented Program

Class Names:

1. Capitalized and CamelCase
2. Class name must match the file name

ArrayList:

1. Methods:
   1. .add()
   2. .get()
   3. .size()
   4. .contain()

HashSet:

1. Methods:

   1. .add()
   2. .size()
   3. .contains()

2. Unordered collection, no duplicates

3. Import

   1. ```java
      import java.util.HashSet;
      ```

#### Object Orientation

1. Organized by specification and use of objects
2. An object consists of data and operations which can be performed on that data

#### Methods

1. Side effects:
   1. Although methods often return a value, they may have side effects that change an attribute or a object, meaning you don't use the return value but utilize the side effect
2. == operator and .equals method
   1. == checks equality for primitive types
      1. This checks for same address in memory
   2. for objects, == does not generally work
      1. You need to define the comparison between your own types
   3. For strings, you must use the .equals method
      1. Someone else wrote this so you don't need to write your own equals method
   4. Implement this method for all your classes

#### Construction of new objects

1. When you create a new object, you must call the new keyword
2. When you then refer to this object afterwards, you will always refer back to this single object in memory
3. If you alter this object, without calling new, you will alter that original, single object
4. If you set a new object equal to that object without the new keyword, you will still refer to that single object, and alter that object through your new object
# CS Notes Sept 14

Hashing, HashMap, HashSet

### Efficiency:

#### HashSet vs HashMap methods

1. HashSet:
   1. add(), contains() - both constant time complexity
2. HashMap:
   1. put(), get() containsKey() - all constant time complexity
3. *Constant Time means that methods take the same amount of time regardless of number of objects*

#### Does efficiency really matter

1. Using a set instead of a list is very important when working with billions of objects

#### Preview of day:

1. How does a hash table work to implement HashMap, HashSet
2. Why do equals() and hashCode() matter
3. Why are the add() contains() put() get() and containsKey() all constant time?

#### Hash Table

As used in HashMap

1. Relies on big idea - not storing key value pairs in the order they are input
   1. Instead, calculate a hash of key to determine where to store and lookup
   2. Using this hash (it is an integer), the program can look up the key immediately, as the key should be at that hash if it exists
2. HashMap methods
   1. Always start by calculating the hash
      1. Math.abs(key.hashCode()) % list.size()
   2. put(key, value)
      1. associating a particular value with a key
      2. stores that key value pair to list at index hash
      3. if the key is already there, just change the value
   3. get(key)
      1. return value with key at the hash index position of list
   4. containsKey
      1. check if key exists at index hash position of list
   5. These methods do not require looping over the table
3. Collisions
   1. If you already have a key value pair at position 2, and then you calculate the hash and take the modulo for a new key value pair, and get 2 also, then this is a collision
   2. To get around this, we use buckets at each position in the table
      1. Each bucket can store multiple key value pairs at the same position, allowing for all pairs to be stored after collisions
   3. To get() a key now, we must loop over all the values in a bucket to find the key you're searching for
   4. This solution using buckets is called chaining

Where does equals() come in?

1. if there are multiple pairs in one bucket, you need to figure out which pair to update
2. Always the pair where the key in the bucket equals() the key we put() or get().
3. Need the equals() method to wprk for key type
   1. String? int? already work
   2. if you use your own objects, you need to override and implement equals()

What about hashCode()?

1. Correctness
   1. Any 2 objects considered equal by your equals() method need to have the same hashCode()
      1. if they aren't then you won't place the pairs in the same bucket, and won't see the key, causing it to place the object in the table
2. Efficiency
   1. Runtime depends on how many pairs are in each bucket, as you must loop over all objects in each bucket
   2. Does not take more time to find buckets when you have more buckets

#### Memory/Runtime Tradeoff

1. Case 1: N >> M - many more pairs than buckets, meaning that memory is saved but runtime is longer as more objects must be looped through
2. Case 2: M >> N - too many buckets - runtime is constant, but memory is overused
3. Case 3: M slightly bigger than N - overall runtime is constant, and memory is reasonable - still more memory than an ArrayList
4. How large to create initially?
   1. Load factor - maximum N/M ratio allowed
      1. java default is 0.75
   2. If the load factor is exceeded - create a new table, double the size, and rehash + copy everything
      1. Need to use a new modulo
      2. This can cause the objects in one bucket to be spread out into multiple buckets

Note:

1. If you want to change how an object prints, you can override the toString() method




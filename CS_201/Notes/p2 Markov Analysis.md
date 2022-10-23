# p2: Markov Analysis

#### Question 1:

What is the asymptotic runtime complexity of the methods: **SetTraining()**, **getRandomText()**, for the BaseMarkov implementation in terms of N and T?

1. Theory
   1. SetTraining() consists of just splitting the text and saving to the variable myWords. This means that the runtime complexity is O(T) as split() has O(T) complexity. 
   2. getRandomText() begins by making an arraylist, calling nextInt(), and add() which all have constant runtime complexity. Then we use a for loop to loop through N - order objects, and call getNext() in that loop. (The rest of the loop consists of shiftAdd() and add() methods which are constant time). The call to getNext() makes a call to getFollows (and then some add(), nextInt() and get() methods which are constant time). getFollows then loops through myWords, which is T length. Inside the loop are only constant runtime operations, meaning that the overall runtime of getRandomText() is O(NT) as we have to loop through T objects for every N object in our output.
2. Experiment

| **Data File**   | **T**   | **N**  | **Training Time (s)** | **Generating Time (s)** |
| --------------- | ------- | ------ | --------------------- | ----------------------- |
| alice.txt       | 28,196  | 100    | 0.063                 | 0.488                   |
| alice.txt       | 28,196  | 1,000  | 0.036                 | 1.358                   |
| alice.txt       | 28,196  | 10,000 | 0.028                 | 16.199                  |
| kjv10.txt       | 823,135 | 100    | 0.357                 | 4.689                   |
| kjv10.txt       | 823,135 | 500    | 0.205                 | 25.078                  |
| kjv10.txt       | 823,135 | 1,000  | 0.192                 | 51.888                  |
| shakespeare.txt | 901,325 | 100    | 0.316                 | 5.288                   |
| shakespeare.txt | 901,325 | 500    | 0.300                 | 23.621                  |
| shakespeare.txt | 901,325 | 1,000  | 0.238                 | 55.710                  |

	1. In our experiment we find that training time (representing SetTraining()) increases with T, but does not have a correlation to N. For instance, alice.txt has no training times above 0.06s while all of shakespeare.txt values are above 0.2, but both have largest training times for the smallest N value. We can estimate the dependency on T to be linear given that the jump from alice.txt to kjv10.txt causes an almost 10x increase in training time, but then the jump from kjv10.txt to shakespeare.txt only yields an approximate increase of 0.1, or 50%. The smaller increase in Tmeans smaller increase in training time, suggesting linear correlation.
	1. getRandomText(): We can see a clear increase of generating time when N is increased across different texts, but we can also notice a dependency on T as the generating times for shakespeare.txt and kjv10.txt are much larger than alice.txt at the same N value. Hence, we know that getRandomText() must depend on both N and T. Furthermore, as T and N get larger, we notice steady growth in generating times. Especially in the kjv10.txt and shakespeare.txt tests we notice that the 5x jump between N  = 100 and N = 500 causes nearly a 5 times jump between the generating times. Then, the 2x jump from N=500->1000 yields increases of about 2x for the generating time, suggesting a linear dependence. shakespeare.txt has slightly higher values for 2 of its datapoints, which suggests the dependency on T as well.

#### Question 2:

Same thing but for HashMarkov

1. Theory

   1. I expect SetTraining() to have O(T) asymptotic runtime complexity based on the theory of hashmaps. The method begins by splitting the training text which takes O(T) as it has to copy T words from text to the myWords String array. Then the map is cleared which should take constant time if the map is empty, or O(T) time if it has at most T entries. If the map has T key-value pairs, this runtime increase (currently at O(2T)) would converge to O(T) asymptotically. Then we must loop through T - order words on line 24. Inside the loop, we have multiple constant time (and some amortized constant time) operations like .containsKey(), add(), get(), and put() which together make up a constant time inside the for loop. This means that the loop overall has O(T) time, meaning that the SetTraining() runtime comes to O(T) as the different O(T) operations add together, but we take O(3T) as O(T) as the asymptotic runtime complexity.

   2. As for getRandomText(), this method creates an arraylist, sets an index, sets the current wordgram and adds that wordgram to the arraylist. All of these operations are constant time. Then, we loop through N - order items. Inside this loop, we call getNext() which adds a random string only taking O(1) time. We also have to call getFollows inside the loop. This function only requires calling get() on the map (or creating a new entry in the map) meaning the call is constant time. We then call shiftAdd() which loops through the wordgram, taking constant time. That marks the end of the loop, meaning the loop only has constant time operations and does each N - order (a constant length number) meaning the loop overall has O(N) complexity. We then call String.join() in the return statement which has O(N) time complexity as it has to add N Strings to a new string. Overall, the total runtime complexity ends up being O(N) as we only have linear complexity operations added together.

2. Experiment 

| **Data File**   | **T**   | **N**   | **Training Time (s)** | **Generating Time (s)** |
| --------------- | ------- | ------- | --------------------- | ----------------------- |
| alice.txt       | 28,196  | 1,000   | 0.095                 | 0.006                   |
| alice.txt       | 28,196  | 10,000  | 0.112                 | 0.022                   |
| alice.txt       | 28,196  | 100,000 | 0.113                 | 0.104                   |
| kjv10.txt       | 823,135 | 1,000   | 1.170                 | 0.004                   |
| kjv10.txt       | 823,135 | 10,000  | 1.190                 | 0.045                   |
| kjv10.txt       | 823,135 | 100,000 | 1.192                 | 0.172                   |
| shakespeare.txt | 901,325 | 1,000   | 1.746                 | 0.006                   |
| shakespeare.txt | 901,325 | 10,000  | 1.919                 | 0.025                   |
| shakespeare.txt | 901,325 | 100,000 | 1.602                 | 0.143                   |

	1. SetTraining(): we see no appreciable difference in training times when N increases, and going from N=10k->N=100k actually yielded shorter training time for shakespeare.txt, suggesting that this method does not depend on N. However, when comparing differing T values for the same N values, we find that training time increases as T increases. Furthermore, when T increases by 29x, we find that training time increases approximately 10x. Then when T increases by about 1.10x, we see an increase of 1.4x. This shows that the increase is not quadratic, nor exponential or anything more than linear, and is most likely linear. Although we would expect a smaller increase from 10k->100k, O(T) only means that the runtime is asymptotically linear, and hence at smaller values of T there may be more variance. As T->infinity, though, we would expect runtime to increase closer and closer to linearly.
	1. getRandomText(): Similar to settraining, but flipped, we find that generating time does not depend on T, and instead only appears to depend on N. For instance, generating time for T=823,135 takes longer than for T=901,325 in both the N = 10,000 and N = 100,000 cases when compared side by side. When looking at dependency on N, we find increases between the   N=1k->10k ranging from between 3.67x for alice.txt to 11 for kjv10.txt and back down to 4.167 for shakespeare.txt. This variance probably is random noise due to uncontrollable differences in the computer processes as opposed to a dependency on data. for the jump from N = 10k-> 100k we get 4.73 for alice.txt, 3.822 for kjv10.txt, and 5.72 for shakespeare.txt. Because this increase is relatively similar to the 1k->10k increase, we can conclude that getRandomText() most likely has linear runtime as there is almost no variance between different, equal, increases (which we would find with quadratic, logarithmic, and exponential time complexity)

#### Question 3:

Do you think new research code in AI/ML should be more open source? Why, or why not?

1. I think that research code should remain open source. From a more optimistic perspective, keeping research code under lock and key hurts the speed and breadth of development as fewer people are able to work on continuing the research. If more people had access to all the newest developments, their combined efforts could help achieve better results. From a more pessimistic perspective, allowing code to be open source doesn't allow big corporations to upsell consumers, and can also increase overall global security. If developments get into the wrong hands and can be used for the purposes of evil, then closed source research cannot be used for protection against these threats. If it is open source, then although bad actors have access, good actors do as well, and we know that they are at least on even footing.
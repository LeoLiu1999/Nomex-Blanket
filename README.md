

##Hypothesis
Best Case:    O(n log n)
Average Case: O(n log n)
Worst Case:   O(n ^ 2)
Big O classification: n log n most of the time.

As demonstrated in the code, each call to the recursive quicksort algorithm will conjure two new recursive calls, unless the range received is of size one or fewer. Each call will also run the partition algorithm on a certain number of elements. When making the two recursive calls in the quicksort algorithm, only half of the range is given to each. Thus, the number of uses of the partition algorithm doubles for every step removed from the original call. However, the size of data handled by each partition call halves as the number of calls double (after all, the goal is to split the list into finer and finer pieces -- no more or less data is generated). Essentially, the sum of elements handled by all the partition algorithms of all the recursive calls a certain distance removed from the original method call, stays the same.

                             Calls to partition:  Elements per call:   Total elements handled:
        {x x x x x x x x}            1                    8                     8
           |         |  
        {x x x x} {x x x x}          2                    4                     8
        /     |     |     \
      {x x} {x x} {x x} {x x}        4                    2                     8                    
       /\     /\    /\    /\
    {x}{x} {x}{x} {x}{x} {x}{x}      0                    -                     0

The diagram above should illustrate this idea. For nearly every 'distance' or recursive 'level', a total number of elements are handled equal to n. Thus the runtime must be (n * some number). It turns out that, because the size of each individual range is halving with each level, it will take roughly log base 2 (n) levels to reach ranges of size one, and stop recursing. In the illustration above, the recursive algorithm moves three levels deep before each call begins to return, and 3 is indeed log base 2 (8). In the above example, n * log base 2 (n), or 24, total array elements are handled. Therefore, the hypothetical runtime of quicksort is nlog(n).

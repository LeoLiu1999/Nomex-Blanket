Best Case:    O(n log n)
Average Case: O(n log n)
Worst Case:   O(n ^ 2)

Big O classification: n log n most of the time.

In any array, a certain number of recursive calls will be made. Each level of recursive call, that is each class of calls which is a certain distance removed from the original call, operates on n elements.

[x x x x x x x x]
[x x x x ] [x x x x]
[x x] [x x] [x x] [x x]
[x] [x] [x] [x] [x] [x] [x] [x]


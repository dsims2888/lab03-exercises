# Lab03
Find All Duplicates
Write a function (or static method in the case of Java) that accepts a list of integers 
and returns a list of only those integers that appear more than once.

In the nested loop approach, you compare each element in the list to every other element 
by using two loops. The outer loop iterates over the list, checking each element one at a time.
For each element in the outer loop, the inner loop checks the rest of the elements 
after the current element to see if any of them match the current one.
If a match/duplicate is found, the duplicate is recorded or printed.

The dictionary or map solution utilizes a hash table (or dictionary/map) to efficiently keep 
track of the elements that have already been seen as you iterate through the list.
As you iterate through the list, for each element, you check if it already exists in the dictionary 
or map. If it does, then it's a duplicate, and can be added to the result.
If the element is not in the dictionary, you add it as a key with a value,
by the end of the loop, the dictionary/map contains all the elements that have appeared at least once.

The nested loop approach is slower (O(n²)) and may be impractical for large lists. While the
dictionary/map approach is much faster (O(n)) because it uses a hash table for quick lookups and is 
more suited for larger datasets.

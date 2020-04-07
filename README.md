# Custom Iterator Pattern

### Description
An overview of the iterator pattern and it's purpose can be found [in my previous example](https://github.com/jaycoh/Iterator-Pattern-Built-In)

Take our toy store example. Say it now has two lists: one for inventory and one for backlog. We could iterate over both of these
lists, but to do so we would need to somehow combine them into a singular list.

Or, say we only wanted every third toy from the inventory list. We would have to create a new structure of every third toy before
using its built-in iterator.

Or, say we wanted to iterate over a different structure, such as a graph. We would need to put all of the information into
a new structure.

All of the solutions to these problems require us to modify our existing structures, which goes against the idea of the
iterator pattern. Instead, what we should do is create a custom iterator to allow us to iterate over our class without
changing any of our current structures.

How it works:
- The class that is to be made iterable still extends Iterable<Item>, and iterator() returns an instance of our custom iterator
- Our custom iterator is defined in a private inner class - thus giving it access to all the internal information needed
- Our inner class has two functions: hasNext() which returns true iff there is another element to iterate through, and
next(), which returns the next element to iterate through. There is often some sort of counter to help these functions.
 
### My example

I used a nearly identical example to my one from before with the built-in iterator. Here, the difference is that I split
the field for wine bottles into two: one for red wines and one for white wines. I did minimal changes to make it easy to compare the two, so you can see
where the implementation differs. However, now that we have two lists, it is now in our best interests to use a custom iterator.

 When the program asks to iterate through an instance of WineCellar, it utilizes the iterator returned by WineCellar.iterator(). This iterator (since it is the iterator attached to the bottles field) iterates through the values found in bottles.
 
The code to iterate through the bottles in a cellar is ran twice: once without utilizing the iterator design pattern, and once with the iterator design pattern. Notice that the first iteration (without the design pattern) requires certain details of WineCellar's implementation that the second iteration (with the DP) simply does not need. 

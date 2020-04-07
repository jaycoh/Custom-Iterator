# Custom Iterator Pattern

### Description
An overview of the iterator pattern and it's purpose can be found [in my previous example.](https://github.com/jaycoh/Iterator-Pattern-Built-In)

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
next(), which returns the next element to iterate through. There is often some sort of counter to help these functions. Note that whatever counter is used should only be updated once next() has executed.
 
### My example

I used a nearly identical example to my one from before with the built-in iterator. Here, the difference is that I split
the field for wine bottles into two: one for red wines and one for white wines. I did minimal changes to make it easy to compare the two, so you can see
where the implementation differs. However, now that we have two lists, it is now in our best interests to use a custom iterator.

What you may find interesting is that rather than use a counter, and compare it to the size of each list, I used the built in iterators for each of the wine lists. While I did not need to do this, I chose to use the built in iterators because they already have the functionality I need. When my function hasNext() is called, I just need to know that at least one of my lists has another wine bottle not yet iterated through. So I just check that one of the iterators' hasNext() functions returns true. When next() is called, I first check if my list of red wines has another bottle to iterate through (by using redWine's iterator's hasNext() function). If it does, I return redWine's iterator's next, otherwise I return whiteWine's iterator's next. Remember that the hasNext() function will only update once it's iterator has next() called on it.


 ### Result
 
 You'll notice that the output when running Main.java here differs from Main.java in my previous project. That is because I set up my custom iterator in a way that red wines are iterated through first, then white wines. I could have implemented it such that the iteration alternates between red and white wines, perhaps with a boolean to keep track of which type of wine we are on.
 
 A big advantage of custom iteratos is the amount of control over how/what we iterate over. Some things I could have done are: iterate through a reverse list, iterate through every n-*th* item in the list, or iterate through only elements that had certain attributes.

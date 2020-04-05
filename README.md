# Built In Iterator Pattern

### Description
Say you have a program to represent a toy store. This toy store would have some sort of field to represent its inventory, likely in the form of a list of toys.

It is likely that you would want to iterate through the toys in a toy store. This would make sense, as a collection of toys is inherently a part of any toy store. However, to do so normally would require accessing internal implemtation - whomever created the toy store class likely did not want other portions of the program accessing its fields. Even if there existed a getter for the toy list, we would still be given a list of all the toys in the store - probably giving away more information than desired.

The iterator pattern is best in these cases - when a class contains a list of items that are inherently integral to the class, and we need to allow our program to iterate through this list without giving away any sort of internal information.

How it works:
- The class that is to be made iterable extends Iterable<Item>, a built in interface. Item is the type of data you want to iterate through (Item would be Toy in the above example).
- The class implements the method iterator(), which returns the iterator that is used by the class. The iterator corresponds to the list we are iterating over, any each type of list has a built in iterator.
- The iterator is used when a for loop is executed through an object of the Item type (e.g. for (Toy t: toyStore) )
 
### My example

I chose to showcase this pattern with a small program describing a wine cellar (WineCellar.java) that contains wine bottles (of type WineBottle).

I chose this because wine bottles are an integral part of a wine cellar, and when dealing with a program for a cellar it feels natural to go through all the bottles in the cellar. WineCellar contains a list of WineBottle in the field bottles. Notice that WineCellar implements Iterable<WineBottle>. It also contains the function iterator(), which returns bottles.iterator(). This tells the program that WineCellar should use the iterator over bottles.

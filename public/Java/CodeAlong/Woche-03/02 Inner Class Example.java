// ---
// jupyter:
//   jupytext:
//     text_representation:
//       extension: .java
//       format_name: percent
//       format_version: '1.3'
//       jupytext_version: 1.15.2
//   kernelspec:
//     display_name: Java
//     language: java
//     name: java
// ---

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
//
// <div style="text-align:center; font-size:200%;">
//   <b>Inner Class Example</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 02 Inner Class Example.java -->
// <!-- slides/module_111_classes/topic_610_inner_class_example.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Introduction to Inner Classes
// - To see an inner class in use, first consider an array. In the following example, you create an array, fill it with integer values, and then output only values of even indices of the array in ascending order.
// - The DataStructure.java example that follows consists of:
//     - The DataStructure outer class
//     - The EvenIterator inner class, which implements the DataStructureIterator
//     - A main method that instantiates a DataStructure object (ds), then invokes the printEven method to print elements of the array arrayOfInts that have an even index value.

// %% tags=["start"]
public class DataStructure {
    
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven() {
        // to be implemented
    }

}

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Inner Classes
// - Note that the EvenIterator class refers directly to the arrayOfInts instance variable of the DataStructure object.
// - You can use inner classes to implement helper classes such as the one shown in this example.
// - To handle user interface events, you must know how to use inner classes because the event-handling mechanism makes extensive use of them.

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Local and Anonymous Classes
// - There are two additional types of inner classes.
// - You can declare an inner class within the body of a method. These classes are known as local classes.
// - You can also declare an inner class within the body of a method without naming the class. These classes are known as anonymous classes.

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Modifiers
// - You can use the same modifiers for inner classes that you use for other members of the outer class.
// - For example, you can use the access specifiers `private`, `public`, and `protected`.

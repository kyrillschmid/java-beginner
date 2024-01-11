// -*- coding: utf-8 -*-
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
//   <b>Abstract classes</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 04 Abstract classes.java -->
// <!-- slides/module_111_classes/topic_200_abstract_classes.java -->


// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
//
// - We had the following class hierarchy in an exercise on inheritance:

// %% tags=["keep"]
class Employee {
 
}

// %% tags=["keep"]
class Manager extends Employee {
 
}

// %% tags=["keep"]
class Worker extends Employee {
 
}

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// - `Employee` only serves to define the common behavior of `Manager` and `Worker`
// - It should be impossible to create instances of `Employee`
// - At the moment this is possible

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Abstract classes
//
// - Classes that cannot have direct instances
// - Have `abstract` keyword in Java
// - Allow use of the `abstract` keyword before methods to define abstract methods

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### The abstract `Employee` class

// %%

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### The `Manager` and `Worker` classes

// %% tags=["start"]
class Manager extends Employee {
    
}

// %%

// %%


// %% tags=["slide", "keep"] slideshow={"slide_type": "slide"}
class Worker extends Employee {
    @Override
    double salary() {
        return 50_000.0;
    }
}


// %%

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### The `Company` class
//
// - We define a class that manages a list of `Employee` objects

// %% tags=["start"]
class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    double monthlyExpenses() {
        //
    }
}

// %%

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// - Abstract methods can provide an implementation
// - Classes that inherit from an abstract class but do not override all abstract
//   methods are themselves abstract.

// %% tags=["keep", "subslide"] slideshow={"slide_type": "subslide"}
abstract class MyBase {
    void myMethod() {
        System.out.println("Hi!");
    }
}


// %%


// %%


// %% tags=["subslide"] slideshow={"slide_type": "subslide"}


// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Workshop: Shapes
//
// In this workshop, you will implement geometric shape classes using abstract
// classes.
//
// - Create a base class called `Shape` with abstract
//   methods for calculating area and perimeter.
// - Create concrete subclasses for rectangles and circles that inherit from the
//  `Shape` class and implement the abstract methods.
// - Test your implementation with different dimensions.

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### Notes
//
// - You can use the `Math` class for the value of π.
// - The area of a rectangle is calculated as `width * height`, its perimeter is
//   `2 * (width + height)`.
// - The area of a circle is calculated as `π * radius ^ 2`, its perimeter is
//   `2 * π * radius`.

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ### Bonus Tasks:
//
// - Feel free to extend the workshop by creating additional shape classes like
//   `Triangle`, inheriting from `Shape` and implementing their respective
//   methods.
// - Create a class Drawing that stores a list of shapes and implements methods for
//   calculating the total area and perimeter of all shapes in the drawing (assuming
//   they don't overlap).


// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

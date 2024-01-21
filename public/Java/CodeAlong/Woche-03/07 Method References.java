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
//   <b>Method References</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 07 Method References.java -->
// <!-- slides/module_112_language/topic_700_method_references.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Introduction
// - You use lambda expressions to create anonymous methods. 
// - Sometimes, however, a lambda expression does nothing but call an existing method. 
// - In those cases, it's often clearer to refer to the existing method by name. 
// - Method references enable you to do this

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Sample Usage
// - Suppose that the members of your social networking application are contained in an array, and you want to sort the array by age.

// %%

// %%

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Using Lambda Expression
// - Notice that the interface Comparator is a functional interface. Therefore, you could use a lambda expression instead of defining and then creating a new instance of a class that implements Comparator.

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Using Method Reference
// - However, this method to compare the birth dates of two Person instances already exists as Person.compareByAge. You can invoke this method instead in the body of the lambda expression.
// - Because this lambda expression invokes an existing method, you can use a method reference instead of a lambda expression.

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Properties of Method Reference
// - The method reference Person::compareByAge is semantically the same as the lambda expression (a, b) -> Person.compareByAge(a, b). Each has the following characteristics:
// - Its formal parameter list is copied from Comparator<Person>.compare, which is (Person, Person).
// - Its body calls the method Person.compareByAge.

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Kinds of Method References
// - There are four kinds of method references:


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Reference to a Static Method
// - The method references Person::compareByAge and MethodReferencesExamples::appendStrings are references to a static method.

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Reference to an Instance Method of a Particular Object
// - The following is an example of a reference to an instance method of a particular object:

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Reference to an Instance Method of an Arbitrary Object of a Particular Type
// - The following is an example of a reference to an instance method of an arbitrary object of a particular type:

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - The equivalent lambda expression for the method reference String::compareToIgnoreCase would have the formal parameter list (String a, String b), where a and b are arbitrary names used to better describe this example. The method reference would invoke the method a.compareToIgnoreCase(b).
// - Similarly, the method reference String::concat would invoke the method a.concat(b).

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Reference to a Constructor
// - You can reference a constructor in the same way as a static method by using the name new. The following method copies elements from one collection to another:

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - You can use a constructor reference in place of the lambda expression.
// - The Java compiler infers that you want to create a HashSet collection that contains elements of type Person.
// - Set<Person> rosterSet = transferElements(roster, HashSet<Person>::new);

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Overview
// When to Use Nested Classes, Local Classes, Anonymous Classes, and Lambda Expressions
// - As mentioned in the section Nested Classes, nested classes enable you to logically group classes that are only used in one place, increase the use of encapsulation, and create more readable and maintainable code. Local classes, anonymous classes, and lambda expressions also impart these advantages; however, they are intended to be used for more specific situations:
// **Local class**: Use it if you need to create more than one instance of a class, access its constructor, or introduce a new, named type (because, for example, you need to invoke additional methods later).
// **Anonymous class**: Use it if you need to declare fields or additional methods.
// **Lambda expression:**
//      - Use it if you are encapsulating a single unit of behavior that you want to pass to other code. For example, you would use a lambda expression if you want a certain action performed on each element of a collection, when a process is completed, or when a process encounters an error.
//      - Use it if you need a simple instance of a functional interface and none of the preceding criteria apply (for example, you do not need a constructor, a named type, fields, or additional methods).
// **Nested class**: Use it if your requirements are similar to those of a local class, you want to make the type more widely available, and you don't require access to local variables or method parameters.
//      - Use a non-static nested class (or inner class) if you require access to an enclosing instance's non-public fields and methods. Use a static nested class if you don't require this access.

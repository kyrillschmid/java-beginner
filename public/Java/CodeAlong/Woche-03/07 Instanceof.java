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
//   <b>Instanceof</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 07 Instanceof.java -->
// <!-- slides/module_112_language/topic_900_instance_of.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - The instanceof operator in Java cannot be used to determine if a type is a supertype of a given class
// - Instead, instanceof is used to check whether an object is an instance of a specified class or any of its subclasses

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Using instanceof: This operator checks if an object is an instance of a specific class or an instance of any class that is a child (subclass) of that specific class
// - For example, if you have class Animal and class Dog extends Animal, and you create Dog myDog = new Dog(), then myDog instanceof Animal will return true because Dog is a subclass of Animal

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Checking for Supertypes: If you want to check if a certain class is a supertype of another class, you cannot use instanceof
// _ Java's reflection API can be used for this purpose
// - You can use methods like isAssignableFrom from the Class class. For example, Animal.class.isAssignableFrom(Dog.class) will return true, indicating that Animal is a supertype of Dog.

// %%

// %%

// %%

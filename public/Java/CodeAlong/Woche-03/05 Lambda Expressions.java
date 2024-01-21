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
//   <b>Lambda Expressions</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 05 Lambda Expressions.java -->
// <!-- slides/module_112_language/topic_600_lambda_expressions.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Overview 
// - One issue with anonymous classes is that if the implementation of your anonymous class is very simple, such as an interface that contains only one method, then the syntax of anonymous classes may seem unwieldy and unclear. 

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Lambda expressions enable you to treat functionality as method argument, or code as data.
// - This section covers the following topics:
//     - Ideal Use Case for Lambda Expressions
//     - Syntax of Lambda Expressions
// - This notebook will cover these topics with examples and provide a thorough understanding of how to use Lambda Expressions in Java programming.

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Ideal Use Case for Lambda Expressions
// - Suppose that you are creating a social networking application. 
//      - You want to create a feature that enables an administrator to perform any kind of action
//      - E.g. sending a message, on members of the social networking application that satisfy certain criteria.

// %%

// %%


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## First Approach
// - Create methods that search for members that match one characteristic
// - One simplistic approach is to create several methods; each method searches for members that match one characteristic, such as gender or age.

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - This approch works but might make your application a little brittle
//      - What if the Person class changes? 
//      - What if you want to print members younger than a certain age, or members within a certain range of ages?

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Second Approach
// - Idea: Create more generalized search methods
// - The following method is more generic than `printPersonsOlderThan`; it prints members within a specified range of ages:

// %%

// %%

// %% [markdown] lang="en" tags=["slide"
// - This method is more generic than printPersonsOlderThan, but it is still limited.
//      - What if you want to print members of a specified sex, or a combination of a specified gender and age range? 
//      - What if you decide to change the Person class and add other attributes such as relationship status or geographical location? 
// - Although this method is more generic than printPersonsOlderThan, trying to create a separate method for each possible search query can still lead to brittle code. 

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Third Approach
// - Idea: Separate the code that specifies the criteria for which you want to search in a different class.

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - The following method prints members that match search criteria that you specify:

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - To specify the search criteria, you implement the interface CheckPerson, which contains the method test.
// - The following method checks whether a Person is eligible for Selective Service:

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - To use this class you create a new instance of it and invoke the method printPersons:

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - This approach is less brittle (you don't have to rewrite methods if you change the structure of the Person)
// - Downside: more code (a new interface and a local class for each search you plan to perform in your application)

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Fourth Approach
// - Idea: Specify search criteria code in an anonymous class
// - One of the arguments of the following invocation of the method `printPersons` is an anonymous class that filters members that are eligible for Selective Service in the United States: those who are male and between the ages of 18 and 25:

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
//  // -  The syntax of an anonymous classes is bulky considering that the CheckPerson interface contains only one method. 

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Fifth Approach
// - Idea: directly pass the needed functionality code to the method
// - This is where lambda expressions come into play.

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Lambda Expressions
// - The `CheckPerson` interface is a **functional interface**. 
//      - A functional interface is any interface that contains only one abstract method.
// - Because a functional interface contains only one abstract method, you can omit the name of that method when you implement it. 

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Syntax of Lambda Expressions
// ```java 
// (arg1, arg2, ...) -> { body }
// ```


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Workshop: Lambda Expressions
//
// - Let's assume we want to design a simple calculator that can perform basic operations on two numbers.
// - We want to be able to pass the operation as a parameter to the calculator.

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Define an interface that contains a method that takes two integers and returns an integer.

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Use this functional interface to create instances of the following operations with lambda expressions:
//     - Addition
//     - Subtraction
//     - Multiplication
//     - Division

// %%

// %%

// %%

// %%

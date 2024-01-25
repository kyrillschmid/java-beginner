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
//   <b>The Collection Interface</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 04 The Collection Interface.java -->
// <!-- slides/module_150_collections/topic_112_the_collection_interface.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Introduction
// - A Collection represents a group of objects known as its elements
// - For example, you have a Collection<String> c, which may be a List, a Set, or another kind of Collection

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - The Collection interface is used to pass around collections of objects where maximum generality is desired
// - This idiom creates a new ArrayList (an implementation of the List interface), initially containing all the elements in c.

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// Or — if you are using JDK 7 or later — you can use the diamond operator:

// %%

// %%

// %%% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## The Collection Interface Methods
// - The Collection interface contains methods that perform basic operations, such as 
//      - `int size()`, `boolean isEmpty()`, `boolean contains(Object element)`
//      - `boolean add(E element)`, `boolean remove(Object element)`
// - It also contains methods that operate on entire collections
// - Additional methods for array operations (such as `Object[] toArray()` and `<T> T[] toArray(T[] a)`) exist as well
// - In JDK 8 and later, the Collection interface also exposes methods `Stream<E> stream()` and `Stream<E> parallelStream()`

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Traversing Collections
// There are three ways to traverse collections:
// - Using aggregate operations 
// - With the for-each construct 
// - By using Iterators 

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Aggregate Operations
// - In JDK 8 and later, the preferred method of iterating over a collection is to obtain a stream 
// - Aggregate operations are often used in conjunction with lambda expressions 

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// -  You could easily request a parallel stream, which might make sense if the collection is large enough and your computer has enough cores

// %%

// %% [markdown] lang="en" tags=["slide"
// - We will learn more about streams in the lesson on aggregate operations

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## for-each Construct
// - The for-each construct allows you to concisely traverse a collection or array using a for loop
// ```java
// for (Object o : collection)
//    System.out.println(o);
// ```

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Iterators
// - An Iterator is an object that enables you to traverse through a collection and to remove elements from the collection selectively, if desired

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - The following method shows you how to use an Iterator to filter an arbitrary Collection 
// - Here, we traverse the collection and remove specific elements
// - Its polymorphic (works for any Collection regardless of implementation)
// ```java
// static void filter(Collection<?> c) {
//    for (Iterator<?> it = c.iterator(); it.hasNext(); )
//        if (!cond(it.next()))
//            it.remove();
// }
// ```

// %%

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Bulk Operations
// Bulk operations perform an operation on an entire collection:
// - `containsAll` — returns true if the target Collection contains all of the elements in the specified Collection
// - `addAll` — adds all of the elements in the specified Collection to the target Collection
// - `removeAll` — removes from the target Collection all of its elements that are also contained in the specified Collection
// - `retainAll` — removes from the target Collection all its elements that are not also contained in the specified Collection
// - `clear` — removes all elements from the Collection

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Consider the following idiom to remove all instances of a specified element, e, from a Collection, c
// - This idiom uses Collections.singleton, which is a static factory method that returns an immutable Set containing only the specified element:

// %%


// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Suppose you want to remove all of the null elements from a Collection:

// %%

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Collection Interface Array Operations
// - The `toArray` methods are provided as a bridge between collections and older APIs that expect arrays on input
// - The array operations allow the contents of a Collection to be translated into an array

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Suppose that c is known to contain only strings
// - The reason for passing `new String[0]` is to inform the toArray method about the desired type of the output array

// %%

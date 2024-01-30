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
//   <b>Introduction to Collections in Java</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 02 Introduction to Collections in Java.java -->
// <!-- slides/module_150_collections/topic_100_introduction_to_collections.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Introduction
// - A *collection* — sometimes called a container — is simply an object that groups multiple elements into a single unit
// -  Collections are used to store, retrieve, manipulate, and communicate aggregate data
// - Typically, they represent data items that form a natural group
//     - a poker hand (a collection of cards)
//     - a mail folder (a collection of letters)
//     - or a telephone directory (a mapping of names to phone numbers)

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## What Is a Collections Framework?
// - A *collections framework* is a unified architecture for representing and manipulating collections
// - Interfaces: Abstract data types that represent collections
//      - Allow collections to be manipulated independently of the details of their representation
//      - In object-oriented languages, interfaces generally form a hierarchy
// - Implementations: Provide reusable data structures
// - Algorithms: Polymorphic methods for useful computations (e.g. searching and sorting)

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Benefits of the Java Collections Framework
// - Reduces programming effort: concentrate on the important parts of your program rather than on the low-level "plumbing"
// - Increases program speed and quality: This Collections Framework provides high-performance, high-quality implementations of useful data structures and algorithms
// - Allows interoperability among unrelated APIs: The collection interfaces are the vernacular by which APIs pass collections back and forth
// - Reduces effort to learn and to use new APIs: Many APIs naturally take collections on input and furnish them as output
// - Reduces effort to design new APIs: This is the flip side of the previous advantage
// - Fosters software reuse: New data structures that conform to the standard collection interfaces are by nature reusable

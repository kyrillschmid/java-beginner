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
//   <b>Basic Data Types</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 03 Basic Data Types.java -->
// <!-- slides/grundkurs/topic_002_Datentypen.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Parts of a program
//
// We want to write a program that outputs
//
// ```
// Hello world!
// ```
//
// on the screen.
//
// What do we need for this?

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// What do we need for this?
//
// - Data
//     - the text `Hello, world!`
// - Instructions
//     - *Output the following text on the screen*
// - Comments
//     - Notes for the programmer, are ignored by Java

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Comments
//
// - `//` followed by any text
// - to the end of the line

// %% tags=["keep"] lang="en"
// This is a comment.
// All lines in this cell will be
// ignored by Java.

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Data
//
// - Numbers: `123`, `3.141592`
// - Text (strings): `"Hello, world!"`

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %%

// %%

// %%

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %%

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Displaying values with the `System.out.println()` function
//
// To display values you can use the `System.out.println()` function:
//
// `System.out.println(...)` prints the text enclosed in parentheses on the screen.

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Primitive data types
//  - Integers: *byte, short, int, long*

 // %% tags=["keep"]
 byte  kreditLaufZeitInMonate = 127;              // 8 bit
 short mitarbeiterAnzahl      = 32767;            // 16 bit
 int deutschlandEinwohner     = 83_190_556;       // 32 bit 
 long weltweitBewohner        = 7_888_000_000L;   // 64 bit 

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Floating point numbers: *float, double*

// %% tags=["keep"]
float  a = 3.1415f;                    // 32 bit
double d = 3.1415926536;               // 64 bit 

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
//  - Single characters: *char*

// %% tags=["keep"]
char zeichen = 'a';                    // 16 bit

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
//  - Boolean:  *true, false*

// %% tags=["keep"]
boolean isConnected = false;             // 1 bit   
boolean isJavaCool = true;               // 1 bit

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Reference data types
// - All other data types are so-called reference data types
// - Example String

// %%

// %% [markdown] tags=["slide"] slideshow={"slide_type": "slide"}
// - Arrays

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - Lists

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// - User defined Java classes are also reference data types

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Let's look at the difference between primitive and reference data types:
// [Python Tutor](https://pythontutor.com/visualize.html#code=public%20class%20Main%20%7B%0A%0A%20%20public%20static%20void%20main%28String%5B%5D%20args%29%7B%0A%20%20%0A%20%20%20%20int%20a%20%3D%201%3B%0A%20%20%20%20double%20b%20%3D%202.0%3B%0A%20%20%20%20char%20c%20%3D%20'c'%3B%0A%20%20%20%20String%20s%20%3D%20%22Hello,%20world%22%3B%0A%20%20%20%20%0A%20%20%7D%0A%7D&cumulative=false&heapPrimitives=true&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false)


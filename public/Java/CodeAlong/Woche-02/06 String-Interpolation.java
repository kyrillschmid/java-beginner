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
//   <b>String-Interpolation</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 06 String-Interpolation.java -->
// <!-- slides/module_160_strings/topic_170_a4_string_interpolation.java -->
//
//

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # Motivation
//
// - Many languages offer a mechanism to insert values into strings.
// - Java does not have a native function for this task.
// - But there are methods to achieve this behavior.

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # The `+`-Operator

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # `String.format` 

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// - We can reference specific argumments if we want to avoid repetition:

// %% tags=["start"]
int ersteZahl = 42;
int zweiteZahl = 24;
String output = String.format("The first %1$s and the second %2$s", ersteZahl, zweiteZahl);
output;

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # StringBuilder
// - We can use `StringBuilder` to build strings:

// %% tags=["keep"]
StringBuilder sb = new StringBuilder();
sb.append("Hallo ")
    .append("Hans")
    .append("!")
    .append("Die Zahl ist ")
    .append(42)
    .append(".");
String output = sb.toString();
output;

// %% [markdown] tags=["subslide"] slideshow={"slide_type": "subslide"}
// # MessageFormat

// %% tags=["start"]
String first = "Hans";
int second = 12;

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # `printf`
// - To print formatted strings we use `printf`:

// %%

// %% [markdown] lang="en"]
// ## Mini workshop: Greeting
//
// Write a function `printGreeting(name)` that prints a personalized
// greeting, e.g..
// ```
// Hello John!
// Nice to welcome you again today.
// We wish you a lot of fun, John.
// ```
// Use string interpolation to achieve this.

// %% lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}

// %%


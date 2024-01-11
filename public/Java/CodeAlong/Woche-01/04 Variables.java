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
//   <b>Variables</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 04 Variables.java -->
// <!-- slides/grundkurs/topic_003_Variablen.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// # Variables
//
// We want to build a fence around our new property.
//
// <img src="img/fence.svg" style="display:block;margin:auto;width:40%"/>

// %% [markdown] lang="en"
// <img src="img/fence.svg"
//   style="vertical-align:top;overflow:auto;float:right;width:35%"/>
//
// The measured lengths are:
// - Birkenweg: 20m
// - Fichtengasse: 30m
//
// How long does our fence have to be?

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// # Variables

// %%

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # Properties of variables
// - Variable has a **type** and a **name**
//      - Stored value must match the type of the variable
//      - Java is said to be statically typed

// %% tags=["keep"]
int laengeBirkenweg = 20;

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Variables can reference primitive data types and complex objects
// - Values of primitive data types are stored directly in the variable
// - Values of complex objects are stored in a different memory area and the variable references this memory area

// %%

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # Variable name rules
// - Name must not start with a number
// - Must not contain spaces
// - Must not contain special characters except _ and $
// - Must not match a Java keyword

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # Java (Clean Code) Conventions

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Camel Case

// %%

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Choose meaningful names

// %% tags=["keep"]
// Elapsed time in days
int d = 0;

// %%

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Mini-Workshop: Pirates
//
// According to legend, the booty in pirate gangs was divided fairly amongst all
// pirates. If the booty could not be shared fairly, the captain received the excess
// share.
//
// How many gold doubloons does each pirate in a gang of 8 (7 pirates + 1 captain) get
// when looting a treasure with 1000 gold doubloons?
//
// (Use variables to make the calculation clearer.)

// %% lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}

// %% [markdown] lang="en"
// How many extra gold doubloons does the captain get?

// %% lang="en"

// %% [markdown] lang="en"
// The pirate gang takes on 3 new pirate apprentices.
//
// How does the distribution of the loot change?
//
// (Use assignments to the existing variables to solve the problem.)

// %% lang="en"

// %% [markdown] lang="en"
// In this case, how many additional gold doubloons does the captain receive?

// %% lang="en"


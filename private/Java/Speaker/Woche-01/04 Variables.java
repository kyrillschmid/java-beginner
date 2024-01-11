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
20 + 30 + Math.sqrt((20*20 + 30*30));

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// # Variables

// %%
float laengeBirkenweg = 20;
float laengeFichtengasse = 30; 

// %%
float laengeHauptstrasse = (int) Math.sqrt(laengeBirkenweg * laengeBirkenweg + laengeFichtengasse * laengeFichtengasse);
float laengeGesamt = laengeBirkenweg + laengeFichtengasse + laengeHauptstrasse;
float ergebnis = laengeGesamt;

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # Properties of variables
// - Variable has a **type** and a **name**
//      - Stored value must match the type of the variable
//      - Java is said to be statically typed

// %% tags=["keep"]
int laengeBirkenweg = 20;

// %%
laengeBirkenweg = "20"; // Compilerfehler

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Variables can reference primitive data types and complex objects
// - Values of primitive data types are stored directly in the variable
// - Values of complex objects are stored in a different memory area and the variable references this memory area

// %%
int laengeBirkenweg = 20;

// %%
String strasse = "Birkenweg";

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # Variable name rules
// - Name must not start with a number
// - Must not contain spaces
// - Must not contain special characters except _ and $
// - Must not match a Java keyword

// %%
int 7orangenSaftGlas = 100;

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// # Java (Clean Code) Conventions

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Camel Case

// %%
int orangenSaftGlas = 100;    // Java Style: Camel Case

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Choose meaningful names

// %% tags=["keep"]
// Elapsed time in days
int d = 0;

// %%
// better
int elapsedTimeInDays = 0;

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
int numberOfPirates = 8;
int totalBooty = 1000;
int bootyPerPirate = totalBooty / numberOfPirates;
bootyPerPirate

// %% [markdown] lang="en"
// How many extra gold doubloons does the captain get?

// %% lang="en"
int captainBooty = totalBooty % numberOfPirates;
captainBooty

// %% [markdown] lang="en"
// The pirate gang takes on 3 new pirate apprentices.
//
// How does the distribution of the loot change?
//
// (Use assignments to the existing variables to solve the problem.)

// %% lang="en"
int numberOfPirates = 11;  // better, if the cell is evaluated multiple times
bootyPerPirate = totalBooty / numberOfPirates;
bootyPerPirate

// %% [markdown] lang="en"
// In this case, how many additional gold doubloons does the captain receive?

// %% lang="en"
captainBooty = totalBooty % numberOfPirates;
captainBooty


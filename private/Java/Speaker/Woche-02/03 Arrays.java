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
//   <b>Arrays</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 03 Arrays.java -->
// <!-- slides/module_150_collections/topic_110_b1_arrays.java -->


// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## Motivation
//
// - We can now write programs that perform many kinds of calculations, 
//   but we don't yet have a way to combine multiple objects.
// - If we want to create a shopping list, for example, 
//   we currently have to use the following solution:

// %% lang="en" tags=["keep"]
String product1 = "oatmeal";
String product2 = "coffee beans";
String product3 = "orange marmalade";

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// This approach has many problems:
//
// - We need to know exactly how many products we want to buy
// - There is no way to perform operations on all products, e.g. print all products
// - Java does not know that the products belong together
// - ...

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
//
// ## The solution: Arrays

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Creating Arrays
// - Declaration and creation with new:
//  ```java
//  Datentyp[] name = new Datentyp[Anzahl];
//  ```

// %% lang="en"
String[] shoppingList = new String[3];

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Writing and reading from Arrays
// - Access with `[]`:
//  ```java
//  // Writing
//  name[Position] = Wert;
//
//  // Reading
//  Wert = name[Position];
//  ```

// %% lang="en"
shoppingList[0] = "oatmeal";

// %% lang="en"
shoppingList[0];

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// If you want to specify the values directly at the time of initialization,
// you can specify them with curly brackets:

// %% lang="en"
String[] shoppingList = {"oatmeal", "coffee beans", "orange marmalade"};

// %% lang="en"
shoppingList[0];

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// The number of elements in an array is not changeable!
//  - Static data structure with fixed length!

// %% lang="en"
shoppingList[3] = "milk"; // Error!

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Outputting array elements
//
// How can we output all elements of an array without leaving the allowed range?

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Each array has a .length attribute

// %% lang="en"
shoppingList.length;

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// We can use the `.length`-attribute to prevent loops from leaving the allowed range

// %% lang="en"
for (int i = 0; i < shoppingList.length; i++) {
    System.out.println(shoppingList[i]);
}

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## For-Each Loop
// Java additionally provides a For-Each Loop:

// %% lang="en"
for (String product : shoppingList) {
    System.out.println(product);
}

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Multidimensional Arrays
// - The elements of an array can also be arrays

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Example: 2-Dimensional array:

// %% tags=["keep"]
int[][] matrix = {
    {1, 2, 3}, // Row 0
    {4, 5, 6}, // Row 1
    {7, 8, 9}  // Row 2
};

// %%
matrix[0][0]

// %%
matrix[1][1]

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// It corresponds to a matrix with 3 rows and 3 columns:
// Visualized:
// | Array Index | Column 0 | Column 1 | Column 2 |
// |-------------|----------|----------|----------|
// | Row 0       | 1        | 2        | 3        |
// | Row 1       | 4        | 5        | 6        |
// | Row 2       | 7        | 8        | 9        |

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Example: 3-Dimensional array:

// %% tags=["keep"]
int[][][] image = {
    {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    },
    {
        {10, 11, 12},
        {13, 14, 15},
        {16, 17, 18}
    },
    {
        {19, 20, 21},
        {22, 23, 24},
        {25, 26, 27}
    }
};

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Accessing an element:

// %%
image[1][2][1];

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// The inner lengths of the arrays can vary:

// %% tags=["keep"]
int[][] myArray = new int[3][];
myArray[0] = new int[]{1};
myArray[1] = new int[]{1, 2};
myArray[2] = new int[]{1, 2, 3};

// %% tags=["keep"]
System.out.println(myArray[0].length);
System.out.println(myArray[1].length);
System.out.println(myArray[2].length);

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// It corresponds to a matrix with 3 rows:
// - The first row has 1 element
// - The second row has 2 elements
// - The third row has 3 elements
// | Array Index | Column 0 | Column 1 | Column 2 |
// |-------------|----------|----------|----------|
// | Row 0       | 1        | -        | -        |
// | Row 1       | 1        | 2        | -        |
// | Row 2       | 1        | 2        | 3        |
//
//

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// The length of the outer array must be specified:

// %%
int[][] a = new int[10][];

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Iteration of multidimensional arrays

// %% tags=["keep"]
// for-loop
for (int x = 0; x < matrix.length; x++) {
    for(int y = 0; y < matrix[x].length; y++) {
        System.out.println("Array-Element: " + matrix[x][y]);
    }
}

// %% tags=["keep"]
// foreach
for (int[] row : matrix) {
    for (int element : row) {
        System.out.println("Array-Element: " + element);
    }
} 

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Mini-Workshop: Arrays
//
// - Write a function `getMean(double[] temperatures)` that calculates the average of an array passed as a argument.


// %% tags=["keep"]
getMean(new double[] { 1.0, 2.0, 3.0 });

// %%
public double getMean(double[] temperatures) {

    if (temperatures.length == 0) {
        return 0.0; 
    }
    double sum = 0; 
    for (int i = 0; i < temperatures.length; i++) {
        sum = sum + temperatures[i]; 
    }
    return sum / temperatures.length;
}

// %%
getMean(new double[] { 1.0, 2.0, 3.0 });



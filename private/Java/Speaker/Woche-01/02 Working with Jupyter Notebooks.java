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
//   <b>Working with Jupyter Notebooks</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 02 Working with Jupyter Notebooks.java -->
// <!-- slides/grundkurs/topic_001_Notebooks.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Working with Java in notebooks
//
// - Jupyter notebooks originate from the Python world
// - But there is also support for other languages, e.g. Java

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Installation
//
// The following steps are necessary for this:
// 1. Prerequisite: Java Development Kit (JDK) 9 or higher & Python 3.6 or higher installed
// 2. Installation of `Jupyter Notebook` in terminal or command prompt:
// ```bash
// pip install notebook
// ```
// 3. Installation of `IJava`:
//    - 1. Download the latest IJava version from [IJava](https://github.com/SpencerPark/IJava)
//    - 2. Unzip the downloaded ZIP file into a folder of your choice
//    - 3. In terminal (Unix/Linux/macOS) or command prompt (Windows), in extracted folder run the following command:
// ```bash
// python3 install.py --sys-prefix
// ```
// This installs the IJava kernel for Jupyter Notebook.

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Checking the installation
// 1. Start Jupyter Notebook by running the following command:
// ```bash
// jupyter notebook
// ```

// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
// ## Working with notebooks
//
// - Notebooks are divided into cells
// - Cells can contain either text or Python code.
// - Command and edit mode (`Esc` / `Enter`)
// - Some keyboard shortcuts: `Ctrl`-`Enter`, `Shift`-`Enter`, `Tab`, `Shift-Tab`

// %% tags=["keep"]
void sayHello(String name){
    System.out.println("Hello, " + name);
}

// %% tags=["keep"]
sayHello("World")

// %% [markdown] lang="en" tags=["notes"] slideshow={"slide_type": "notes"}
// <div style='background:yellow'>
// ## Displaying values
//
// - Jupyter notebooks print the last value of each cell on the screen
// - That doesn't happen in "normal" Python programs!
// - At least when they are executed as programs
// - The interactive interpreter behaves similar to notebooks
// </div>

// %% tags=["subslide"] slideshow={"slide_type": "subslide"}
123

// %%
17 + 4

// %%
int answer = 42;
answer

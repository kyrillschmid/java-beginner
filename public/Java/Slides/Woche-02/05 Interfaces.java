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
//   <b>Interfaces</b>
// </div>
// <br/>
// <div style="text-align:center;">Dr. Kyrill Schmid</div>
// <br/>
// <!-- 05 Interfaces.java -->
// <!-- slides/module_111_classes/topic_300_interfaces.java -->


// %% [markdown] lang="en" tags=["slide"] slideshow={"slide_type": "slide"}
//
// ## Motivation
//
// - Inheritance in Java is limited (no multiple inheritance).
// - Interface allow to separate specification and implementation
//      - Interfaces: specify what (not how)

// %% tags=["keep", "slide"] slideshow={"slide_type": "slide"}
public interface MathOperation {
    int calculate(int a, int b);
}

// %%
class Addition implements MathOperation {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

// %% tags=["keep", "slide"] slideshow={"slide_type": "slide"}
class Subtration implements MathOperation {
    @Override 
    public int calculate(int a, int b){
        return a - b;
    }
}

// %% tags=["keep"]
class Multiplication implements MathOperation {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Dynamic binding
// - Dynamic binding allows us to use the underlying type
// - At runtime the correct method is selected

// %%
MathOperation operation = new Addition();

// %%
operation.calculate(1, 2);

// %%
MathOperation operation2 = new Subtraction();

// %%
operation2.calculate(1, 2);

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Tagging Interfaces
// - Tagging interfaces are often empty interfaces that are extended by other interfaces
// - Tag relationships between classes

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// Example:
// EventListener is extended by many other interfaces (MouseListener, KeyListener, etc.)
// ```java
// EventListener listener = new MouseListener() {
//     ...
// };
// ```

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// ## Mini-Workshop: Zoo
// - Create an interface `Animal` with the following methods:
//   - `eat()`
//   - `getName()`
//   - `makeNoise()`
// - Create a class `Lion` that implements `Animal`
// - Create a class `Zebra` that implements `Animal`
// - Create a class `Fish` that implements `Animal`
// - Create a class `Zoo` with the following properties:
//   - An array of Animal objects
//   - A method `sayHello()` that uses the `makeNoise` for all animals

// %%
interface Animal {
    void eat();
    void sleep();
    void makeNoise();
}

class Lion implements Animal {
    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping");
    }

    @Override
    public void makeNoise() {
        System.out.println("Roar");
    }

}

class Zebra implements Animal {
    @Override
    public void eat() {
        System.out.println("Zebra is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Zebra is sleeping");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}

class Fish implements Animal {
    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Fish is sleeping");
    }

    @Override
    public void makeNoise() {
        System.out.println("Blub");
    }
}

// %%
class Zoo {
    Animal[] animals = new Animal[10];
    int animalCount = 0;
    void sayHello() {
        for (Animal animal : animals) {
            if (animal != null) {
                animal.makeNoise();
                }
            }            
        }

    void addAnimal(Animal animal) {
        animals[animalCount++] = animal;
    }
}

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// - Create a Zoo with some Animal objects

// %%
Zoo zoo = new Zoo();

// %%
zoo.addAnimal(new Lion());
zoo.addAnimal(new Zebra());
zoo.addAnimal(new Fish());

// %%
zoo.sayHello();

// %% [markdown] lang="en" tags=["subslide"] slideshow={"slide_type": "subslide"}
// - What problems can you identify with this example?

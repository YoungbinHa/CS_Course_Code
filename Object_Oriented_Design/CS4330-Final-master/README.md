# CS4330-Final
## Youngbin Ha
work by myself without team members.

Compared Kotlin and Swift
------
1. **Language purpose/genesis**

Kotlin:

 Kotlin is General Purpose Language that can run on the JVM, or being transpiled to JavaScript (with native compilation in the making). It means it can be used to write all sort of applications and those applications can run wherever we have a JVM (so basically everywhere) and even in the browser. It permits to developers to write understandable code easily. It supports data classes, lambdas, functional programming and object-oriented programming.

Swift:

Swift is a general-purpose, multi-paradigm, compiled programming language developed by Apple Inc. It is friendly to new programmers. It’s an industrial-quality programming language that’s as expressive and enjoyable as a scripting language. Writing Swift code in a playground lets you experiment with code and see the results immediately, without the overhead of building and running an app.

------
2. **Unique features of the language**

Kotlin:

 Extension functions are a great feature, which originally appeared in C#, and a feature that’s currently missing in Java. Kotlin has extension functions and allow us to add behavior to a class without directly extending it.
In Kotlin, those would be two parameter functions, which can be stored in variables for later use, or created inside another function.
In Kotlin, immutable values are preferred whenever possible, but type system distinguishes between mutable and immutable views over collections. If a variable is mutable, it can be changed by any thread and multiple sources that can access it.
 
Swift:

It has a simple yet familiar syntax. Many of the boilerplates are gone. That message passing interface is changed to function calls with C-syntax.
Has built-in support for Optional and will prevent nil pointer dereference in most cases.
You can match anything in Switch/Case clauses.
Functions and closures are first-class types: Functions and Closures
Pattern matching and enum cases (something very similar to "case classes" in Scala).
Extensions to existing types. I found it very similar to Scala implicit classes: Protocols and Extensions
It supports generics with requirements (i.e., C++ concepts). It's a shame C++ concepts are not there yet.
It has subscripts, that basically overrides the operator[]: Subscripts
There is no implicit type cast.
It has lazy properties.

------
3. **Name spaces**

Kotlin:

All the contents (such as classes and functions) of the source file are contained by the package declared. So, in the example above, the full name of baz() is foo.bar.baz, and the full name of Goo is foo.bar.Goo.
 
Swift:

Namespaces are not per-file; they're per-target (based on the "Product Module Name" build setting). So you'd end up with something like this import FrameworkA import FrameworkB FrameworkA.foo()
All Swift declarations are considered to be part of some module, so even when you say "NSLog" (yes, it still exists) you're getting what Swift thinks of as "Foundation.NSLog". 

------
4. **Types**

Kotlin:

In Kotlin, everything is an object in the sense that we can call member functions and properties on any variable. Some of the types can have a special internal representation - for example, numbers, characters and booleans can be represented as primitive values at runtime - but to the user they look like ordinary classes. In this section we describe the basic types used in Kotlin: numbers, characters, booleans, arrays, and strings.

Swift:

n Swift, there are two kinds of types: named types and compound types. A named type is a type that can be given a particular name when it’s defined. Named types include classes, structures, enumerations, and protocols. For example, instances of a user-defined class named MyClass have the type MyClass. In addition to user-defined named types, the Swift standard library defines many commonly used named types, including those that represent arrays, dictionaries, and optional values.

------
5. **Classes**

Kotlin:

The class declaration consists of the class name, the class header (specifying its type parameters, the primary constructor etc.) and the class body, surrounded by curly braces. Both the header and the body are optional; if the class has no body, curly braces can be omitted. Kotlin does not support deconstructing or de-initializing classes


Swift:

Classes and structures are general-purpose, flexible constructs that become the building blocks of your program’s code. You define properties and methods to add functionality to your classes and structures by using exactly the same syntax as for constants, variables, and functions.

Unlike other programming languages, Swift does not require you to create separate interface and implementation files for custom classes and structures. In Swift, you define a class or a structure in a single file, and the external interface to that class or structure is automatically made available for other code to use.

You write deinitializers with the deinit keyword. Deinitializers are only available on class types.

------
6. **Instance reference name in data type (class)**

Kotlin:

'This' keyword

Swift:

'Self' keyword

------
7. **Properties**

Kotlin:

Properties in swift are declared using the mutable keyword var or the read-only val

Swift:

Swift builds in getters, setters, as well as observers to properties.

if you remove the get keyword and just implement the logic inside curly braces, you'll have a read-only computed property

along with get and set, the observers willSet and didSet allow you to perform actions when the property is about to be changed and when it has been changed

------
8. **Interfaces / protocols**

Kotlin: 

'interface' keyword with implement like class ExampleClass : InterfaceOne, InterfaceTwo

Swfit: 

swift supports protocols like class. Any type that satisfies the requirements of a protocol is said to conform to that protocol.

------
9. **Inheritance / extension**

Kotlin: 

To declare a supertype on a class, place a colon and the supertype after the class header. Overriding Methods is done using the keyword 'override'. Overridable methods are similar to extendable classes in the fact that they have to be explicitly extendable with the keyword 'open' Overriding Properties works the same way as overriding methods.

Swift:

To declare a subtype on a class you can either append a colon and supertype after the class header, or add it as an extension later. Overriding methods and properties is done with the override keyword. Overriding properties is mostly usefull to implement your own getter/setter or observer. Calling the superclass is done with the super keyword

------
10. **Reflection**

Kotlin: 

Reflection is a set of language and library features that allows for introspecting the structure of your own program at runtime. Kotlin can do Class References, Bound Class References, Callable references, Function references, Property references, Interoperability with Java Reflection, Constructor references

Swift: 

Swift reflection allows us to look at objects' properties without modifying them. This concept is called a mirror. A mirror describes the parts that make up a particular instance, such as the instance’s stored properties, collection or tuple elements, or its active enumeration case. Mirrors also provide a “display style” property that suggests how this mirror might be rendered.

------
11. **Memory management**

Kotlin:

Kotlin does not implement memory management, but it has the architecture on which it's running to handle memory management and garbage collections.

Swift:

Swift uses automatic reference counting to deal with garbage collection.

------
12. **Comparisons of references and values**

Kotlin:

In Kotlin there are two types of equality:

Structural equality (a check for equals()).
Referential equality (two references point to the same object);


Swift:
```
Equal to (a == b)

Not equal to (a != b)

Greater than (a > b)

Less than (a < b)

Greater than or equal to (a >= b)

Less than or equal to (a <= b)
```
------
13. **Null/nil references**

Kotlin:

Kotlin does have a null value, but also implements several null safety features to help prevent the very common NullReferenceException error.

Kotlin's null safety revolves around the existence of nullable references (references that can hold null) and non-null references (references that cannot hold null)

Swift:

Swift uses nil

For handling nil you must use Optional Chaining. Optional chaining is a process for querying and calling properties, methods, and subscripts on an optional that might currently be nil. If the optional contains a value, the property, method, or subscript call succeeds; if the optional is nil, the property, method, or subscript call returns nil. Multiple queries can be chained together, and the entire chain fails gracefully if any link in the chain is nil.

------
14. **Errors and exception handling**

Kotlin:

All Exception Classes are children of the 'Throwable' class and include a message, stack trace and optional clause.

Exceptions are thrown using the 'throw' keyword or using a try-catch block

Swift:

Error handling in Swift resembles exception handling in other languages, with the use of the try, catch and throw keywords. Unlike exception handling in many languages—including Objective-C—error handling in Swift does not involve unwinding the call stack, a process that can be computationally expensive. As such, the performance characteristics of a throw statement are comparable to those of a return statement.

------
15. **Lambda expressions, closures, or functions as types**

Kotlin:

A higher order functions is one that takes a functions as a parameter or returns a functions as a result
As a higher order function it takes in a function/val of type T and calls the combine method on each memeber of the collection. Something that is only possible with the ability to pass and return functions.
Lamda functions are not named or declared but instead passed immediately as an expression. Lamba epressions are surrounded by {} brackets intantiated like so <maxValue("stuff", {a , b -> a.value > b.value})>
The function maxValue is a higher order functin that takes in two parameters, the first being the string "stuff", and the second being a function.

Swift:

In Swift, use term 'Closure' for Lambda expressions, 

Closures are self-contained blocks of functionality that can be passed around and used in your code. Closures in Swift are similar to blocks in C and Objective-C and to lambdas in other programming languages.

Closures can capture and store references to any constants and variables from the context in which they are defined. This is known as closing over those constants and variables. Swift handles all of the memory management of capturing for you.

------
16. **Implementation of listeners and event handlers**

Kotlin:

external interface EventListener (source)
Platform and version requirements: JS

Functions
```
handleEvent

abstract fun handleEvent(event: Event)
Inherited Functions
equals

open operator fun equals(other: Any?): Boolean
Indicates whether some other object is "equal to" this one. Implementations must fulfil the following requirements:
```
hashCode
```
open fun hashCode(): Int
Returns a hash code value for the object. The general contract of hashCode is:
```
toString
```
open fun toString(): String
Returns a string representation of the object.
```

Swift:

```
class Event<T> {

  typealias EventHandler = T -> ()

  private var eventHandlers = [EventHandler]()

  func addHandler(handler: EventHandler) {
    eventHandlers.append(handler)
  }

  func raise(data: T) {
    for handler in eventHandlers {
      handler(data)
    }
  }
}
```

The Event class has a generic parameter T which defines the type of data that this event conveys and the EventHandler typealias declares a function that accepts this type. The rest of this class is pretty straightforward, handlers are added to an array, with each being invoked when the event is raised.
```
let event = Event<Void>()
event.addHandler { println("Hello") }
event.addHandler { println("World") }
event.raise()
```
------
17. **Singleton**

Kotlin:

In Kotlin, the singleton pattern is used as a replacement for static members and fields that don’t exist in that programming language. A singleton is created by simply declaring an object. Contrary to a class, an object can’t have any constructor, but init blocks are allowed if some initialization code is needed.

Swift:

Swift introduced static properties and access control to the language. This opened up an alternative approach to implementing the singleton pattern in Swift. It's much cleaner and elegant than using a global variable. Accessing the singleton is intuitive and it clearly conveys that we're dealing with a singleton.


------
18. **Procedural programming**

Procedural programming is a programming paradigm, derived from structured programming, based upon the concept of the procedure call.

Kotlin:

Yes. Kotlin supports it.

Swift:

Yes. Swift supports it.

------
19. **Functional programming**

Kotlin:

Kotlin is kind of “enabling” this higher abstraction level paradigm just by adding some interesting built-in features. So if we wanted to achieve it, we could.

A good example of this could be again the collections API functions mentioned before. I.e: mapping a collection (or calling map() over it) means applying a mapping function to each one of its elements and returning a new collection containing all those. So there are 2 separated parts here:
```
Abstraction of mapping generic behavior, which is appliable over any collection. That would be the map high order function by itself.
Implementation details for the current execution are delegated to the function being passed as an argument.
```
Swift:

In terms of Swift, functional programming means using lets instead of vars when dealing with data. This has its benefits, mainly that functional code is less prone to bugs and easier to understand than imperative code. Imperative programming is the opposite of functional programming — it’s a paradigm that uses statements that change a program’s state.


------
20. **Multithreading**

Kotlin:

Kotlin has an extension function for creating Java Threads using the below API:
```
fun thread(
        start: Boolean = true, // If true, the thread is immediately started.
        isDaemon: Boolean = false, //  If true, the thread is created as a daemon thread.
        contextClassLoader: ClassLoader? = null, // The class loader to use for loading classes and resources in this thread.
        name: String? = null, // Name of the thread.
        priority: Int = -1, // Priority of the thread.
        block: () -> Unit // Block of code to run.
): Thread (source)
```
Such that a thread can be instantiated simply by:
```
thread() {
    println("${Thread.currentThread()} has run.")
}
```
Swift:
```
var note:Object

note.saveInBackground {  
    var alert = "Your note has been saved!"  
    alert.show()  
}
```
In the pseudo-code example above we’re creating a note object, which is saved in the background. When it has been saved the completion handler (a closure) is executed, showing an alert dialog to the user.

The saveInBackground() method will use some form of concurrency. The Cocoa Touch SDK has several options for concurrency, of which Grand Central Dispatch (GCD) is the most common.

------

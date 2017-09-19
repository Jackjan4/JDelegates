# JDelegates
C# delegates  in Java. Very simple and straight forward

# TODO
Making them easier to use by parsing paramters and class automatically

## Usage

Usage without return types:

```java

public class MyClass {

public void hello(String message)
{
  System.out.println(message + ". I got called by a delegate");
}

// ...
 
// Create a delegate by giving it "this", the method name and the parameter types
Delegate dele = new Delegate(this, "hello", String.class);

// Now you call the 'hello'-Method by invoking the delegate
dele.invoke("Hello World");

// output
"Hello World. I got called by a delegate"

}
```

Delegates also support return types. The example above with return types:

```java

public class MyClass {

public String hello(String message)
{
  return message + ". I got called by a delegate";
}

// ...
 
// Create a delegate by giving it "this", the method name and the parameter types
Delegate<String> dele = new Delegate<>(this, "hello", String.class);

// Now you call the 'hello'-Method by invoking the delegate
String s = dele.invoke("Hello World");

// return
"Hello World. I got called by a delegate"

}
```

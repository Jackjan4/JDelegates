# JDelegates
C# delegates  in Java. Very simple and straight forward


## Usage
```java

public class MyClass {

public void hello(String message)
{
  System.out.println(message + ". I got called by a delegate);
}

// ...
 
// Create a delegate by giving it the .class reference you are working in, the instance, the method name and the parameter types
Delegate dele = new Delegate(MyClass.class, this, "hello", String.class);

// Now you call the 'hello'-Method by invoking the delegate
dele.invoke("Hello World");

// output
"Hello World. I got called by a delegate"

}

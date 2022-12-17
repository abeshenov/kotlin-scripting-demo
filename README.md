# Kotlin JSR 223 Scripting Demo

This is an example of calling Kotlin from Java via the
[scripting API](https://docs.oracle.com/en/java/javase/14/scripting/index.html)
(JSR 223: Scripting for the Java Platform).


The dependencies are:

- `org.jetbrains.kotlin:kotlin-scripting-jsr223:1.7.22`
- `org.jetbrains.kotlin:kotlin-compiler-embeddable:1.7.22`


I used to have some issues with configuring the scripting engine,
possibly due to following old APIs or having wrong dependencies.
I share this tiny example with a working setup.

To try this in Docker:

```[shell]
sudo docker image build -t kotlin-jsr223-demo .
sudo docker run --rm kotlin-jsr223-demo
```

# Solutions for java-programming-i mooc.fi

This repository contains my solutions for the `Java Programming I` course offered at [mooc.fi](https://www.mooc.fi/en/). The course focuses on the basics of the Java programming language, including variables, conditional statements, loops, arrays, methods, and the basics of object-oriented programming.

## Purpose

The purpose of this repository is to document the code examples and solutions I've written during the course, and to provide a reference for other learners taking the course.

## How to Use

The files in the repository are organized according to the parts of the course and the exercises within those parts. Each directory contains code files with solutions to the exercises for that part.

```plaintext
java-programming-i-solutions/
├── part01
│   ├── part01-Part01_01.Sandbox
│   │   └── src
│   │       ├── java
│   │       ├── main
│   │       │   └── java
│   │       └── test
│   │           └── java
│   ├── part01-Part01_02.AdaLovelace
│   │   └── src
│   │       ├── java
│   │       ├── main
│   │       │   └── java
│   │       └── test
│   │           └── java
│   ├── part01-Part01_03.OnceUponATime
│   │   └── src
│   │       ├── java
│   │       ├── main
│   │       │   └── java
│   │       └── test
│   │           └── java
├── part02
│   ├── part02-Part02_01.Squared
│   │   └── src
│   │       ├── java
│   │       ├── main
│   │       │   └── java
│   │       └── test
│   │           └── java
│   ├── part02-Part02_02.SquareRootOfSum
│   │   └── src
│   │       ├── java
│   │       ├── main
│   │       │   └── java
│   │       └── test
│   │           └── java
│   ├── part02-Part02_03.AbsoluteValue
│   │   └── src
│   │       ├── java
│   │       ├── main
│   │       │   └── java
│   │       └── test
│   │           └── java
```

## Getting Started
To utilize these solutions, you need to have a Java development environment set up. You can start by installing the Java JDK and setting up your IDE (e.g., IntelliJ IDEA, Eclipse).

## Contributing
This repository was created for personal learning purposes and is not an official set of solutions. Contributions are welcome from others who discover better solutions or improvements to the code as they go through the course. Here's how you can contribute:

1. Fork the project.
2. Create your feature branch (```git checkout -b feature/AmazingFeature```).
3. Commit your changes (```git commit -m 'Add some AmazingFeature'```).
4. Push to the branch (```git push origin feature/AmazingFeature```).
5. Open a pull request.

## License
This project is licensed under the MIT License. For more details, see the LICENSE file.

## Disclaimer
These solutions are provided for educational purposes only. While it's fine to refer to these solutions as you work through the assignments, directly copying them may not be beneficial for your learning. Try to learn as much as possibleby working through the problems on your own.

## Caution

Some examples in this project use `e.printStackTrace()` for error tracking. However, this practice is not recommended in a real production environment. In actual applications, it is better to manage errors using a logging framework instead of `e.printStackTrace()`. For example, using a logging framework like Apache Log4j2 can allow for more systematic and efficient error management.

### Why should you not use `e.printStackTrace()`?

Using `e.printStackTrace()` directs error messages straight to the standard output (usually the console), making it difficult to appropriately manage error logs in a real operational environment. This can lead to security issues, as stack traces can reveal information about your application's internal structure, potentially exposing vulnerabilities to attackers. Additionally, it makes analyzing and monitoring error logs challenging.

### Alternative

Using a logging framework like Apache Log4j2 allows for detailed setting of log levels and easy redirection of logs to files or other destinations. This helps to organize the error management process more effectively.

Refer [to the documentation](https://logging.apache.org/log4j/2.x/) on how to add Log4j2 into your project.

Example:

```java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyClass {
    private static final Logger LOGGER = LogManager.getLogger();

    public void someMethod() {
        try {
            // code logic
        } catch (Exception e) {
            LOGGER.error("Ops!", e);
        }
    }
}


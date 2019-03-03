# NativeJDK9AppTemplate
Demo project that shows how to create native Java applications with small runtime images (App.exe + Runtime etc.).

Javapackager does not optimize for minimal runtime size. JLink on the other hand does not create native launchers (only launch scripts). This can be problematic, e.g., for app distribution to the Windows AppStore. Combining both commands results in optimal runtime images.

## Video tutorial

[<img src="https://img.youtube.com/vi/2fWyhJ2nhjw/0.jpg" width=300>](https://www.youtube.com/watch?v=2fWyhJ2nhjw)

## How to create the App Bundle

### Requirements

- Java 1.9 - 10 (12 coming soon)
- Internet connection (dependencies are downloaded automatically)
- IDE: [Gradle](http://www.gradle.org/) Plugin (not necessary for command line usage)

### IDE

Open the `NativeJDK9AppTemplate` [Gradle](http://www.gradle.org/) project in your favourite IDE (tested with NetBeans 8.2) and build it
by calling the `createFinalAppBundle` task.

### Command Line

Navigate to the [Gradle](http://www.gradle.org/) project (e.g., `path/to/NativeJDK9AppTemplate`) and enter the following command

#### Bash (Linux/OS X/Cygwin/other Unix-like shell)

    sh gradlew createFinalAppBundle
    
#### Windows (CMD)

    gradlew createFinalAppBundle

# NativeJDK9AppTemplate
Demo project that shows how to create native Java applications with small runtime images (App.exe + Runtime etc.)

## How to create the App Bundle

### Requirements

- Java >= 1.9
- Internet connection (dependencies are downloaded automatically)
- IDE: [Gradle](http://www.gradle.org/) Plugin (not necessary for command line usage)

### IDE

Open the `VCollections` [Gradle](http://www.gradle.org/) project in your favourite IDE (tested with NetBeans 8.2) and build it
by calling the `createFinalAppBundle` task.

### Command Line

Navigate to the [Gradle](http://www.gradle.org/) project (e.g., `path/to/VCollections`) and enter the following command

#### Bash (Linux/OS X/Cygwin/other Unix-like shell)

    sh gradlew createFinalAppBundle
    
#### Windows (CMD)

    gradlew createFinalAppBundle

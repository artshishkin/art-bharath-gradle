# art-bharath-gradle
Gradle for java developers - Tutorial from Bharath Thippireddy (Udemy)

####  Section 3: Gradle in action

#####  7. First Gradle Project

-  `gradle init`
    - 1 - basic
    - 1 - Groovy
-  `gradle tasks`    
-  add `firstTask` to build.gradle
-  `gradle tasks --all`
   -  will see `firstTask`
-  Execute task
   -  `gradle firstTask`
   -  **or** short form
   -  `gradle fT`
-  settings.gradle
   -  we can change rootProject.name = 'first-project'
-  run wrapper
   -  `./gradlew fT`
   
#####  9. Create a java project

1.  Create application
   -  `mkdir firstJavaProject`
   -  `cd firstJavaProject`
   -  `gradle init`
      -  2 - application
      -  3 - Java
      -  1: no - only one application project
      -  DSL - Groovy
      -  4 - JUnit Jupiter
      -  project name: default
      -  Source package: `net.shyshkin.study.bharath.gradle`
2.  View tasks
    -  `gradle tasks`
    -  `gradle tasks --all`
3.  Compile project
    -  `gradle compileJava`
4.  Clean
    -  `gradle clean`
5.  Run tests
    -  `gradle test`
    -  go to `build/reports/test` -> index.html
6.  Package app
    -  `gradle jar`
    -  go to `app/build/libs` -> `app.jar`
7.  Run application
    -  `gradle run`
    -  gradle takes main class from build.gradle/application
8.  Force gradle to rerun all the tasks
    -  by default gradle runs only tasks if change happens and only needed tasks
    -  to force rerun all tasks we need use flag `--rerun-tasks`
        -  `gradle --rerun-tasks build`

#####  10. Repositories

-  `<user_home>/.gradle/caches/modules-2/files-2.1/`

#####  11. Configurations

-  Maven: Scope ~ Gradle: Configuration
    
|Maven|Gradle|     
|---|---|
|compile|implementation, api (compile - deprecated)|
|provided|compileOnly|
|runtime|runtimeOnly|
|test|testImplementation, testCompileOnly, testRuntimeOnly|    

| Configuration|Examples |
|---|---|
| compileOnly| Dozer, Lombok, JMapper |
| runtimeOnly| logging-api (at compile), logging-impl (at runtime) |
| testCompileOnly| JUnit, Jasmine, Mockito |
| testRuntimeOnly| Jupiter, Jasmine Runtime |

#####  12. Build Phases

-  run `first-project> gradle fT`
    -  will see
    -  `> Configure project :`
-  Phases:
    -  Initialization
        -  Gradle figures out is it a
            -  Single Project
            -  **or**
            -  Multi-module project
        -  Create project objects for each module
    -  Configuration:
        -  Task1 -> Task2 -> Task3 -> Task4 -> ...
        -  Create DAG (Direct Acyclic Graph) - no cyclic relationship between tasks
    -  Execution:
        -  Compiled
        -  Tested
        -  War/Jar
-  modify `build.gradle`
-  run `first-project> gradle fT`

#####  13. Gradle Daemon

-  `gradle clean`
-  `gradle build --daemon` - starts daemon
-  `gradle build --no-daemon` - you do not want to use background daemon


####  Section 4: Groovy Crash Course

#####  16. Hello Groovy

-  [Groovy with Intellij](https://www.logicbig.com/tutorials/misc/groovy/intellij.html)
-  add JAXB dependencies if you are using Groovy 2.5.3 + Java 11
    -  Project Structure -> module `groovy-demo` -> Dependencies ->
    -  Attach Files or Directories -> `c:\Program Files (x86)\Groovy\lib\extras-jaxb\`

####  Section 5: Understanding the build.gradle

#####  24. project properties

-  [Project properties](https://docs.gradle.org/current/dsl/org.gradle.api.Project.html#N14D49)

#####  27. Task variables and methods

-  `gradle dTP`
```
> Task :deployToStage
Deployed to Stage

> Task :deployToProd
Deployed to Prod
```
-  executes dTS TOO because dTD depends on dTS 
-  Default tasks
    -  `defaultTasks "deployToStage"`
    -  `gradle`
    -  configuration happens and deployToStage task



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


This is an example project for using [Geb](http://geb.codehaus.org/ "Geb - Groovy Browser Automation")
with the [Cucumber-JVM](http://cukes.info/install-cucumber-jvm.html "Cucumber JVM") testing framework.

This example is a [Gradle](http://www.gradle.org/ "Gradle") project and uses the
[Gradle Cucumber Plugin](https://github.com/samueltbrown/gradle-cucumber-plugin/ "Gradle Cucumber Plugin").
The project has the [Gradle wrapper](http://www.gradle.org/docs/current/userguide/gradle_wrapper.html) installed,
so if you don't have Gradle installed you can execute the appropriate script in the project directory
and Gradle will be downloaded for you.

To run the tests, just run `gradle cucumber`. Run the local `gradlew`/`gradlew.bat` if you don't have
Gradle installed.

See the `src/test/resources/GebConfig.groovy` file for how to run the tests with different browsers.

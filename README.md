
# Table of Contents

1.  [Test Exercise for NEOLAB Internship](#org04e1198)
    1.  [To build application.](#orgf30108a)
    2.  [To run application.](#org9adc6a8)
    3.  [To test application.](#org6f95186)
    4.  [To create javadoc.](#org7dc778d)
    5.  [To create jar with all dependecies.](#orgb10cc87)


<a id="org04e1198"></a>

# Test Exercise for [NEOLAB Internship](https://internship.neolab.io/)

All examles are shown for \*nix, for Windows use `gradle.bat` instead of `gradlew`


<a id="orgf30108a"></a>

## To build application.

`$ gradlew build`

Results into `./bin/` directory as \*.class files


<a id="org9adc6a8"></a>

## To run application.

`$ gradle run`

But nothing happens, because App only creates class instances, no other logic.


<a id="org6f95186"></a>

## To test application.

`$ gradle test`

Here 3 test: `AppTest`, `StringProcessorTest`, `RomeNumberCreatorTest`

For tests used JUnit 4.

All tests passes successfully.


<a id="org7dc778d"></a>

## To create javadoc.

`$ gradlew Javadoc` 

Results into `./build/doc/javadoc/` directory


<a id="orgb10cc87"></a>

## To create jar with all dependecies.

`$ gradlew fatJar`

Results into `./build/libs/` directory


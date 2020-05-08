
# Table of Contents

1.  [Test Exercise for NEOLAB Internship](#org6c35399)
    1.  [To build application.](#orge34dba6)
    2.  [To run application.](#org3029940)
    3.  [To test application.](#org4cb9888)
    4.  [To create javadoc.](#org6971ac3)
    5.  [To create jar with all dependecies.](#orgb377279)


<a id="org6c35399"></a>

# Test Exercise for [NEOLAB Internship](https://internship.neolab.io/)

All examles are shown for \*nix, for Windows use `gradlew.bat` instead of `gradlew`


<a id="orge34dba6"></a>

## To build application.

`$ gradlew build`

Results into `./bin/` directory as \*.class files


<a id="org3029940"></a>

## To run application.

`$ gradle run`

But nothing happens, because App only creates class instances, no other logic.


<a id="org4cb9888"></a>

## To test application.

`$ gradle test`

Here 3 test: `AppTest`, `StringProcessorTest`, `RomeNumberCreatorTest`

For tests used JUnit 4.

All tests passes successfully.


<a id="org6971ac3"></a>

## To create javadoc.

`$ gradlew Javadoc` 

Results into `./build/doc/javadoc/` directory


<a id="orgb377279"></a>

## To create jar with all dependecies.

`$ gradlew fatJar`

Results into `./build/libs/` directory


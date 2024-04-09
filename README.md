# jcommander-test-run
Test to see if we can successfully use jcommander after installing on system

## Steps
### clone jcommander
`git clone https://github.com/cbeust/jcommander`
### follow the build instructions
`cd jcommander`
`./gradlew assemble`
### go to the location of the build (.jar file)
`cd build/libs`
### install file on local maven repository
`mvn install:install-file -Dfile=jcommander-1.84.jar -DgroupId=com.beust -DartifactId=jcommander -Dversion=1.84 -Dpackaging=jar`
### update jcommander-test-run pom.xml
add dependencies and build scripts, specifying the main class
### compile and package with mvn
`mvn clean package`
### run the jar file
#### parse username and password params
`java -jar target/jcommander-test-run-1.0-SNAPSHOT-jar-with-dependencies.jar -u <USERNAME> -p <PASSWORD>`
or
#### see usage
`java -jar target/jcommander-test-run-1.0-SNAPSHOT-jar-with-dependencies.jar -h`

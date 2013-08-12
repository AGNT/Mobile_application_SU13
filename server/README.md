Instructions
------------
To compile the server side of the Locate application,</br>

1. Grab the 4 source files of the server that are here 
``` 
https://github.com/AGNT/Mobile_application_SU13/tree/master/server/Project%20Netbeans/team2/src/java/target 
```

2. Open terminal and go to the directory where you copied the java source files.

3. To compile .java files to .class files use the following command
```
javac -d path/to/place/generated/files -cp .:path/to/glassfish4/glassfish/modules/\* *.java
```

4. To make the .war archive from the .class files use
```
jar cvfM path/to/glassfish4/glassfish/domains/domain1/autodeploy/myapp.war path/where/class/files/are
```

#!/bin/bash

pushd ~/projects/java/design_patterns_tutorial/ > /dev/null

# javac -d bin -sourcepath src src/com/patterns/helloworld/Test.java
# java -classpath bin com.patterns.helloworld.Test

javac -d bin -sourcepath src src/com/patterns/intro/Animal.java
javac -d bin -sourcepath src src/com/patterns/intro/Dog.java
javac -d bin -sourcepath src src/com/patterns/intro/Cat.java
javac -d bin -sourcepath src src/com/patterns/intro/WorkWithAnimals.java

javac -d bin -sourcepath src src/com/patterns/intro/Creature.java
javac -d bin -sourcepath src src/com/patterns/intro/Giraffe.java
javac -d bin -sourcepath src src/com/patterns/intro/Living.java
javac -d bin -sourcepath src src/com/patterns/intro/Monkey.java

# run
java -classpath bin com.patterns.intro.WorkWithAnimals

popd > /dev/null


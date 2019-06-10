#!/bin/bash

libPath=ROOT.jar

for jar in lib/*.jar
do 
  libPath=${libPath}:${jar}
done

java -cp ${libPath} com.mawen.SpringbootThinJarApplication

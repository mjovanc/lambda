#!/bin/bash

export CLASSPATH=".:/opt/homebrew/Cellar/antlr/4.13.1/antlr-4.13.1-complete.jar:$CLASSPATH"

mkdir -p output

# generate lexer and parser 
antlr -visitor -o output Lambda.g4

# compile java files into byte code
(cd output && javac -cp /opt/homebrew/Cellar/antlr/4.13.1/antlr-4.13.1-complete.jar *.java)

# run testrig
(cd output && java org.antlr.v4.gui.TestRig Lambda compilationUnit -gui)

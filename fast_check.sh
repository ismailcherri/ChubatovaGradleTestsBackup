#!/usr/bin/env bash
#gradle build --scan


function runInInternalBuilder() {
    #docker run python
    docker ps -a
    gradle test --stacktrace
}
function gradleInBuilder() {
    runInInternalBuilder 
    echo hi
    
}
set -e
gradleInBuilder

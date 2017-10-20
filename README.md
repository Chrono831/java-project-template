# Java Project Template

[![build status](http://gitlab01.valuecentric.com/dylan.hall/java-project-template/badges/master/build.svg)](http://gitlab01.valuecentric.com/dylan.hall/java-project-template/commits/master)

[![coverage report](http://gitlab01.valuecentric.com/dylan.hall/java-project-template/badges/master/coverage.svg)](http://gitlab01.valuecentric.com/dylan.hall/java-project-template/commits/master)

## Prerequisites

* java 1.8
* maven

## Intended Usage

* Create your new gitlab project
* Clone your project
* Download this code into your project root
* Commit & Push
* Setup IDE / Maven
* Build & Validate
* In gitlab, go to Settings > Repository > Protected Branch > master, set "Allowed to push" to "No one"
* Start Doing Your Work

## Intellij Setup

When working in intellij use the following build configurations to be able to package and test from intellij

1. Go to "Run" -> "Edit Configurations"
2. Click the plus button, then "Maven"
    1. Change the name to "mvn test"
    2. In the command line box type "test"
    3. Click apply.
3. Repeat step 2 
    1. Change the name to "mvn package"
    2. In the command line box type "package"
    3. Click apply.
4. Repeat step 2 
    1. Change the name to "mvn clean"
    2. In the command line box type "clean install -U"
    3. Click apply.

For any other goals follow this pattern. I.e. for coverage you would put 'cobertura:cobertura' in the command line box.

## To Build

On command line run:

`mvn package`

This will produce a jar in the `target` directory

## To Run tests

On command line run:

`mvn test`

Open target/sunfire-reports/index.html in a browser to view a more detailed reports on failures/skips

### Tests with coverage:

`mvn cobertura:cobertura`

Then open target/site/cobertura/index.html in a browser to view report
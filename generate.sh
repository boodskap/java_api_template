#!/bin/bash
rm -rf generated/*
mvn -f pom-gen.xml clean generate-sources
mkdir generated/impl
cp -Ra generated/src/main/java/twinned/digital/service/base/api/impl/*.java generated/impl/
mvn clean install

name := "rdf2-di-impl-core"

description := "Rough Diamond Framework DI Container implimentation by JDK Core"

organization := "jp.rough_diamond"

version := "2.0.1"

scalaVersion := "2.9.1"

libraryDependencies +=  "jp.rough_diamond"      %%  "rdf2-di"           % "2.0.1"

libraryDependencies +=  "org.slf4j"             %   "jcl-over-slf4j"    % "1.6.2"

libraryDependencies +=  "junit"                 %   "junit"             % "4.10"    % "test"

seq(rdf.settings : _*)

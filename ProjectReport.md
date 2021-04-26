# Project Report

Andrew Maupin



## Challenge #1 Complete

#I change a line of code in the QueryEngineModule. I changed FakeQueryEngine to WikipediaQueryEngine


## Challenge #2 Complete

#Following the instructions, I created a new class called RevisionFormatterAlt. I also created an interface to go with the revisionformatteralt. 

## Challenge #3 Complete

#I created a string that would get rid of the for loop and collect to get all the strings

## Reflection Question #1: Functional vs OO

(Write one or more paragraphs comparing and contrasting the iterative and functional  
approaches to string concatenation you explored in challenge #3. Which do you
prefer, and why?)

#I prefer the functional approach more because it is easier to spot errors and fix them.

## Reflection Question #2: Polymorphism and Dependency Inversion

(Explain how polymorphism engendered dependency inversion in this little
application. Be clear and precise here, as this is, in part, an assessment of
your correct use of technical terminology.
Consider, for example, where exactly is polymorphism used?
Where exactly is a dependency inverted?)

#Polymorphism is used in this from the modules that create interfaces like RevisionFormatterAlt and WikipediaQueryEngine. 
#Dependency is inverted in the WikipediaAnalyzer where guice is injected.
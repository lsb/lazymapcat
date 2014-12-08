# Introduction to lazymapcat

A slightly nicer version of the [original lazy mapcat from two years ago][http://clojurian.blogspot.com/2012/11/beware-of-mapcat.html] committed to clojars.

There is one test for correctness, one test for laziness, and one test for the continued strictness of mapcat. When the third test starts failing (when the mapcat that ships with the system starts being sufficiently lazy), please use the mapcat in the standard lib
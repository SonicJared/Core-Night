# A Makefile for GCD.c

Spirit: Spirit.java
	echo Main-class: Spirit > Manifest
	jar cvfm Spirit Manifest Spirit.class
	rm Manifest
	chmod u+x Spirit


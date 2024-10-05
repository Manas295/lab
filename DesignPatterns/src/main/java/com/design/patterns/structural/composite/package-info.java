package com.design.patterns.structural.composite;

/*
	Visualization
	Here’s a visual representation of the file system structure:


	Copy
dir2
├── file2.txt
└── dir1
    └── file1.txt
	Explanation
	File (Leaf): Represents individual files and implements the FileSystemComponent interface.
	
	Directory (Composite): Represents directories containing files and other directories. 
	It implements the FileSystemComponent interface and manages its child components.
	
	CompositePatternDemo: Demonstrates how to use the composite pattern by creating a file system structure and displaying its details.
*/

/*

	Composite Design Pattern Explanation
		The Composite Design Pattern is all about treating individual objects and compositions of objects uniformly. 
		This is particularly useful when you have objects that form a tree-like structure, 
		such as files and directories in a file system. Let’s break down the example we discussed:

	Components
		Component Interface (FileSystemComponent):This is a common interface for all objects in the composition.

		In our example, FileSystemComponent is the interface that both files and directories implement.

	Leaf Objects (File):These are individual objects in the composition.

	In our case, File represents an individual file and implements the FileSystemComponent interface.

	Methods in the File class provide the basic operations (like showDetails()).

	Composite Objects (Directory):

	These are composed of leaf objects and possibly other composite objects.

	In our example, Directory represents a directory that can contain files and other directories.

	The Directory class maintains a list of FileSystemComponent objects, and 
	its methods (like showDetails()) iterate over this list to perform operations on its children.
*/
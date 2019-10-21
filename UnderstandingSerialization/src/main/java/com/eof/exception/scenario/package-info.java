package com.eof.exception.scenario;


/*During deserialization process when file is read till end using readObject() in while loop then EOFException 
is thrown as we saw in DeSerialization program. Java Api doesn’t provide any elegant solution to signify end the file. 
Generally what we could except at EOF(end of file) is null but that doesn’t happen.


So, we’ll try to address the problem because catching EOFException and interpreting it as 
EOF is not the elegant solution because sometimes you may fail to detect a normal EOF of a file that has been truncated.

*/


/**************SOLUTION******************/
/*
I’ll recommend you this solution, probably the best solution 

Create a class EofIndicatorClass which implements Serializable interface.
During serialization >

Write instance of EofIndicatorClass at EOF during serialization to indicate EOF during deSerialization process.
During serialization >

If oin.readObject() returns instanceof EofIndicatorClass that means 
it's EOF, exit while loop and EOFException will not be thrown.
*/
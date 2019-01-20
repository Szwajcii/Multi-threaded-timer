### Multi-threaded-timer

**Task** 

Write a Java console application with which you can start multiple timers. Timers run independently of each other and measure time in second (no need to be super precise).

**Features**

User can: 
```
Start timers and give them a Name.
Stop a timer by Name.
Check a timer by Name or all timers (without a Name).
```

Starting a timer creates a new thread which increments a counter to keep track of elapsed seconds. Starting an already stopped timer restarts it.

Stopping a timer interrupts the thread created when the timer was started effectively stopping the timer (the counter won't be incremented anymore). Timer threads should check/handle and react accordingly for interrupts while they execute.

Checking a timer prints information about the timer itself: it's name, it's thread ID and the elapsed seconds. Users can check timers that are already stopped.

**Requirements**

```
Use Thread s or Runnable s.
Use interrupt.
```

### Built with:
1. Maven - Dependency Management


### Tools:
1. IntelliJ IDEA


### Author: 
- Damian Szwajkos [Github profile](https://github.com/Szwajcii)

### More info:
Project made for Codecool programming course.

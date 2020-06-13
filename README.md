# Stop Watch
A java library that provides thread safe implimentation of stop watch

### Usage of stop watch

```java
IStopWatch stopWatch = StopWatch.create();
stopWatch.id(); // id of watch
stopWatch.start(); //Start a watch
stopWatch.elapsedMillis(); // Time elapsed till now

// Pause and Start
stopWatch.pause();
stopWatch.start();

stopWatch.restart(); // Restart a watch

stopWatch.stop(); // Stop a watch
```

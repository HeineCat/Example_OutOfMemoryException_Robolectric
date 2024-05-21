The unit tests in this project cause an OutOfMemory exception (./gradlew test).
The error only occurs if the robolectric version is >= 4.10.

Output:

```
> Task :app:testDebugUnitTest


Exception: java.lang.OutOfMemoryError thrown from the UncaughtExceptionHandler in thread "SDK 19 Main Thread"
*** java.lang.instrument ASSERTION FAILED ***: "!errorOutstanding" with message can't create name string at s\src\java.instrument\share\native\libinstrument\JPLISAgent.c line: 830

> Task :app:testDebugUnitTest

com.example.myapplication.ExampleUnitTest > dummyBugTest FAILED
    java.lang.OutOfMemoryError

1 test completed, 1 failed
```
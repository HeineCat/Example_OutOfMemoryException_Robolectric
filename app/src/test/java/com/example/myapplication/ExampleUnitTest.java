package com.example.myapplication;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.io.IOException;
import java.io.InputStream;

@RunWith(RobolectricTestRunner.class)
public class ExampleUnitTest {

    /**
     * Out of memory exception
     *
     * @throws IOException
     */
    @Test
    public void dummyBugTest() throws IOException {
        final MyInputStream mockMyInputStream = mock(MyInputStream.class);
        final InputStream mockInputStream = mock(InputStream.class);
        BugClass bugClass = new BugClass(mockMyInputStream);
        when(mockMyInputStream.getInputStream()).thenReturn(mockInputStream);
        Assert.assertNotNull(bugClass.doSomething());
    }
}
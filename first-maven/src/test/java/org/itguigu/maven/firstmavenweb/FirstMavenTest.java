package org.itguigu.maven.firstmavenweb;

import org.junit.Test;

public class FirstMavenTest {
    @Test
    public void testFirstMaven() {
        FirstMaven fm = new FirstMaven();
        String maven = fm.sayHello("Maven");
        System.out.println(maven);
    }
}

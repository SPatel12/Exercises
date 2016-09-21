
import junit.framework.Test
import junit.framework.TestCase
import junit.textui.TestRunner
import lesson2test.Lesson2


class AllTests {
    static Test suite() {
        def alltest
        alltest = new GroovyTestSuite()
        alltest.addTestSuite(Lesson2.class as Class<? extends TestCase>)
  //      alltest.addTestSuite(Lesson2)


        return alltest
    }
}

 //   TestRunner.run( AllTests.suite())

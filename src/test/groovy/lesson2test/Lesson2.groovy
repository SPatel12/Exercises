package lesson2test

import lesson2.InputStr
import org.junit.Rule
import spock.lang.Narrative
import spock.lang.Unroll
import uk.org.lidalia.test.SystemOutputRule


@Narrative('''
Feature: Create a program that prompts for an input string and displays output that shows the input string and number of characters the string contains.

Acceptance Criteria:
Given: Input a string
When: Print input string
Then: Print number characters of the strings
Then: Print both results in single line
Expect: Add Validation for empty input
''')

class Lesson2 extends GroovyTestSuite {

    @Rule
    SystemOutputRule con = new SystemOutputRule()
    InputStr sp = new InputStr()


    def "one test"() {

        when:
        sp.run('name')

        then:
        con.systemOut == 'name has 4'

    }
    @Unroll
    def "many test"(){

        given:
        sp.run(text)

        expect:
        con.systemOut == expected

        where:

        text || expected
        'James' || 'James has 5'
        'mike' || 'mike has 4'
    }
}





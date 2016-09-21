package lesson47test

import lesson47.api
import spock.lang.Narrative
import spock.lang.Specification


@Narrative('''
Feature: Create a program that pulls in data and displays the information from this api in a tabular format

Acceptance Criteria:

Given: We have an open api
When: check if api available
And: Request for data
Then: Display information in tabular format

''')

class Lesson47test extends Specification {

     def res = new api()

    def "Check api available"() {

        when: "To check the open api is present"
        res.run()

        assert res.status == 200

        then: "request for data"
        print("Status confirmed: " + res.status)

    }

    def "Display info"(){
        expect:
        assert res.people[0].name == "Anatoly Ivanishin"
        assert res.people[1].name == "Takuya Onishi"
        assert res.people[2].name == "Kate Rubins"
        assert res.people[0].craft == "ISS"



    }
}
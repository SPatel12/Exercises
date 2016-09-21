package lesson47

import groovy.json.JsonSlurper
import groovyx.net.http.ContentType
import groovyx.net.http.HTTPBuilder
import jodd.http.HttpRequest
import jodd.http.HttpResponse

import javax.ws.rs.POST

class api {


    public static def status
    public static def people

    public static void run() {

        String URL = 'http://api.open-notify.org/astros.json'
        def httpRequest = HttpRequest.get(URL)
        HttpResponse response = httpRequest.send()
        def json = new JsonSlurper().parseText(response.body())
        people = json.people
        status = response.statusCode()


            if (status == 200) {
                response.body()

                println("People in SPACE...")
                println("----------------------------------")
                printf("%-18s %-5s %-5s\n", "Name", "||", "Craft")
                println("----------------------------------")
                people.each { pe ->
                    printf("%-18s %-5s %-5s\n", "${pe.name}", "||", "${pe.craft}")
                }
            } else {
                "Status: " + response.statusCode()
            }




    }
        }

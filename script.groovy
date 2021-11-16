import groovy.json.JsonSlurperClassic



def getEnv(environment) {

    hosts = sh(script: "cat hosts.json", returnStdout: true).toString().trim()

    def servers = new JsonSlurperClassic().parseText(hosts)

    return servers[environment]

}
def gv

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage("init") {
            steps{
                script {
                    gv = load "script.groovy"
                    gv.initApp()
                }
            }
        }
        stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test") {
            steps {
                when {
                    expression {
                        params.executeTests
                    }
                }
                script {
                    gv.testApp()
                }
            }
        }
        stage("deploying") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
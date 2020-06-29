pipeline {

    agent any 

    stages {
        stage('Build') { 
            steps {
                echo("Building Stage")
            }
        }
        stage('Test') { 
            steps {
                echo("test phase")
				sh cd /Rechner/src/test/java/example/org/tests/
				sh javac RechnerTest.java
				sh java RechnerTest
            }
        }
        stage('Deploy') { 
            steps {
                echo("Deploying Stage") 
            }
        }
    }
}
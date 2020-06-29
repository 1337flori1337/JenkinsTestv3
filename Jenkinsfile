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
				cd /Rechner/src/test/java/example/org/tests/
				javac RechnerTest.java
				java RechnerTest
            }
        }
        stage('Deploy') { 
            steps {
                echo("Deploying Stage") 
            }
        }
    }
}
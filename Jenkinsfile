pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
	stage('JUnit Test') {
	    steps {
		  echo 'junit'
            }
	}
     
	 stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

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
		sh 'cd /var/lib/jenkins/workspace/pipe/'
		sh 'mvn surefire-report:report -DouputFile=junitreport.html'
            }
        }
	stage('JUnit Test') {
	    steps {
		  echo 'junit'
		  publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'target/site/', reportFiles: 'surefire-report.html', reportName: 'HTML Report', reportTitles: ''])
            }
	}
	    stage('SonarQube') {
		    steps {
			    def mvnHome = tool name: 'maven-3', type: 'maven'
		    withSonarQubeEnv('sonar') {
			    sh "${mvnHome}/bin/mvn sonar:sonar"
		    }
		    }
	    }
	 stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

pipeline {
    agent any

    stages{

        stage('Init'){
            steps{
                echo 'Inside Init step'
            }
        }

        stage('[DEV]'){

             steps{
                     println('Call Ansible Tower for Deployment')
             }

        }

        stage('[QA]'){
            steps{
                echo 'Doing QA deployment'
            }
         }
}

post {

        failure{
              echo 'Executing failure post'
        }

        success{
             echo 'Executing Success post'
        }

        always{
            echo 'Executing Always post'
         }
    }
}





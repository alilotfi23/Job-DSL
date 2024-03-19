pipeline {
    agent any

    stages {
        stage('Say Hello') {
            steps {
                echo 'Hello Backend Team!'
            }
        }
    }
}

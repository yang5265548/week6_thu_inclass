pipeline{
    agent any
    stages{
      stage('checking'){
        steps{
          git branch:'main',url:'https://github.com/yang5265548/week6_thu_inclass.git'
        }
      }
      stage('build'){
        steps{
          bat 'mvn clean install'
        }
      }
    }
}

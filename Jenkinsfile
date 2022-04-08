#!/usr/bin/env groovy
@Library(['piper-lib', 'piper-lib-os']) _

def loadProperties() {
    node {
        checkout scm
        properties = readProperties file: 'config.properties'
        echo "Immediate one ${cpi.url}"
    }
}
 node('master') 
 {
     
     
           stage('Test') 
           {
            loadProperties()
            echo "Later one ${cpi.url}"
           
            sh '''
               
            '''
           }
        

            

      
  }



#!/usr/bin/env groovy
@Library(['piper-lib', 'piper-lib-os']) _


 node('master') 
 {
     
     
           properties = readProperties file: 'config.properties'
           echo "Running build ${JOB_NAME} # ${BUILD_NUMBER} on url ${properties.cpiurl} "
        

            

      
  }



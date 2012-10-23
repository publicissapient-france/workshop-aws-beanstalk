workshop-aws-beanstalk
======================

TODO:

Documentation jekyll based

=======

Tech Event Beanstalk

-> Créer 2 applications (prod/qa)
-> Deployment PRD
	-> Deploy new version on UAT for testing
	-> Validation of new version
	-> Swap envt URL PRD/UAT (Envt ISO)
-> Edit configuration
	-> Variable d'environnement (Datasource/user/pswd)
	-> CreateEnvironmentRequest (AWS API)
-> Monitoring (accesslog)
	-> SSH conection on Tomcat instance
	-> Enable logfile rotation (logrotate)
-> Création à partir de CloudFormation
	-> JSON -> Teamplate

#0 Configuration d'une Base de données mutualisée
	-> Déclaration de la datasource avec les variables d'environnements


#1 Création de l'application avec l'interface
#2 Création à partir du SDK
#3 Switch UAT/PRD
#4 Monitoring

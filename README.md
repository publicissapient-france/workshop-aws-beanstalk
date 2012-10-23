workshop-aws-beanstalk
======================

Tech Event Beanstalk

=======

TASKS:

- Pusher la web-app Petclinic CloudBees sur le repository (JLR)
- Envoyer PDF Continuous Delivery (JLR)
- Création de la branche Jekyll (EBR)
- Relancer Amazon pour l'atelier (JLR)
- Génération des comptes (EBR)

=======

GUIDELINE:

- Display workshop schedule at the beginning
- Teasing for Blue/Green deployment/continuous delivery principles
- Step by step (tutorial-like)

=======

WORKSHOP STEPS:

#0 Workshop environment set-up (JLR)
 - Git (GitHub client)
 - Amazon account
 - Wiki page generation (with Jekyll)

#1 Deploy a webapp (pet-clinic) (JBC)
 - Configure and deploy from UI
 - Set-up environment properties (VAR_1, VAR_2)
 - Using of "server.xml" in a AWS dedicated folder

#2 Utilisation du SDK (GEG)
 - SDK
 - Advanced set-up avancé (Datasource)
 - Infra as Code (stand-by)

#3 CloudFormation (EBR)
 - Export JSON
 - Create/edit Template

#4 Blue/Green Deployment (JLR)
 - Create 2 ISO-environments (QA/PROD)
 - URL switch

#5 Monitoring & Elasticité (?)
 - ELB Monitoring
 - Stress test with Gatling (elastic cloud)

@echo ###############################################################
@echo # deploying
@echo ###############################################################
@echo .
@call %~dp0\config.cmd

@pushd %PROJECT_DIR%

@start mvn clean install org.wildfly.plugins:wildfly-maven-plugin:1.0.2.Final:deploy

@popd
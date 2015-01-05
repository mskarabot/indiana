@echo ###############################################################
@echo # Starting Wildfly 8.2
@echo ###############################################################
@echo .
@call %~dp0\config.cmd

@start %WILDFLY_HOME%\bin\standalone.bat


@echo ###############################################################
@echo # Starting Postgresql DB
@echo ###############################################################
@echo .
@call %~dp0\config.cmd

@start %PG_HOME%\bin\postgres


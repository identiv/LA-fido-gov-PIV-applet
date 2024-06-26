@ECHO OFF

REM *********************************************************************
REM This value MUST be defined if JAVA_HOME is not already set correctly.
REM *********************************************************************
REM SET JDK="C:\jdk\jdk-1.8"
REM SET JAVA_HOME="C:\jdk\jdk-1.8"

SET JDK="c:\JavaCardKit2024\SDK\Tools\jdk"
SET JAVA_HOME="c:\JavaCardKit2024\SDK\Tools\jdk"

ECHO Setting environment variables
SETLOCAL ENABLEEXTENSIONS


IF DEFINED JAVA_HOME (
	ECHO JAVA_HOME already set to "%JAVA_HOME%"
) ELSE (
	IF NOT EXIST %JDK% (
		ECHO The JDK path %JDK% does not exist, aborting.
		GOTO END
	)
	SET JAVA_HOME=%JDK%
	ECHO JAVA_HOME set to %JDK%
)

IF DEFINED ANT_HOME (
	ECHO ANT_HOME already set to "%ANT_HOME%"
) ELSE (
	SET ANT_HOME=..\tools\ant
)

SET PATH=%PATH%;%ANT_HOME%\bin

ant %1

:END

ENDLOCAL


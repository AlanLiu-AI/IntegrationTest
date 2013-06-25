@rem To run this batch code generation file, you need setup metro 2.2 to relative path "..\..\..\install\metro", it can be download from http://metro.java.net/2.2/

IF DEFINED JAVA_HOME (
	ECHO JAVA_HOME: %JAVA_HOME%
) else (
	ECHO JAVA_HOME is not defined!
	GOTO END
)

IF DEFINED METRO_HOME (
	IF NOT EXIST %METRO_HOME%\lib\webservices-tools.jar (
		ECHO Cannot find file '%METRO_HOME%\lib\webservices-tools.jar'!
		GOT END
	)
	ECHO METRO_HOME: %METRO_HOME%
) else (
	ECHO METRO_HOME is not defined!
	GOTO END
)

SET JAVA="%JAVA_HOME%\bin\java"
%JAVA% %WSIMPORT_OPTS% -jar "%METRO_HOME%\lib\webservices-tools.jar" -extension -keep -Xnocompile -b AqAcquisitionService.xml -p com.aquarius.DataAcquisition http://aq-demo-server/AQUARIUS/AqAcquisitionService.svc?wsdl
%JAVA% %WSIMPORT_OPTS% -jar "%METRO_HOME%\lib\webservices-tools.jar" -extension -keep -Xnocompile -b AqPublishService.xml -p com.aquarius.Publish http://aq-demo-server/AQUARIUS/Publish/AquariusPublishService.svc?wsdl


:END


set projectLocation=F:\SeleniumTestAutomation
 
cd %projectLocation%
 
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
 
java org.testng.TestNG %projectLocation%\gis.xml
 
pause
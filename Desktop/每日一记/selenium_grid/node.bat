node�����½�node.bat��
echo ��������selenium-server-standalone-2.40.0.jar��
java -Dwebdriver.chrome.driver="C:\\chromedriver.exe" -Dwebdriver.ie.driver = "C:\\IEDriverServer-x64.exe" -jar C:\\libs\\selenium-server-standalone-2.40.0.jar -nodeConfig node.json -hub http://hub��
IP��4444/grid/register
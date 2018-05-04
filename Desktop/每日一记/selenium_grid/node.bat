node机上新建node.bat：
echo 主机运行selenium-server-standalone-2.40.0.jar包
java -Dwebdriver.chrome.driver="C:\\chromedriver.exe" -Dwebdriver.ie.driver = "C:\\IEDriverServer-x64.exe" -jar C:\\libs\\selenium-server-standalone-2.40.0.jar -nodeConfig node.json -hub http://hub机
IP：4444/grid/register
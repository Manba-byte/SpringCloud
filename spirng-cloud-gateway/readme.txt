1.安装crul命令行
CURL_HOME:CURL_HOME 配置path环境变量%CURL_HOME%\I386
2.关于crul乱码解决
安装iconv  , 
配置path环境变量：D:\iconv\GnuWin32\bin; 
在使用crul命令时加上 | iconv -f utf-8 -t gbk
示例：crul www.baidu.com | iconv -f utf-8 -t gbk

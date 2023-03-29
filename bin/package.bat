<<<<<<< HEAD
@echo off
echo.
echo [信息] 打包Web工程，生成war/jar包文件。
echo.

%~d0
cd %~dp0

cd ..
call mvn clean package -Dmaven.test.skip=true

=======
@echo off
echo.
echo [信息] 安装Web工程，生成node_modules文件。
echo.

%~d0
cd %~dp0

cd ..
npm install --registry=https://registry.npmmirror.com

>>>>>>> 12cfc7c (zx鎻愪氦)
pause
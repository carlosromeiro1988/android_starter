@echo off
setlocal enableDelayedExpansion

:main
cd ..
call gradlew.bat testEnglishDebugUnitTestCoverage
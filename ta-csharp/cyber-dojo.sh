NUNIT_PATH=/nunit/lib/net45
export MONO_PATH=${NUNIT_PATH}

set -e
[ -f report.xml ] && rm report.xml
export RELIABLE_CONNECTION
export VOLATILE_STATS_DATA
export FAKE_INITIALISATION_DATA #="19,123456.78;22,123456.78;57,123456.78"


mcs -t:exe \
  -r:${NUNIT_PATH}/nunit.framework.dll \
  -out:ShoutyReportJob.exe *.cs

mcs -t:library \
  -r:${NUNIT_PATH}/nunit.framework.dll \
  -out:RunTests.dll *.cs

if [ $? -eq 0 ]; then
  NUNIT_RUNNERS_PATH=/nunit/tools
  mono ${NUNIT_RUNNERS_PATH}/nunit3-console.exe --noheader ./RunTests.dll
fi

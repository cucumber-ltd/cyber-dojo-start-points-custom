NODE_VERSION=8.4.0

echo JASMINE TESTS
echo =============

n use ${NODE_VERSION} /usr/local/lib/node_modules/jasmine/bin/jasmine \
  JASMINE_CONFIG_PATH=tests/jasmine.json

# You have to cd to a specific folder because
#   ~/node_modules/cucumber/bin/cucumber-js
# contains the line
# require('../lib/cli/run.js').default();
# Go figure!

cd ~/node_modules/cucumber/bin

export NODE_PATH=/home/cucumber/node_modules

echo 
echo CUCUMBER FEATURES
echo =================

./cucumber-js \
  --format-options '{"colorsEnabled":false}' \
  --format-options '{"snippetInterface":"synchronous"}' \
  ${CYBER_DOJO_SANDBOX}/features/*.feature

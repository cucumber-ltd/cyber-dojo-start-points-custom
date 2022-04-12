rspec . --format progress

# The -r option has to be specified for each named file
REQUIRES=""
for file in *_steps.rb; do
  REQUIRES+=" -r ${file}"
done

# Test output can be formatted as progress or documentation
cucumber -f progress . ${REQUIRES}

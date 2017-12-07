rspec . --format progress

# Test output can be formatted as progress or documentation
cucumber -f progress ./*.feature -r *steps.rb

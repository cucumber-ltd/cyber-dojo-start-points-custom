rspec . --format progress

# Test output can be formatted as progress or documentation
cucumber -f progress ./*.feature -I . -r *steps.rb

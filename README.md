# cyber-dojo-start-points-custom

This is a repo for the Cyber-Dojo (C-D) startpoints for Cucumber training.

It should be kept in sync with the repos that we use for Shouty and Testable Architecture. Note that C-D can 
handle a hierarchical folder structure, but deep hierarchies will not display well. For that reason, please 
keep the hierarchies no more than 1 folder deep.

If you add, remove, or rename files, you must make a corresponding change in `manifest.json`

## Usage

To update the start-point(s) on an instance of C-D:

* Make changes and push to this repo
* Shell into the instance: `http://console.cloud.google.com`
* Bring cyber-dojo down: `./cyber-dojo down`
* Delete the existing custom startpoint: `./cyber-dojo start-point rm CUCUMBER`
* Re-create the startpoint: `./cyber-dojo start-point create CUCUMBER --git=https://github.com/cucumber-ltd/cyber-dojo-start
-points-custom.git`
* Bring C-D back up again: `./cyber-dojo up --custom=CUCUMBER`

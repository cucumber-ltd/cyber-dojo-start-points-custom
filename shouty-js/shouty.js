'use strict';

module.exports = function Shouty() {
  const MESSAGE_RANGE = 1000;
  this.locations = {};
  this.shouts = {};

  this.setLocation = function(person, coordinate) {
    this.locations[person] = coordinate;
  }

  this.shout = function(person, shout) {
    if(!(person in this.shouts)) {
      this.shouts[person] = [];
    }
    this.shouts[person].push(shout);
  }

  this.getShoutsHeardBy = function(listener) {
    var shoutsHeard = {};

    Object.keys(this.shouts).forEach(shouter => {
        var personsShouts = this.shouts[shouter];
        var distance = this.locations[listener].distanceFrom(this.locations[shouter]);

        if(distance < MESSAGE_RANGE) {
          shoutsHeard[shouter] = personsShouts;
        }
    })

    return shoutsHeard;
  }
};

'use strict';

module.exports = function Coordinate(x, y) {

  this.x = x;
  this.y = y;

  this.distanceFrom = function(other) {

    // TODO: actually calculate distance beteen the coordinates.
    //       e.g. return Math.abs(this.x - other.x);
    return 0;
  }
};

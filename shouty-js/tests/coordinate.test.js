var assert = require('assert')
var Coordinate = require('../coordinate')

describe("coordinate class", () => {

  it("should calculate the distance from itself", () => {
    var a = new Coordinate(0, 0)
    assert.equal(a.distanceFrom(a), 0)
  })

  it("should calculate the distance from another coordinate along X axis", ()=>{
    var a = new Coordinate(0, 0)
    var b = new Coordinate(600, 0)

    assert.equal(a.distanceFrom(b), 600)
  })

  // it("should calculate the distance from another coordinate", ()=>{
  //   var a = new Coordinate(0, 0)
  //   var b = new Coordinate(300, 400)
  //
  //   assert.equal(a.distanceFrom(b), 500)
  // })

  // Use this code to implement Pythagoras' theorem in coordinate.js:
  //
  // return Math.hypot(this.x - other.x, this.y - other.y)
})

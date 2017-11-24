var {Before, Given, When, Then } = require('cucumber')
var assert = require('assert')
var Shouty = require('../shouty')
var Coordinate = require('../coordinate')

const ARBITARY_MESSAGE = 'Hello, world'
let shouty

Before(function() {
  shouty = new Shouty()
})

Given('Lucy is at {int}, {int}', function (x, y) {
  shouty.setLocation('Lucy', new Coordinate(x, y))
})

Given('Sean is at {int}, {int}', function (x, y) {
  shouty.setLocation('Sean', new Coordinate(x, y))
})

When('Sean shouts', function () {
  shouty.shout('Sean', ARBITARY_MESSAGE)
})

Then('Lucy should hear Sean', function () {
  assert.equal(Object.keys(shouty.getShoutsHeardBy('Lucy')).length, 1)
})

Then('Lucy should hear nothing', function () {
  assert.equal(Object.keys(shouty.getShoutsHeardBy('Lucy')).length, 0)
})

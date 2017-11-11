'use strict';

var {defineSupportCode} = require('cucumber');
var assert = require('assert');
var Shouty = require('./shouty');
var Coordinate = require('./coordinate');

defineSupportCode(function({Given, When, Then}) {
  const ARBITARY_MESSAGE = 'Hello, world';
  var shouty = new Shouty();

  Given(/^Lucy is at (\d+), (\d+)$/, function (x, y) {
    shouty.setLocation('Lucy', new Coordinate(x, y));
  });

  Given(/^Sean is at (\d+), (\d+)$/, function (x, y) {
    shouty.setLocation('Sean', new Coordinate(x, y));
  });

  When(/^Sean shouts$/, function () {
    shouty.shout('Sean', ARBITARY_MESSAGE);
  });

  Then(/^Lucy should hear Sean$/, function () {
    assert.equal(Object.keys(shouty.getShoutsHeardBy('Lucy')).length, 1);
  });

  Then(/^Lucy should hear nothing$/, function () {
    assert.equal(Object.keys(shouty.getShoutsHeardBy('Lucy')).length, 0);
  });

});

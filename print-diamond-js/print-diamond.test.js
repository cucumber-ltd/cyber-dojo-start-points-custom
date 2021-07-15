'use strict';

const diamond = require('./print-diamond.js');

describe('When the midpoint is', () => {
  // This test will FAIL initially.
  // The test IS CORRECT.
  // Get the test to pass by fixing the code in print-diamond.js
  it('A, a single character is output', () => {
    expect(diamond.create('A')).toEqual("A\n");
  });

  it('B, ...describe what you expect to be returned when the midpoint is B', () => {
    expect(diamond.create('B')).toEqual("???");
  });

});

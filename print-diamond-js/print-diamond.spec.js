'use strict';

const diamond = require('./print-diamond.js');

describe('When the midpoint is', () => {
  // This test will FAIL initially.
  // The test IS CORRECT.
  // Get the test to pass by fixing the code in print-diamond.js
  it('A, a single character is output', () => {
    expect(diamond.create('A')).toEqual("A\n");
  });

  /*
  This could be your second test. Then again, you may choose a different path.
  Edit or delete it as you see fit.

  it('B, <describe what you expect to be returned when the midpoint is B>', () => {
    expect(diamond.create('B')).toEqual("<what should be returned?>");
  });
  */

});

'use strict';

const diamond = require('./diamond.js');

describe('Print Diamond', () => {
  it('A, a single line is output', () => {
    expect(diamond.create('A')).toEqual(["A"]);
  });

  it('B, three lines are output', () => {
    expect(diamond.create('B')).toEqual([" A ",
      "B B",
      " A "]);
  });

});

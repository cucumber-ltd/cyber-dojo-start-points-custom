'use strict';

module.exports = {
  create
};

function create(midpoint) {
  if (midpoint === 'A')
    return ["A"];
  else
    return [" A ",
            "B B",
            " A "];
}



/* ===================================
 USEFUL SNIPPETS

 Feel free to use them if you want...

=================================== */

/*
  Old school debugging often involves printing out to the console.
  In Javascript you can do it like this:
      console.log("My Variable = " + my_variable);
 */

/*
  This method is useful if you want to iterate over the characters
  in the alphabet.
    e.g. nextChar('A') == 'B'
 */
function nextChar(c) {
  return String.fromCharCode(c.charCodeAt(0) + 1)
}

/*
  This method returns a string containing the specified number of
  spaces (indicated by the parameter, count)
    e.g. spaces(3) == "   "
 */
function spaces(count) {
  return count == 0 ? "" : " ".repeat(count);
}

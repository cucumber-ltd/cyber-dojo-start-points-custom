'use strict';

module.exports = {
  create
};

/*
  Old school debugging often involves printing out to the console. In Javascript you can do it like this:
      console.log("My Variable = " + my_variable);
 */

function create(midPoint) {
  return "A";
}



/* ===================================
 USEFUL SNIPPETS

 Feel free to use them if you want...

=================================== */

/*
  This method is useful if you want to iterate over the characters in the alphabet in a for-loop
  e.g. for (var currentChar = startChar; char <= endChar; currentChar = incrementChar(currentChar)) { ... }
 */
function incrementChar(c) {
  return String.fromCharCode(c.charCodeAt(0) + 1)
}
/*
  This method returns a string containing the specified number of spaces (indicated by the parameter, count)
 */

function spaces(count) {
  return count == 0 ? "" : " ".repeat(count);
}


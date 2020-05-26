/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/utopian-tree/problem
 *
 * @author ketanmalik
 * May 26 2020
 *
 * */

function utopianTree(n) {
  var h = 1;
  if (n === 0) return 1;
  for (var i = 1; i <= n; i++) {
    i % 2 === 0 ? (h += 1) : (h *= 2);
  }
  return h;
}

console.log(utopianTree(7));

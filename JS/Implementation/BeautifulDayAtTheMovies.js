/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 *
 * @author ketanmalik
 * May 26 2020
 *
 */

function beautifulDays(i, j, k) {
  var res = 0;
  for (var x = i; x <= j; x++) {
    var num = x;
    var rev = getRev(num);
    var diff = Math.abs(num - rev);
    if (diff % k === 0) res++;
  }
  return res;
}

function getRev(num) {
  var res = 0;
  while (num > 0) {
    var digit = num % 10;
    res = res * 10 + digit;
    num = parseInt(num / 10);
  }
  return res;
}

console.log(beautifulDays(20, 23, 6));

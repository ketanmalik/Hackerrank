/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/the-hurdle-race/problem
 *
 * @author ketanmalik
 * May 25 2020
 *
 * */

function hurdleRace(k, height) {
  return height.reduce(
    (acc, curr) => (curr - k > 0 ? Math.max(acc, curr - k) : acc),
    0
  );
}

console.log(hurdleRace(1, [1, 2, 3, 3, 2]));

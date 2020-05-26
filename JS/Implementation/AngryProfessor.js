/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/angry-professor/problem
 *
 * @author ketanmalik
 * May 26 2020
 *
 * */

function angryProfessor(k, a) {
  var onTime = a.reduce((acc, curr) => (curr <= 0 ? (acc += 1) : acc), 0);
  console.log(onTime, k);
  return onTime >= k ? "NO" : "YES";
}

console.log(angryProfessor(7, [26, 94, -95, 34, 67, -97, 17, 52, 1, 86]));

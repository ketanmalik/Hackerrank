/**
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/cut-the-sticks/problem
 *
 * @author ketanmalik
 * June 2 2020
 * */

function cutTheSticks(arr) {
  let res = [];
  while (arr.length > 0) {
    let min = Math.min(...arr);
    let newArr = arr.filter((a) => a > min).map((elem) => elem - min);
    res.push(arr.length);
    arr = newArr;
  }
  return res;
}

console.log(cutTheSticks([5, 4, 4, 2, 2, 1]));

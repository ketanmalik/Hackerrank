/*
Hackerrank Problem Link - https://www.hackerrank.com/challenges/the-birthday-bar/problem

@author ketanmalik
May 18 2020
*/

function birthday(s, d, m) {
  let sum = 0,
    res = 0;
  for (let i = 0; i < m; i++) sum += s[i];
  console.log("first sum: ", sum);
  if (sum === d) res++;
  for (let i = m, j = 0; i < s.length; i++, j++) {
    sum -= s[j];
    sum += s[i];
    // j++;
    sum === d ? res++ : "";
  }
  return res;
}

console.log(birthday([1, 2, 1, 3, 2], 3, 2));

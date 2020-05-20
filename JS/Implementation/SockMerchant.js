/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/sock-merchant/problem
 *
 * @author ketanmalik
 * May 20 2020
 *
 * */

function sockMerchant(n, ar) {
  var res = 0;
  var obj = {};
  for (var i = 0; i < n; i++) {
    if (obj[ar[i]] && obj[ar[i]] != null) {
      res++;
      obj[ar[i]] = null;
    } else {
      obj[ar[i]] = 1;
    }
  }
  return res;
}

console.log(sockMerchant(9, [10, 20, 20, 10, 10, 30, 50, 10, 20]));

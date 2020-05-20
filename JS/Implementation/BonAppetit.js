/*
Hackerrank Problem Link - https://www.hackerrank.com/challenges/bon-appetit/problem

@author ketanmalik
May 19 2020
*/

function bonAppetit(bill, k, b) {
  let total = bill.reduce((acc, curr) => acc + curr);
  let annaTotal = (total - bill[k]) / 2;
  annaTotal == b ? console.log("Bon Appetit") : console.log(b - annaTotal);
}

bonAppetit([3, 10, 2, 9], 1, 12);

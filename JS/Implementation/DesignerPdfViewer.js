/*
 * Hackerrank Problem Link - https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 *
 * @author ketanmalik
 * May 26 2020
 *
 * */

function designerPdfViewer(h, word) {
  var max = h[0];
  for (var c in word) {
    var x = word.charCodeAt(c) - 97;
    max = Math.max(max, h[x]);
  }
  return max * word.length;
}

console.log(
  designerPdfViewer(
    [
      1,
      3,
      1,
      3,
      1,
      4,
      1,
      3,
      2,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
    ],
    "abc"
  )
);

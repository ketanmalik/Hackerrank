/*
 * Hackerrank Problem - Apple and Orange (Implementation Category)
 *
 * @author ketanmalik
 * May 14 2020
 *
 * */

var applesAndOranges = function (s, t, a, b, apples, oranges) {
  var applesCount = 0;
  var orangesCount = 0;
  var dist = 0;
  for (var x in apples) {
    dist = apples[x] + a;
    dist >= s && dist <= t ? applesCount++ : "";
  }
  for (var x in oranges) {
    dist = oranges[x] + b;
    dist >= s && dist <= t ? orangesCount++ : "";
  }
  console.log(applesCount);
  console.log(orangesCount);
};

applesAndOranges(7, 11, 5, 15, [-2, 2, 1], [5, -6]);

/*
 * HackerLand University has the following grading policy:
 *
 * Every student receives a grade in the inclusive range from 0 to 100. Any
 * grade less than 40 is a failing grade. Sam is a professor at the university
 * and likes to round each student's grade according to these rules:
 *
 * If the difference between the grade and the next multiple of 5 is less than
 * 3, round up to the next multiple of 5. If the value of grade is less than 38,
 * no rounding occurs as the result will still be a failing grade. For example,
 * grade = 84 will be rounded to 85 but grade = 29 will not be rounded because
 * the rounding would result in a number that is less than 40.
 *
 * Given the initial value of for each of Sam's students, write code to automate
 * the rounding process.
 *
 * @author ketanmalik
 * May 14 2020
 */

var gradingStudents = function (grades) {
  var res = [];
  var grades = [...grades];
  grades.forEach((grade) => {
    var diff = 5 - (grade % 5);
    grade >= 38 ? (diff < 3 ? (grade += diff) : grade) : grade;
    res.push(grade);
  });

  return res;
};

var grades = [73, 67, 38, 33];
console.log(gradingStudents(grades));

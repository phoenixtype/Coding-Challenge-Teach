process.stdin.resume();
process.stdin.setEncoding("ascii");

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on("data", function (data) {
  input_stdin += data;
});

process.stdin.on("end", function () {
  input_stdin_array = input_stdin.split("\n");
  main();
});

// Reads complete line from STDIN
function readLine() {
  return input_stdin_array[input_currentline++];
}

function main() {
  let i = 4;
  let d = 4.0;
  let s = "HackerRank ";
  // Declare second integer, double, and String variables.
  let i_2;
  let d_2;
  let s_2;

  // Read and save an integer, double, and String to your variables.
  i_2 = Number(readLine());
  d_2 = parseFloat(readLine());
  s_2 = readLine();

  // Print the sum of both integer variables on a new line.
  console.log(i + i_2);

  // Print the sum of the double variables on a new line.
  console.log(d + d_2);

  // Concatenate and print the String variables on a new line
  // The 's' variable above should be printed first.
  console.log(s + s_2);
}

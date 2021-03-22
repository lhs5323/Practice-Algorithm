// 백준 2914 저작권

function solution(a, i) {
  let result = a * (i - 1) + 1;
  console.log(result);
}

const readline = require("readline");

const rl = readline.createInterface({
  input : process.stdin,
  output : process.stdout
});

let input = [];

rl.on('line', function(line) {  
  input = line.split(' ').map((el) => parseInt(el));
  solution(input[0], input[1]);
  rl.close();
}).on('close', function() {
  process.exit();
});
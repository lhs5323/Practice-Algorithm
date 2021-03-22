// 백준 16430 제리와 톰

function solution(p, q) {
  console.log(q-p, q);
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
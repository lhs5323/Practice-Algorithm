// 백준 11654 아스키 코드

function solution(a) {
  let result = a.charCodeAt();
  console.log(result);
}

const readline = require("readline");

const rl = readline.createInterface({
  input : process.stdin,
  output : process.stdout
});

rl.on('line', function(line) {  
  let a = line;
  solution(a);
  rl.close();
}).on('close', function() {
  process.exit();
});
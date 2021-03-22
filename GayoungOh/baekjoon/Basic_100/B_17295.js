// 백준 17295 엔드게임 스포일러

function solution(str) {
  console.log('Avengers: Endgame');
}

const readline = require("readline");

const rl = readline.createInterface({
  input : process.stdin,
  output : process.stdout
});

rl.on('line', function(line) {
  let str = line;
  solution(str);
  rl.close();
}).on('close', function() {
  process.exit();
});

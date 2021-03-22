// 백준 14645 와이버스 부릉부릉

function solution() {
  console.log('비와이');
}

const readline = require("readline");

const rl = readline.createInterface({
  input : process.stdin,
  output : process.stdout
});

let i = 0;

rl.on('line', function(line) {
  i++;
  input = line.split(' ');
  if(i == 4) {
    rl.close();
  }
}).on('close', function() {
  solution();
  process.exit();
});
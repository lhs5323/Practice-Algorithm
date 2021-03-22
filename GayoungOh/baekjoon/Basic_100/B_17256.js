// 백준 17256 달달함이 넘쳐흘러

const readline = require("readline");

const rl = readline.createInterface({
  input : process.stdin,
  output : process.stdout
});

let i = 0;
let input = [];
let input2 = [];

let bx;
let by;
let bz;
rl.on('line', function(line) {
  i++;

  if(i == 1) {
    input = line.split(' ').map((el) => parseInt(el));
  }else if(i == 2) {
    input2 = line.split(' ').map((el) => parseInt(el));
    bx = input2[0] - input[2];
    by = input2[1] / input[1];
    bz = input2[2] - input[0];
    rl.close();
  }
}).on('close', function() {
  console.log(bx, by, bz);
  process.exit();
});
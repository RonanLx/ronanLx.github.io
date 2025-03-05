function sevenPass(num) {
  return num.toString().includes('7') || num % 7 === 0;
}
function digit() {
  let outcome = '';
  for(let i = 1; i <= 100; i++) {
    console.log(`processing ${i}`); // 调试信息，确认每个数字都被处理
    if(sevenPass(i)) {
      outcome += `<div><span class="pass">过</span></div>`;
    } else {
      outcome += `<div>${i}</div>`;
    }
  }
  return outcome;
}
function game() {
  document.getElementById('outcome').innerHTML = digit(); // 直接覆盖原有内容
}
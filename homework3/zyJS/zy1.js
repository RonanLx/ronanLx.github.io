function change(yuan) {
  let quantity = 0; // 初始化组合数量为0
  let result = ''; // 初始化结果字符串为空

  // 遍历从0到给定金额的每一个可能的1元硬币数量
  for (let x = 0; x <= yuan; x++) {
    // 计算剩余金额转换为5角硬币的数量
    let y = (yuan - x) * 2;
    quantity++; // 每找到一个组合，组合数量增加1
    // 将当前组合的1元和5角硬币的数量添加到结果字符串中
    result += `1元: ${x}个, 5角: ${y}个<br>`;
  }

  // 返回包含所有组合信息和组合数量的对象
  return { combination: result, count: quantity };
}

// 定义一个简单的查询函数，用于演示如何调用change函数并更新网页内容
function q() {
  // 调用change函数，给定金额为20元
  const resultData = change(20);
  // 更新网页上的内容，显示所有组合信息和总的组合数量
  document.getElementById('result').innerHTML = resultData.combination + `<br>总共有${resultData.count}种组合。`;
}

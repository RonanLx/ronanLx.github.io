/**
     * 运费计算主函数
     * 执行流程：
     * 1. 获取用户输入
     * 2. 验证输入有效性
     * 3. 计算运费逻辑
     * 4. 显示计算结果
     */
function calculate() {
  // 获取用户类型（单选按钮的选中值）
  const userType = document.querySelector('input[name="userType"]:checked').value;

  // 获取订单金额输入元素
  const amountInput = document.getElementById('amount');

  // 获取是否偏远地区（复选框的选中状态）
  const isRemote = document.getElementById('remote').checked;

  /* 输入验证阶段 */
  // 将输入值转换为浮点数
  const amount = parseFloat(amountInput.value);

  // 验证输入有效性：
  // - 检查是否为有效数字（非NaN）
  // - 检查是否 >= 0
  if (isNaN(amount) || amount < 0) {
    // 显示错误提示
    document.getElementById('amountError').style.display = 'block';
    // 隐藏结果区域
    document.getElementById('result').style.display = 'none';
    return; // 终止函数执行
  }

  // 隐藏错误提示（如果之前显示过）
  document.getElementById('amountError').style.display = 'none';

  /* 运费计算阶段 */
  // 根据用户类型确定免运费阈值
  const threshold = userType === 'vip' ? 79 : 99;

  // 计算基础运费：
  // - 达到阈值：0元
  // - 未达阈值：10元
  let shipping = amount >= threshold ? 0 : 10;

  // 处理偏远地区附加费：
  // - 如果勾选偏远地区，增加5元
  if (isRemote) shipping += 5;

  /* 结果展示阶段 */
  // 获取结果展示元素
  const resultDiv = document.getElementById('result');

  // 使用模板字符串构建结果HTML
  resultDiv.innerHTML =
    `<h3>计算结果：</h3>
    <p>用户类型：${userType === 'vip' ? 'VIP用户' : '普通用户'}</p>
    <p>订单金额：¥${amount.toFixed(2)}</p> <!-- 格式化显示两位小数 -->
    <p>偏远地区：${isRemote ? '是' : '否'}</p>
    <p style="color: #007bff; font-weight: bold;">总运费：¥${shipping.toFixed(2)}</p>`;

  // 显示结果区域
  resultDiv.style.display = 'block';
}
function filters(nums) {
  const even = nums.filter((num) => {
    return num % 2 == 0;
  });
  return even;
}

const nums = [1, 2, 3, 4, 5, 6];

console.log(filters(nums));

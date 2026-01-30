function Sum(n) {
  sum = 0;
  for (i = 1; i <= n; i++) {
    sum = sum + i;
  }
  return sum;
}

ans = Sum(5);
console.log(ans);

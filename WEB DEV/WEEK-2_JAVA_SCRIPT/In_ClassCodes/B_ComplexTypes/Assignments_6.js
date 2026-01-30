const arrusers = [
  {
    name: "Harkirat",
    age: 21,
  },
  {
    name: "raman",
    age: 22,
  },
];
function agemorethan18(arrusers) {
  more = arrusers.filter((n) => {
    return n.age > 18;
  });
  return more;
}

console.log(agemorethan18(arrusers));

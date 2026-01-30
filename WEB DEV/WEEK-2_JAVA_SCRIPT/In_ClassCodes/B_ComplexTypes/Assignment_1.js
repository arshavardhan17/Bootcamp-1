/*
Write a function that takes a user as an input and greets them with their name and age
*/

function Greet(user) {
  console.log("Welcome", user.name, "your age is:", user.age);
}

const user = {
  name: "Arsha",
  age: 20,
};

console.log(Greet(user));

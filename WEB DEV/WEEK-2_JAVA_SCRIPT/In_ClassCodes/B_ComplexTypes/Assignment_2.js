/*
Write a function that takes a new object as input which has name , age  and gender and greets the user with their gender (Hi Mr/Mrs/Others harkirat, your age is 21)
*/

function GreetGender(user) {
  console.log(
    `Welcome ${user.gender == "male" ? "Mr" : "Ms"} ${user.name} Your age is: ${user.age}`,
  );
}

const user = {
  name: "Arsha",
  gender: "male",
  age: 20,
};

console.log(GreetGender(user));

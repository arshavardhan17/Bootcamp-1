function GreetGender(user) {
  console.log(
    `Welcome ${user.gender == "male" ? "Mr" : "Ms"} ${user.name} Your age is: ${user.age} ${user.age > 18 ? "Legal To Vote" : "Illeagal To Vote"}`,
  );
}

const user = {
  name: "Arsha",
  gender: "male",
  age: 20,
};

GreetGender(user);

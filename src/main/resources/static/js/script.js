let flag = true;
let flogForSet = true;
function showDragDownList() {
  profile = document.querySelector(".profile_list");
  if (flag) {
    profile.style.display = "block";
  } else {
    profile.style.display = "none";
  }
  flag = !flag;
}

function showSet() {
  // alert("ewong");
  // set = document.querySelector(".set");
  // set.style.display = "block";
  // body = document.querySelector("body");
  // body.style.overflow = "hidden";
  // body.style.backgroundColor = "#ccc";
  // set.style.marginTop = window.innerHeight - 600 + "px";
  const setDiv = document.querySelector(".set");
  setDiv.classList.remove("hidden-div");
  body = document.querySelector("body");
  body.style.overflow = "hidden";
  body.style.backgroundColor = "#ccc";
}
function hideSet() {
  const setDiv = document.querySelector(".set");
  setDiv.classList.add("hidden-div");
  body = document.querySelector("body");
  body.style.overflow = "scroll";
  body.style.backgroundColor = "#fff";
}

function showFood() {
  hideSet();
  const food = document.querySelector(".food");
  food.classList.remove("hidden-div");
  body = document.querySelector("body");
  body.style.overflow = "hidden";
  body.style.backgroundColor = "#ccc";
}

function hideFood() {
  const food = document.querySelector(".food");
  food.classList.add("hidden-div");
  showSet();
}

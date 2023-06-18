let urlCafeteria = "http://localhost:8080/api/cafeteria";

function caf() {
    let url = window.location.href;
    urlCafeteria = urlCafeteria.replace('cafeteria', url.substring(url.indexOf('cafeteria')))

    fetch(urlCafeteria)
        .then(response => response.json())
        .then(cafeteria => {
                const cafeteriasContainer = document.querySelector('.shanyrak');
                const foodType = document.querySelector('.food__type__list');
                cafeteriasContainer.innerHTML = cafeteria.name;
                apparatList = cafeteria.apparatList;

                apparatList.sort(function (a, b) {
                    return a.date - b.date
                })


                console.log(apparatList)

                const dates = new Set();
                const sets = new Map();
                apparatList.forEach(apparat => {

                    const date = apparat.date.substring(0, 10);

                    dates.add(date);

                    if (sets.has(date)) {
                        sets.get(date).push({
                            "type": apparat.type.name,
                            "name": apparat.name,
                            "foodSets": apparat.foodSets
                        });
                    } else {
                        sets.set(date, []);
                    }
                });
                dates.forEach(date => {
                    const listFood = document.createElement('ul');
                    listFood.classList.add('list__food');

                    const listItem1 = document.createElement('li');
                    listItem1.classList.add('list__item');
                    listItem1.classList.add('list__item__title');

                    listItem1.innerHTML = date; //date

                    const listItem2 = document.createElement('li');
                    listItem2.classList.add('list__item');

                    const listFoodType = document.createElement('ul');
                    listFoodType.classList.add('list__food__type');

                    const listFoodItemForLunch = document.createElement('li');
                    listFoodItemForLunch.classList.add('list__food__item');
                    listFoodItemForLunch.classList.add('list__food__item__type');

                    const listFoodItemForHalalLunch = document.createElement('li');
                    listFoodItemForHalalLunch.classList.add('list__food__item');
                    const listFoodItemForKoreanLunch = document.createElement('li');
                    listFoodItemForKoreanLunch.classList.add('list__food__item');
                    const listFoodItemForVegeLunch = document.createElement('li');
                    listFoodItemForVegeLunch.classList.add('list__food__item');


                    const listFoodItemForHalalDinner = document.createElement('li');
                    listFoodItemForHalalDinner.classList.add('list__food__item');
                    const listFoodItemForKoreanDinner = document.createElement('li');
                    listFoodItemForKoreanDinner.classList.add('list__food__item');
                    const listFoodItemForVegeDinner = document.createElement('li');
                    listFoodItemForVegeDinner.classList.add('list__food__item');


                    console.log(sets, ' sets')


                    sets.get(date).forEach(set => {

                        if (set.type === 'halal') {
                            if (set.type === 'lunch') {
                                listFoodItemForHalalLunch.innerHTML = '<img\n' +
                                    '                  onclick="showSet()"\n' +
                                    '                  class="img__item"\n' +
                                    '                  th:src="@{ /img/beshbarmak.jpg }"\n' +
                                    '                  alt=""\n' +
                                    '                />'
                            } else {
                                listFoodItemForHalalDinner.innerHTML = '<img\n' +
                                    '                  onclick="showSet()"\n' +
                                    '                  class="img__item"\n' +
                                    '                  th:src="@{ /img/beshbarmak.jpg }"\n' +
                                    '                  alt=""\n' +
                                    '                />'
                            }
                        } else if (set.type === 'korean') {
                            if (set.type === 'lunch') {
                                listFoodItemForKoreanLunch.innerHTML = '<img\n' +
                                    '                  onclick="showSet()"\n' +
                                    '                  class="img__item"\n' +
                                    '                  th:src="@{ /img/beshbarmak.jpg }"\n' +
                                    '                  alt=""\n' +
                                    '                />'
                            } else {
                                listFoodItemForKoreanDinner.innerHTML = '<img\n' +
                                    '                  onclick="showSet()"\n' +
                                    '                  class="img__item"\n' +
                                    '                  th:src="@{ /img/beshbarmak.jpg }"\n' +
                                    '                  alt=""\n' +
                                    '                />'
                            }
                        } else {
                            if (set.type === 'lunch') {
                                listFoodItemForVegeLunch.innerHTML = '<img\n' +
                                    '                  onclick="showSet()"\n' +
                                    '                  class="img__item"\n' +
                                    '                  th:src="@{ /img/beshbarmak.jpg }"\n' +
                                    '                  alt=""\n' +
                                    '                />'
                            } else {
                                listFoodItemForVegeDinner.innerHTML = '<img\n' +
                                    '                  onclick="showSet()"\n' +
                                    '                  class="img__item"\n' +
                                    '                  th:src="@{ /img/beshbarmak.jpg }"\n' +
                                    '                  alt=""\n' +
                                    '                />'
                            }
                        }

                    });

                //    TODO
                    listFood.appendChild(listItem1)

                    listFoodType

                    listItem2.appendChild(listFoodType)

                    listFood.appendChild(listItem2)
d
                });
            }
        );
}

document.addEventListener("DOMContentLoaded", caf);

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



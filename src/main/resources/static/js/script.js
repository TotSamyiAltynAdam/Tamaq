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


                const dates = new Set();
                const sets = new Map();
                apparatList.forEach(apparat => {
                    const date = apparat.date.substring(0, 10);

                    dates.add(date);

                    if (sets.has(date)) {
                        console.log(apparat)
                        sets.get(date).push({
                            "type": apparat.type.name,
                            "name": apparat.name,
                            "foodSets": apparat.foodSets
                        });
                    } else {
                        sets.set(date, [
                            {
                                "type": apparat.type.name,
                                "name": apparat.name,
                                "foodSets": apparat.foodSets
                            }
                        ]);
                    }
                    console.log(sets)
                });
                const content = document.querySelector('.content .container');


                dates.forEach(date => {
                    const ulForBlock = document.createElement('ul');
                    ulForBlock.classList.add('list__food')
                    const liForItemBlock1 = document.createElement('li');
                    liForItemBlock1.classList.add('list__item', 'list__item__title')
                    const liForItemBlock2 = document.createElement('li');
                    liForItemBlock2.classList.add('list__item')
                    liForItemBlock1.innerHTML = date;

                    const ulForLunch = document.createElement('ul');
                    ulForLunch.classList.add('list__food__type')

                    const liForItemLunchTitle = document.createElement('li');
                    liForItemLunchTitle.innerHTML = 'lunch'
                    liForItemLunchTitle.classList.add('list__food__item', 'list__food__item__type')
                    const liForItemLunch1 = document.createElement('li');
                    liForItemLunch1.classList.add('list__food__item')
                    const liForItemLunch2 = document.createElement('li');
                    liForItemLunch2.classList.add('list__food__item')
                    const liForItemLunch3 = document.createElement('li');
                    liForItemLunch3.classList.add('list__food__item')

                    const ulForDinner = document.createElement('ul');
                    ulForDinner.classList.add('list__food__type')

                    const liForItemDinnerTitle = document.createElement('li');
                    liForItemDinnerTitle.innerHTML = 'dinner';
                    liForItemDinnerTitle.classList.add('list__food__item', 'list__food__item__type')
                    const liForItemDinner1 = document.createElement('li');
                    liForItemDinner1.classList.add('list__food__item')
                    const liForItemDinner2 = document.createElement('li');
                    liForItemDinner2.classList.add('list__food__item')
                    const liForItemDinner3 = document.createElement('li');
                    liForItemDinner3.classList.add('list__food__item')

                    const imgForItem = document.createElement('img');

                    imgForItem.classList.add('img__item')
                    imgForItem.src = 'data:image/jpeg;base64,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';

                    sets.get(date).forEach(val => {
                        if (val.name === 'korean') {
                            if (val.type === 'lunch') {
                                // liForItemLunch2.innerHTML = "korean lunch";
                                imgForItem.alt = "korean lunch";
                                imgForItem.addEventListener('click', showSet);
                                imgForItem.myDate = date;
                                imgForItem.myMsg = 'korean lunch'
                                imgForItem.mySet = val.foodSets;
                                liForItemLunch2.appendChild(imgForItem)
                            } else {
                                // liForItemDinner2.innerHTML = "korean dinner"
                                imgForItem.alt = "korean dinner";
                                imgForItem.addEventListener('click', showSet);
                                imgForItem.myDate = date;
                                imgForItem.myMsg = 'korean lunch'
                                liForItemDinner2.appendChild(imgForItem)
                            }
                        } else if (val.name === 'halal') {
                            if (val.type === 'lunch') {
                                // liForItemLunch1.innerHTML = "halal lunch";
                                imgForItem.alt = "halal lunch";
                                imgForItem.addEventListener('click', showSet);
                                liForItemLunch1.appendChild(imgForItem)
                                imgForItem.myDate = date;
                                imgForItem.myMsg = 'korean lunch'
                            } else {
                                // liForItemDinner1.innerHTML = "halal dinner"
                                imgForItem.alt = "halal dinner";
                                imgForItem.myDate = date;
                                imgForItem.myMsg = 'korean lunch'
                                imgForItem.addEventListener('click', showSet);
                                liForItemDinner1.appendChild(imgForItem)
                            }
                        } else {
                            if (val.type === 'lunch') {
                                // liForItemLunch3.innerHTML = "vege lunch";
                                imgForItem.alt = "vege lunch";
                                imgForItem.addEventListener('click', showSet);
                                imgForItem.myDate = date;
                                imgForItem.myMsg = 'korean lunch'
                                liForItemLunch3.appendChild(imgForItem)
                            } else {
                                // liForItemDinner3.innerHTML = "vege dinner"
                                imgForItem.alt = "vege dinner";
                                imgForItem.addEventListener('click', showSet);
                                imgForItem.myDate = date;
                                imgForItem.myMsg = 'korean lunch'
                                liForItemDinner3.appendChild(imgForItem)


                            }
                        }
                    });


                    ulForLunch.appendChild(liForItemLunchTitle);
                    ulForLunch.appendChild(liForItemLunch1);
                    ulForLunch.appendChild(liForItemLunch2);
                    ulForLunch.appendChild(liForItemLunch3);


                    ulForDinner.appendChild(liForItemDinnerTitle);
                    ulForDinner.appendChild(liForItemDinner1);
                    ulForDinner.appendChild(liForItemDinner2);
                    ulForDinner.appendChild(liForItemDinner3);

                    liForItemBlock2.appendChild(ulForLunch)
                    liForItemBlock2.appendChild(ulForDinner)
                    ulForBlock.appendChild(liForItemBlock1);
                    ulForBlock.appendChild(liForItemBlock2);

                    content.appendChild(ulForBlock)
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

function showSet(evt) {
    const setDiv = document.querySelector(".set");
    document.querySelector('.setDate').innerHTML = evt.currentTarget.myDate
    document.querySelector('.typeFood').innerHTML = evt.currentTarget.myMsg
    setDiv.classList.remove("hidden-div");
    body = document.querySelector("body");
    body.style.overflow = "hidden";
    body.style.backgroundColor = "#ccc";


    const setList = document.querySelector('.setList');
    setList.classList.add('setList')

    const item = document.querySelector('li');
    item.classList.add('setList__item')

    const foodList = evt.currentTarget.mySet[0].foodList;
    console.log('foodlist ', foodList)
    foodList.forEach(food => {
        const b = document.createElement('b');
        b.innerHTML = food.name + ' ' + food.price;

        const image = document.createElement('img');
        image.src = 'https://www.freecodecamp.org/news/content/images/2022/09/jonatan-pie-3l3RwQdHRHg-unsplash.jpg'
        image.setAttribute('th:src', "@{ /img/beshbarmak.jpg }")

        item.appendChild(image);
        item.appendChild(b);

    })
    setList.appendChild(item);
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
    body.style.overflow = "scroll";
    body.style.backgroundColor = "#fff";
    showSet();
}



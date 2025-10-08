let n = 2;
let btn_add = document.querySelector("#add");
let btn_remove = document.querySelector("#remove");
let btn_remove_last_item = document.querySelector("#remove_last_item");

function add_paragraf () {
    n++;
    const para = document.createElement("p");

    para.id = "p"+n;
    const node = document.createTextNode("Questo è il nuovo paragrafo con id: " + n);

    para.appendChild(node);
    const element = document.getElementById("div1");
    element.appendChild(para);
}

function remove_paragraf () {
    for (let i = 0; i < n; i++) {
        document.getElementById("p"+i).remove()
    }

    n = 0;
}

function remove_last_item () {
    document.getElementById("p"+n).remove
    n--;
}

btn_add.addEventListener("click", add_paragraf)
btn_remove.addEventListener("click", remove_paragraf)
btn_remove_last_item.addEventListener("click", remove_last_item)
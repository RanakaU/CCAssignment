var modal = document.getElementById("myModal");

var btn1 = document.getElementById("japanese");
var btn2 = document.getElementById("chinese");
var btn3 = document.getElementById("italian");
var btn4 = document.getElementById("srilankan");
var btn5 = document.getElementById("european");
var btn6 = document.getElementById("dinein");
var btn7 = document.getElementById("delivery");
var btn8 = document.getElementById("both");

var span = document.getElementsByClassName("close")[0];



btn1.onclick = function(){
    modal.style.display = "block";
}

btn2.onclick = function(){
    modal.style.display = "block";
}


btn3.onclick = function(){
    modal.style.display = "block";
}


btn4.onclick = function(){
    modal.style.display = "block";
}


btn5.onclick = function(){
    modal.style.display = "block";
}


btn6.onclick = function(){
    modal.style.display = "block";
}


btn7.onclick = function(){
    modal.style.display = "block";
}


btn8.onclick = function(){
    modal.style.display = "block";
}



span.onclick = function(){
    modal.style.display = "none";
}


window.onclick = function(event){
    if(event.target == modal){
        modal.style.display = "none";
    }
}

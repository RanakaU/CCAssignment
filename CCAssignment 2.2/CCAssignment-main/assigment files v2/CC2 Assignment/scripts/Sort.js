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
    filter("japanese");
}

btn2.onclick = function(){
    modal.style.display = "block";
    filter("chinese");
}


btn3.onclick = function(){
    modal.style.display = "block";
    filter("italian")
}


btn4.onclick = function(){
    modal.style.display = "block";
    filter("srilankan")
}


btn5.onclick = function(){
    modal.style.display = "block";
    filter("european");
}


btn6.onclick = function(){
    modal.style.display = "block";
    filtertype("dinein");
}


btn7.onclick = function(){
    modal.style.display = "block";
    filtertype("delivery");
}


btn8.onclick = function(){
    modal.style.display = "block";
    filtertype("both")
}



span.onclick = function(){
    modal.style.display = "none";
}


window.onclick = function(event){
    if(event.target == modal){
        modal.style.display = "none";
    }
}

function filter(cuisine){

    document.getElementById("S_List").innerHTML = " ";

    console.log("works");

    $.ajax({
        type: "GET",
        url: "http://localhost:8085/api/get/cuisine/" + cuisine,
        success: function(restaurants){
            for(restaurant of restaurants){
                
                let template = '<li><a href="restaurant.html?name='+ restaurant.name +'">'+ restaurant.name +'</a></li>';
                document.getElementById("S_List").innerHTML += template;
            }
        },
        error: function(error){
            console.log(error);
            alert("failed to sort restaurants")
        }
    })
}



function filtertype(type){

    document.getElementById("S_List").innerHTML = " ";

    $.ajax({
        type: "GET",
        url: "http://localhost:8085/api/get/type/" + type,
        success: function(restaurants){
            for(restaurant of restaurants){
                let template = '<li><a href="restaurant.html?name='+ restaurant.name +'">'+ restaurant.name +'</a></li>';
                document.getElementById("S_List").innerHTML += template;
            }
        },
        error: function(error){
            console.log(error);
            alert("failed to sort restaurants")
        }
    })
}



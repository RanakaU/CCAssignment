function CreateProfile(){
    let userdata = 
    {
        name : document.getElementById("name").value,
        email : document.getElementById("email").value,
        address : document.getElementById("address").value,
        description : document.getElementById("description").value,
        cuisine : document.getElementById("cuisine").value,
        type : document.getElementById("type").value,
        specialoffers : document.getElementById("special_offers").value,
        number : document.getElementById("contactno").value,
        website : document.getElementById("website").value

    }

    console.log(document.getElementById("special_offers").value)


    $.ajax({
        type : "POST",
        url : "http://localhost:8085/api/createRprofile",
        headers:
        {
            "Content-Type" : "application/json"
        },
        data : JSON.stringify(userdata),
        success : function(response){
            alert("Your profile has been created")
        },
        error : function(error){
            console.log(error);
            alert("An error has occured while creating your profile")
        }
    })
}





function loadprofile(){
    let useremail = sessionStorage.getItem("currentuser");

    $.ajax({
        type : "GET",
        url : "http://localhost:8085/api/getRprofile/" + useremail,
        headers : 
        {
            "Content-Type" : "application/json"
        },
        success:function(response){


            if(useremail != null){
                document.getElementById("name").innerHTML = response.name;
                document.getElementById("description").innerHTML = response.description;
                document.getElementById("type").innerHTML = response.type;
                document.getElementById("address").innerHTML = response.address;
                document.getElementById("number").innerHTML = response.number;
                document.getElementById("cuisine").innerHTML = response.cuisine;
                document.getElementById("website").href = response.website;
    
            }
            else{
                document.getElementById("name").innerHTML = "Please create your profile";
            }



        },
        error: function(error){
            console.log(error);
            alert("something went wrong when loading your profile")
        }



    })
}





function loadRMenu(){
    let useremail = sessionStorage.getItem("currentuser");


    $.ajax({
        type: "GET",
        url: "http://localhost:8085/api/getRmenu/" + useremail,
        headers:
        {
            "Content-Type" : "application/json"
        },
        success:function(response){
    
            document.getElementById("item1").innerHTML = response.item1;
            document.getElementById("item2").innerHTML = response.item2;
            document.getElementById("item3").innerHTML = response.item3;
            document.getElementById("item4").innerHTML = response.item4;
            document.getElementById("item5").innerHTML = response.item5;
            

        },
        error:function(error){
            console.log(error);
            alert("something went wron when loading your menu")
        }
    })
}
function greeting(){
    console.log("hej");
}

function checkjQuery(){
    if(typeof jQuery != undefined){
        console.log("jQuery er loaded");
    }
    else{
        console.log("jQuery er IKKE loaded");
    }
}

function preventAddForm(addform){
    addform.submit(function (event){
        event.preventDefault();
        addUser($("#username").val());
        console.log("submit er trykket");
    });
}

function addUser(userName){
    console.log("addUser er kaldet med " + userName);

    var addObject = {};
    addObject["username"] = userName;
    $.ajax({
            url:"/api/addUser",
            type:"POST",
            contentType:"application/JSON",
            data: JSON.stringify(addObject),
            success:function(data){
                console.log("SUCCESS svar fra server");
                $("#status").html(data);
            },
            error: function(data){
                console.log("ERROR ingen svar fra server");
                $("#status").html("ERROR ingen svar fra server");
            }
        });



}
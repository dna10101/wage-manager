$("button").click(function(){
    console.log("hahah");
    console.log($("#loginForm").serialize());
    $.post("/loginCheck",
        $("#loginForm").serialize(),
        // {
        //     id:"20180902",
        //     password:"zhang"
        // },
        function(data,status){
            console.log(status);
            console.log("niaho");
            console.log(data);
            alert("status:"+data["status"]+"  date:"+data["date"]);
            var isSuccess = data["status"];
            if(isSuccess==0){
                //失败
                $("#add").text(data["date"]);
            }else{
                window.location.href = "admin.html";
            }
        });
});
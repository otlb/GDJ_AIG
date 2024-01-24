console.log("join check");

// const password = document.getElementById("password");
// const passwordResult = document.getElementById("passwordResult");
// const passwordCheck = document.getElementById("passwordCheck");
// const passwordCheckResult = document.getElementById("passwordCheckResult");
// const btn = document.getElementById("submitButton");
// const name1 = document.getElementById("name");



// let p1 = false; //password 체크
// let p2 = false; //passwordCheck 체크 

// btn.addEventListener("click",function(){
//     if(p1 && p2){
//         alert("OK");
//     }else{
//         alert("NO");
//     }

// });

// password.addEventListener("blur",function(){
//     let p = password.value;    
//     if(p.length > 7){
//         passwordResult.innerText="OK"
//          p1 =true;
//     }else{
//         passwordResult.innerHTML="비밀번호는 8글자 이상이여야 합니다"
//          p1 = false;
//     }     
// });

// passwordCheck.addEventListener("keyup",function(){
//     let p = password.value;
//     let pc = passwordCheck.value;

//     if(p == pc){
//         passwordCheckResult.innerHTML="일치";
//          p2 = true;
//     }else{
//         passwordCheckResult.innerHTML="불일치";
//          p2 = false;
//     }
// });









/// jquery
let checks ={p1:false, p2:false}

$('#submitButton').click(function(){
    let flag=true;
    for(p in checks){
        console.log(p);
        console.log(checks[p])
        if(!checks[p]){
           flag=false;
           break;
        }
    }

    if(flag){
        alert('ok');
    }else {
        alert('No-----------');
    }

    if($('#name').val().length==0){
        alert('name no');
    }else{
        alert('name ok');
    }
    if($('#sample6_address').val().length==0){
        alert('address no');
    }else{
        alert('address ok');
    }
    if($('#email').val().length==0){
        alert('email no');
    }else{
        alert('email ok');
    }
    if($('#phone').val().length==0){
        alert('phone no');
    }else{
        alert('phone ok');
    }
})

$('#password').blur(function(){
    if($('#password').val().length>7){
        $('#passwordResult').html('OK');
        checks.p1=true;
    }else {
        $('#passwordResult').html('비번은 8글자 이상 이어야 함');
        checks.p1=false;
    }

    $('#passwordCheck').val('');
    checks.p2=false;
    $('#passwordCheckResult').html('');


});

$('#passwordCheck').keyup(function(){
    if($('#passwordCheck').val()==$('#password').val()){
        $('#passwordCheckResult').html('일치 한다')
        checks.p2=true;
    }else {
        $('#passwordCheckResult').html('일치하지 않는다')
        checks.p2=false;
    }

});

$('#userName').blur(function(){        
    fetch("./idCheck?userName="+$('#userName').val(),{
        method:"GET"        
    })
    .then(res=>res.text())
    .then((res)=>{
        if(res==0){
            alert("중복된 아이디입니다")
        }else{
            alert("사용 가능한 아이디입니다")
        }
    }) 
    
});
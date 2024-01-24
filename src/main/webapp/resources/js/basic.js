// //js
// const b1 = document.getElementById("b1");
// const b2 = document.querySelector("#b2");

// b1.addEventListener("click",function(){

// })
// //b1의 컨텐츠 변경 
// let v = b1.innerHTML;
// b1.innerHTML='test';

// //속성가지고오기,변경하기
// b1.getAttribute("속성명");
// b1.getAttribute("속성명","값");

// b1.value

// //jquery
// //$("선택자").action()
// $("#b1").click(function(){

// });

// $("#b2").on("click",function(){

// });

// //b1 컨텐츠 변경
// $("#b1").html("test");

// //속성가지고오기, 변경하기
// $("#b1").attr("속성명");       
// $("#b1").attr("속성명","값");

// //속성값들이 바뀌는 것들은 prop 사용 
// $("b1").prop("속성명");
// $("b1").prop("속성명","값");

// //value 가지고오기
// $("#b1").val();
// $("#b1").val("값");


// let btn = document.getElementById("btn");
// let btn2 = document.getElementById("btn2");

// btn2.addEventListener("click",function(){
//    let t = document.getElementById("title").value;
//    let c = document.getElementById("contents").value;

//    fetch("/notice/add",{
//     method:"POST",
//     headers:{
//         "Content-type":"application/x-www-form-urlencoded"
//     },
//     body:"boardName="+t+"boardContents"+c
//    })
//    .then(response=>response.text())
//    .then(response=> console.log(response));
// });

// btn.addEventListener("click",function(){
//     console.log("Ajax 시작");

//     fetch("/notice/list",{
//         method:"GET"
//     })
//     .then(response=>response.text())
//     .then((res)=>{
//         document.getElementById("result").innerHTML = res;
//     })
    
//     ;


//     console.log("Ajax 끝");
// });
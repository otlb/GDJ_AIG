const update = document.getElementById("update");
const del = document.getElementById("delete");
const frm = document.getElementById("frm");




update.addEventListener("click",function(e){
    e.preventDefault();
    frm.submit();
})

del.addEventListener("click",function(e){
    e.preventDefault();
    frm.setAttribute("action","./delete");
    frm.setAttribute("method","post");
    frm.submit();
})

$('#wish').click(function(){ 
    // let answer;
    // answer = confirm("찜목록으로 이동하겠습니까?")

    // fetch("/account/wish?productNum="+productNum.innerText,{
    //     method:"GET"        
    // })
    // .then(res=>res.text())
    // .then((res)=>{
    //     if(res==1){
    //         if(answer == true){
    //             location.href = "../account/wishList" //list 목록 url
    //         }
    //     }else if(res==0){
    //         alert("찜하지 못했습니다.")
    //     }
    // }) 

    let answer;
    answer = confirm("찜목록으로 이동하겠습니까?")
    $.ajax({
        url:"/account/wish",
        method:"GET",
        data:{
            productNum : productNum.innerText
        },

        success:function(res){
            if(answer == true){
                location.href = "../account/wishList" //list 목록 url
            }      
        },
        error:function(){
            alert("찜하지 못했습니다.")
        }

    })
    
});




const replyAdd = document.getElementById("replyAdd");
const replyForm = document.getElementById("replyForm");
const productNum = document.getElementById("productNum");
const more = document.getElementById("more");
const replyList = document.getElementById("replyList");


replyList.addEventListener("click",function(e){

    if(e.target.getAttribute("id")=='more'){
        let p = e.target.getAttribute("data-replyList-page");
        alert(p*1+1)

        fetch("../reply/list?productNum="+productNum.innerText+"&page="+(p*1+1),{
            method:"GET",
            })
            .then(r=>r.text())
            .then(r=>document.getElementById("replyList").innerHTML=r)
    }
   
})

fetch("../reply/list?productNum="+productNum.innerText,{
    method:"GET",
    })
    .then(r=>r.text())
    .then(r=>document.getElementById("replyList").innerHTML=r)
   

//replyAdd(Fetch 사용)
replyAdd.addEventListener("click",function(){
    const replyForm = document.getElementById("replyForm");
    let form = new FormData(replyForm);
    fetch("../reply/add",{
        method:"POST",
        body:form
    })
    .then(res=>res.text())
    .then(res=>{
        $("#replyList").html(res);
        replyForm.reset();
    })    

});




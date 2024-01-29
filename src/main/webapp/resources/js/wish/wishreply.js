const replyAdd = document.getElementById("replyAdd");
const replyForm = document.getElementById("replyForm");
const productNum = document.getElementById("productNum");
const more = document.getElementById("more");
const replyList = document.getElementById("replyList");



getReplyList(1,productNum.innerText)
more.addEventListener("click",function(){
    let p = more.getAttribute("data-replyList-page");
    let a = more.getAttribute("data-replyList-totalPage");
    if(p>a){
        alert("마지막페이지입니다.")
    }

    getReplyList(p,productNum.innerText)

})

function getReplyList(page,num){
    fetch("../reply/list?page"=page+"&productNum="+num,{
        method:"GET"
    })
    .then(r=> r.json())
    .then(r=>{
        makeList(r);
    })
}

function makeList(r){
    more.setAttribute("data-replyList-page",r.pager.page*1+1)
    more.setAttribute("data-replyList-totalPage",r.pager.totalPage)
    let userName = replyList.getAttribute("data-user");
    r=r.datas;
    for(let i = 0;i<r.length;i++){
    let tr = document.createElement("tr");
    let td = document.createElement("td");
    td.innerHTML=r[i].replyContents;
    tr.append(td)

    td = document.createElement("td");
    td.innerHTML=r[i].userName;
    tr.append(td)

    td = document.createElement("td");
    let d = new Date(r[i].replyDate)
    td.innerHTML = d.getFullYear()+"."+(d.getMonth()+1)+"."+d.getDate()
    td.innerHTML=r[i].replyDate;
    tr.append(td)

    replyList.append(tr);
    }

}


//replyAdd(Fetch 사용)
replyAdd.addEventListener("click",function(){
    const replyForm = document.getElementById("replyForm");
    let form = new FormData(replyForm);
    fetch("../reply/add",{
        method:"POST",
        body:form
    })
    .then(res=>res.json())
    .then(res=>{
        replyList.innerHTML="";
        makeList(res);
        replyForm.reset();
    })    

});







console.log("확인");

/* <div class="input-group mb-3">
        <input type="file" name="attachs" class="form-control">
        <span class="input-group-text text-danger">X</span>
    </div> */
//---------------------------js
// const filelist = document.getElementById("filelist");
// const fileAdd = document.getElementById("fileAdd");
// const del = document.getElementsByClassName("del")
// let count = 0;
// let max = 5;

// filelist.addEventListener("click",(e)=>{ //부모한테 클릭 이벤트 

//     if(e.target.classList.contains('del')){ // 클릭 타겟(del클래스를 가진) 적용하기 
//        // e.target.parentNode.remove();
       
//        let id = e.target.getAttribute("data-file-id");
//        document.getElementById(id).remove();
//        count--;
//     }

// });

// let idx=0;

// fileAdd.addEventListener("click",function(){ 
//     if(count>=max){
//                  alert("파일5개까지")
//                  return;
//              }      
//              count++;  

//     idx++;
      
//     let div = document.createElement("div");
//     let class1 = document.createAttribute("class");
//     class1.value="input-group mb-3";
//     div.setAttributeNode(class1);   
//     //id 추가  
//     class1 = document.createAttribute("id");
//     class1.value ="file"+idx;
//     div.setAttributeNode(class1);   
    
//     let input = document.createElement("input");
//     let type = document.createAttribute("type");
//     type.value="file";
//     let name1 = document.createAttribute("name");
//     name1.value = "attachs";
//     class1 = document.createAttribute("class");
//     class1.value= "form-control";
//     input.setAttributeNode(type);
//     input.setAttributeNode(name1);
//     input.setAttributeNode(class1);
//     div.appendChild(input);

//     let span = document.createElement("span");
//     let text = document.createTextNode("X");
//     class1 = document.createAttribute("class");
//     class1.value = "input-group-text text-danger del";
//     span.appendChild(text);
//     span.setAttributeNode(class1);
//     div.appendChild(span);

//     class1 = document.createAttribute("data-file-id");
//     class1.value="file"+idx;
//     span.setAttributeNode(class1);    
   
//     filelist.appendChild(div);    
   
// });


//--------jquery
count = $("#filelist").attr("data-file-count");
max = $("#filelist").attr("data-file-max");

$("#filelist").on("click",".del",function(){
    $(this).parent().remove();
    count--;
});



$("#fileAdd").click(function(){ 
    if(count>=max){
        alert("파일5개까지")
        return;
    }      
    count++;
    let element = '<div class="input-group mb-3"><input type="file" name="attachs" class="form-control"><span class="input-group-text text-danger del">X</span></div>'

    $('#filelist').append(element);


});

$(".del").click(function(){
    alert("del 클릭");

})